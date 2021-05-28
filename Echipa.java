package Platforma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Echipa extends Artisti {
    private String nume;
    private int buget;
    Artisti artist = new Artisti();
    private Connection jdbcConnection;

    protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(nume, buget);
        }
    }

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

    public String getBuget() {
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

    public boolean insertEchipa(Echipa echipa) throws SQLException {
        String sql = "INSERT INTO echipa (nume, buget) VALUES (?, ?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, echipa.getNume());
        statement.setString(2, echipa.getBuget());

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
    public boolean deleteEchipa(Echipa echipa) throws SQLException {
        String sql = "DELETE FROM echipa where nume = ?";
        connect();
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, echipa.getNume());

        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
    }

    public boolean updateEchipa(Echipa echipa) throws SQLException {
        String sql = "UPDATE echipa SET buget = ?";
        sql += " WHERE nume = ?";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, echipa.getNume());
        statement.setString(2, echipa.getBuget());

        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;
    }
}
