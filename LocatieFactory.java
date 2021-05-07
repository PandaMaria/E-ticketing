package Platforma;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class LocatieFactory {
     private static int uniqueId = 0;

     public static void incrementUniqueId(int inc) {
         LocatieFactory.uniqueId += inc;
     }

     public Locatie createLocatie(Scanner in) throws ParseException {
         return new Locatie(uniqueId++, in);
     }
}
