package Platforma;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String host = "jdbc:derby://localhost:58852/mariadb";
            String uName = "root";
            String uPass= " iomacova ";
        }
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }


        GenMuzica rock = new GenMuzica("rock");
        GenMuzica indie = new GenMuzica("indie");
        Artisti Aurora = new Artisti("Aurora", indie);
        Artisti Jona = new Artisti("Jona", rock);
        Echipa echipa1 = new Echipa(Aurora, "Echipa Aurora" ,13000);
        Echipa echipa2 = new Echipa(Jona,  "Echipa Jona", 12000);
        Locatie NewYork = new Locatie(echipa1, "SUA", "New York");
        Locatie LA = new Locatie(echipa2, "SUA", "LA");
        Evenimente event1 = new Evenimente(true, NewYork);
        Evenimente event2 = new Evenimente(false, LA);
        Bilet bilet1 = new Bilet(event1, 2000, 11);
        Bilet bilet2 = new Bilet(event2, 1200, 12);
        Clienti Mara = new Clienti(bilet1,1, "Mara", "1000202353");
        Clienti Iona = new Clienti(bilet2,2, "Iona", "1056202353");

        List<Clienti> clienti = new ArrayList<>();
        listClienti(clienti, Mara);
        listClienti(clienti, Iona);
        System.out.println(showClienti());

        protected List<Bilet> bilete = new ArrayList<>();
        listBilete(bilete, bilet1);
        listBilete(bilete, bilet2);
        System.out.println(showBilete());
        System.out.println(Mara.getPhoneNumber());
        System.out.println(Iona.getBilet());
        System.out.println(bilet1.getEvent());
        System.out.println(NewYork.getTara());
        System.out.println(LA.getOras());
        System.out.println(indie.getGenMuzical());
        System.out.println(Aurora.getNume());
        System.out.println(echipa2.getBuget());
        System.out.println(Iona.getClientName());

    }

}
