package Platforma;

import Platforma.Echipa.Artisti;
import Platforma.Echipa.Echipa;

import java.util.ArrayList;
import java.util.List;

public class Service {

    protected List<Bilet> bilete = new ArrayList<>();

    public void listBilete(List<Bilet> bilete, Bilet bilet) {
        bilete.add(bilet);
    }

    public List<Bilet> showBilete(List<Bilet> bilete){
        return bilete;
    }

    protected List<Clienti> clienti = new ArrayList<>();

    public void listClienti(List<Clienti> clienti , Clienti client){
        clienti.add(client);
    }

    public List<Clienti> showClienti(List<Clienti> clienti){
        return clienti;
    }

}
