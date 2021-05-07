package Platforma;


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

    public Artisti(String nume, String gen) {

    }

    public Artisti(String name, int i) {
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

    public String toCSV() {
        return nume +
                "," + gen;
    }

    public Artisti(String genMuzical, String nume, GenMuzica gen) {
        super(genMuzical);
        this.nume = nume;
        this.gen = gen;
    }
}
