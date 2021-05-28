package Platforma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GenMuzica {
    private String genMuzical;
    private Connection jdbcConnection;

    protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(genMuzical);
        }
    }

    public GenMuzica() {
        this.genMuzical = genMuzical;
    }

    public GenMuzica(GenMuzica gen) {
        this.genMuzical = gen.genMuzical;
    }

    public GenMuzica(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    public GenMuzica(String gen, int i) {
    }

    public String toCSV() {
        return genMuzical;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }


    public boolean insertGen(GenMuzica gen) throws SQLException {
        String sql = "INSERT INTO gen (gen) VALUES (?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, gen.getGenMuzical());

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
    public boolean deleteGen(GenMuzica gen) throws SQLException {
        String sql = "DELETE FROM gen where genMuzica = ?";
        connect();
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, gen.genMuzical());

        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
    }

    public boolean updateGen(GenMuzica gen) throws SQLException {
        String sql = "UPDATE gen SET gen = ?";
        sql += " WHERE nume = ?";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, gen.getGenMuzical());

        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;
    }
}
