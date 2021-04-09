package Platforma;

import Platforma.Echipa.Artisti;
import Platforma.Echipa.Echipa;

public class Evenimente extends Locatie{
    private Boolean caritate;
    Locatie locatie = new Locatie();

    public Evenimente() {
        this.caritate = caritate;
        this.locatie = locatie;
    }

    public Evenimente(Boolean caritate, Locatie locatie) {
        this.caritate = caritate;
        this.locatie = locatie;
    }

    public Evenimente(Echipa echipa, String tara, String oras, Boolean caritate) {
        super(echipa, tara, oras);
        this.caritate = caritate;
    }

    public Evenimente(Locatie locatie, Boolean caritate) {
        super(locatie);
        this.caritate = caritate;
    }

    public Evenimente(Artisti artist, String sume, int buget, String tara, String oras, Echipa echipa, Boolean caritate) {
        super(artist, sume, buget, tara, oras, echipa);
        this.caritate = caritate;
    }

    public Evenimente(GenMuzica gen, String nume, String sume, int buget, Artisti artist, String tara, String oras, Echipa echipa, Boolean caritate) {
        super(gen, nume, sume, buget, artist, tara, oras, echipa);
        this.caritate = caritate;
    }

    public Boolean getCaritate() {
        return caritate;
    }

    public void setCaritate(Boolean caritate) {
        this.caritate = caritate;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }
}
