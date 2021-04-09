package Platforma;

import Platforma.Echipa.Artisti;
import Platforma.Echipa.Echipa;

import java.util.Scanner;

public class Locatie extends Echipa {
    private String tara;
    private String oras;
    Echipa echipa = new Echipa();

    public Locatie() {
        this.echipa = echipa;
        this.tara = tara;
        this.oras = oras;
    }

    public Locatie(Echipa echipa, String tara, String oras) {
        this.echipa = echipa;
        this.tara = tara;
        this.oras = oras;
    }
    public Locatie(Locatie locatie) {
        this.echipa = echipa;
        this.tara = locatie.tara;
        this.oras = locatie.oras;
    }

    public Locatie(Artisti artist, String sume, int buget, String tara, String oras, Echipa echipa) {
        super(artist, sume, buget);
        this.tara = tara;
        this.oras = oras;
        this.echipa = echipa;
    }

    public Locatie(GenMuzica gen, String nume, String sume, int buget, Artisti artist, String tara, String oras, Echipa echipa) {
        super(gen, nume, sume, buget, artist);
        this.tara = tara;
        this.oras = oras;
        this.echipa = echipa;
    }

    public Locatie(String tara, String oras) {
        this.tara = tara;
        this.oras = oras;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }
}
