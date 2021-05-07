package Platforma;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.AccessControlContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ArtistiSingleton {
    private static ArtistiSingleton single_instance = null;

    private List<Artisti> artisti = new ArrayList<Artisti>();

    public static ArtistiSingleton getInstance()
    {
        if (single_instance == null)
            single_instance = new ArtistiSingleton();
        return single_instance;
    }

    public void setArtisti(List<Artisti> artisti) {
        this.artisti = artisti;
    }

    public List<Artisti> getArtisti() {
        return artisti;
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
            System.out.println("No saved artists!");
        }

        return columns;
    }

    public void loadFromCSV() {
        var columns = ArtistiSingleton.getCSVColumns("data/artisti.csv");
        for(var fields : columns){
            var newArtist = new Artisti(
                    fields[0],
                    fields[1]
            );
            artisti.add(newArtist);
        }
    }

    public void dumpToCSV(){
        try{
            var writer = new FileWriter("data/asrtisti.csv");
            for(var artist : this.artisti){
                writer.write(artist.toCSV());
                writer.write("\n");
            }
            writer.close();
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }

}
