package Platforma;

public class Clienti extends Bilet{
    private int idClient;
    private String clientName;
    private String phoneNumber;
    Bilet bilet = new Bilet();

    public Clienti() {
        this.idClient = idClient;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
        this.bilet = bilet;
    }

    public Clienti(Bilet bilet, int idClient, String clientName, String phoneNumber) {
        this.bilet = bilet;
        this.idClient = idClient;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }
    public Clienti(int idClient, String clientName, String phoneNumber) {
        this.idClient = idClient;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }


    public Clienti(int pret, int idBilet, int idClient, String clientName, String phoneNumber) {
        super(pret, idBilet);
        this.idClient = idClient;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }

    public Clienti(Evenimente event, int pret, int idBilet, int idClient, String clientName, String phoneNumber) {
        super(event, pret, idBilet);
        this.idClient = idClient;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }

    public Clienti(Boolean caritate, Locatie locatie, int pret, int idBilet, int idClient, String clientName, String phoneNumber) {
        super(caritate, locatie, pret, idBilet);
        this.idClient = idClient;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }

    public Clienti(Echipa echipa, String tara, String oras, Boolean caritate, int pret, int idBilet, int idClient, String clientName, String phoneNumber) {
        super(echipa, tara, oras, caritate, pret, idBilet);
        this.idClient = idClient;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }

    public Clienti(Locatie locatie, Boolean caritate, int pret, int idBilet, int idClient, String clientName, String phoneNumber) {
        super(locatie, caritate, pret, idBilet);
        this.idClient = idClient;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }

    public Clienti(Artisti artist, String sume, int buget, String tara, String oras, Echipa echipa, Boolean caritate, int pret, int idBilet, int idClient, String clientName, String phoneNumber) {
        super(artist, sume, buget, tara, oras, echipa, caritate, pret, idBilet);
        this.idClient = idClient;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }

    public Clienti(GenMuzica gen, String nume, String sume, int buget, Artisti artist, String tara, String oras, Echipa echipa, Boolean caritate, int pret, int idBilet, int idClient, String clientName, String phoneNumber) {
        super(gen, nume, sume, buget, artist, tara, oras, echipa, caritate, pret, idBilet);
        this.idClient = idClient;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Bilet getBilet() {
        return bilet;
    }

    public void setBilet(Bilet bilet) {
        this.bilet = bilet;
    }
}

