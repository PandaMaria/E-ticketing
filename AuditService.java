package Platforma;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AuditService {
    FileWriter writer;

    final DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void logAction(String actiune) throws IOException {
        writer.append(actiune);
        writer.append(",");
        writer.append(form.format(LocalDateTime.now()));
        writer.append("\n");
        writer.flush();
    }


    public AuditService() {
        try{
            this.writer = new FileWriter("data/audit.csv");
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}