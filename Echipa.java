package Platforma;

import Platforma.Artisti;
import Platforma.GenMuzica;

public class Echipa extends Artisti {
    private String nume;
    private int buget;
    Artisti artist = new Artisti();

    public Echipa() {
        this.artist = artist;
        this.nume = nume;
        this.buget = buget;
    }

    public Echipa(Artisti artist, String nume, int buget) {
        super(artist);
        this.nume = nume;
        this.buget = buget;
    }

    public Echipa(String field, int parseInt, String field1, String field2) {
    }

    public Echipa(String name, int buget, int buget1) {
    }

    public Echipa(String field, int parseInt) {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getBuget() {
        return buget;
    }

    public void setBuget(int buget) {
        this.buget = buget;
    }

    public Artisti getArtist() {
        return artist;
    }

    public void setArtist(Artisti artist) {
        this.artist = artist;
    }
    
}
