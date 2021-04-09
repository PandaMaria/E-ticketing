package Platforma.Echipa;

import Platforma.GenMuzica;

import java.util.Scanner;

public class Echipa extends Artisti{
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

    public Echipa(GenMuzica gen, String nume, String nume1, int buget, Artisti artist) {
        super(gen, nume);
        this.nume = nume1;
        this.buget = buget;
        this.artist = artist;
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
