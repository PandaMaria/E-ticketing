package Platforma;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Artisti extends GenMuzica {
    private String nume;
    GenMuzica gen = new GenMuzica();
    private Connection jdbcConnection;

    protected void connect() throws SQLException {
    if (jdbcConnection == null || jdbcConnection.isClosed()) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
          throw new SQLException(e);
        }
        jdbcConnection = DriverManager.getConnection(nume, gen);
    }
    }


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


    public boolean insertArtist(Artisti artist) throws SQLException {
        String sql = "INSERT INTO artist (nume, gen) VALUES (?, ?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, artist.getNume());
        statement.setString(2, artist.getGen());

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
    public boolean deleteArtist(Artisti artist) throws SQLException {
        String sql = "DELETE FROM artist where nume = ?";
        connect();
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, artist.getNume());

        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
    }

    public boolean updateArtist(Artisti artist) throws SQLException {
        String sql = "UPDATE artist SET gen = ?";
        sql += " WHERE nume = ?";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, artist.getNume());
        statement.setString(2, artist.getGen());

        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;
    }
}
