package Platforma.Echipa;


import Platforma.GenMuzica;

import java.util.Scanner;

public class Artisti extends GenMuzica {
    private String nume;
    GenMuzica gen = new GenMuzica();

    public Artisti() {
        this.nume = nume;
    }
    public Artisti(String nume, GenMuzica gen) {
        super(gen);
        this.nume = nume;
    }
    public Artisti(Artisti artist) {
        this.nume = artist.nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public GenMuzica getGen() {
        return gen;
    }

    public void setGen(GenMuzica gen) {
        this.gen = gen;
    }
}
