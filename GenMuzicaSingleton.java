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

public class GenMuzicaSingleton {

        private static GenMuzicaSingleton single_instance = null;

        private List<GenMuzica> genuri = new ArrayList<GenMuzica>();

        public static GenMuzicaSingleton getInstance()
        {
            if (single_instance == null)
                single_instance = new GenMuzicaSingleton();
            return single_instance;
        }

        public void setGenuri(List<GenMuzica> genuri) {
            this.genuri = genuri;
        }

        public List<GenMuzica> getGenuri() {
            return genuri;
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
                System.out.println("No saved genres!");
            }

            return columns;
        }

        public void loadFromCSV() {
            var columns = GenMuzicaSingleton.getCSVColumns("data/genuri.csv");
            for(var fields : columns){
                var newGen = new GenMuzica(
                        fields[0]
                );
                genuri.add(newGen);
            }
            GenMuzicaFactory.incrementUniqueId(columns.size());
        }

        public void dumpToCSV(){
            try{
                var writer = new FileWriter("data/genuri.csv");
                for(var gen : this.genuri){
                    writer.write(gen.toCSV());
                    writer.write("\n");
                }
                writer.close();
            }catch (IOException e){
                System.out.println(e.toString());
            }
        }
}
