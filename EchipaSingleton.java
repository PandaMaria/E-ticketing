package Platforma;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EchipaSingleton {

    private static EchipaSingleton single_instance = null;

    private List<Echipa> echipe = new ArrayList<Echipa>();

    public static EchipaSingleton getInstance()
    {
        if (single_instance == null)
            single_instance = new EchipaSingleton();
        return single_instance;
    }

    public void setEchipe(List<Echipa> echipe) {
        this.echipe = echipe;
    }

    public List<Echipa> getEchipe() {
        return echipe;
    }

    private static List<String[]> getCSVColumns(String fileName){
            List<String[]> columns = new ArrayList<>();

            try(var in = new BufferedReader(new FileReader(fileName))) {

                String line;

                while((line = in.readLine()) != null ) {
                    String[] fields = line.replaceAll(" ", "").split(",");
                    columns.add(fields);
                }
            } catch (IOException e) {
                System.out.println("No saved teams!");
            }

            return columns;
    }

    public void loadFromCSV() {
        var columns = EchipaSingleton.getCSVColumns("data/echipe.csv");
        for(var fields : columns){
            var newEchipa = new Echipa(
                    fields[0],
                    Integer.parseInt(fields[1])
            );
            echipe.add(newEchipa);
        }
        EchipaFactory.incrementUniqueId(columns.size());
    }

    public void dumpToCSV(){
        try{
            var writer = new FileWriter("data/echipe.csv");
            for(Echipa echipa : this.echipe){
                writer.write(echipa.toCSV());
                writer.write("\n");
            }
            writer.close();
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
