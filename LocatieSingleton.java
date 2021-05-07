package Platforma;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class LocatieSingleton {
    private static LocatieSingleton single_instance = null;
    final private LocatieSingleton locatieFactory = new LocatieSingleton();
    private List<Locatie> locatii = new ArrayList<Locatie>();

    public static LocatieSingleton getInstance()
    {
        if (single_instance == null)
            single_instance = new LocatieSingleton();
        return single_instance;
    }

    public void setLocatii(List<Locatie> locatii) {
        this.locatii = locatii;
    }

    public List<Locatie> getLocatii() {
        return locatii;
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
            System.out.println("No saved locatii!");
        }

        return columns;
    }

    public void loadFromCSV() {
        var columns = LocatieSingleton.getCSVColumns("data/locatii.csv");
        for(var fields : columns){
            var newLocatie = new Locatie(
                    fields[0],
                    fields[1],
                    new Echipa(fields[2], Integer.parseInt(fields[3]), fields[4], fields[5])
            );
            locatii.add(newLocatie);
        }
        LocatieFactory.incrementUniqueId(columns.size());

    }

    public void dumpToCSV(){
        try{
            var writer = new FileWriter("data/locatii.csv");
            for(var locatie : this.locatii){
                writer.write(locatie.toCSV());
                writer.write("\n");
            }
            writer.close();
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }

}
