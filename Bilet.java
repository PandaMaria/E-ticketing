package Platforma;

import Platforma.Echipa.Artisti;
import Platforma.Echipa.Echipa;

import java.util.ArrayList;
import java.util.List;

public class Bilet extends Evenimente{
    private int pret;
    private int idBilet;
    Evenimente event = new Evenimente();

    public Bilet() {
        this.event = event;
        this.pret = pret;
        this.idBilet = idBilet;
    }

    public Bilet(int pret, int idBilet) {
        this.pret = pret;
        this.idBilet = idBilet;
    }

    public Bilet(Evenimente event, int pret, int idBilet) {
        this.event = event;
        this.pret = pret;
        this.idBilet = idBilet;
    }

    public Bilet(Boolean caritate, Locatie locatie, int pret, int idBilet) {
        super(caritate, locatie);
        this.pret = pret;
        this.idBilet = idBilet;
    }

    public Bilet(Echipa echipa, String tara, String oras, Boolean caritate, int pret, int idBilet) {
        super(echipa, tara, oras, caritate);
        this.pret = pret;
        this.idBilet = idBilet;
    }

    public Bilet(Locatie locatie, Boolean caritate, int pret, int idBilet) {
        super(locatie, caritate);
        this.pret = pret;
        this.idBilet = idBilet;
    }

    public Bilet(Artisti artist, String sume, int buget, String tara, String oras, Echipa echipa, Boolean caritate, int pret, int idBilet) {
        super(artist, sume, buget, tara, oras, echipa, caritate);
        this.pret = pret;
        this.idBilet = idBilet;
    }

    public Bilet(GenMuzica gen, String nume, String sume, int buget, Artisti artist, String tara, String oras, Echipa echipa, Boolean caritate, int pret, int idBilet) {
        super(gen, nume, sume, buget, artist, tara, oras, echipa, caritate);
        this.pret = pret;
        this.idBilet = idBilet;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getIdBilet() {
        return idBilet;
    }

    public void setIdBilet(int idBilet) {
        this.idBilet = idBilet;
    }

    public Evenimente getEvent() {
        return event;
    }

    public void setEvent(Evenimente event) {
        this.event = event;
    }
}
