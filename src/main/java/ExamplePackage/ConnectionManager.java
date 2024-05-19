package ExamplePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public static Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Add useSSL=false and allowPublicKeyRetrieval=true to the JDBC URL
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/auth_jee?useSSL=false&allowPublicKeyRetrieval=true","root","Nisrine1472359@");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("SQL Server JDBC Driver not found", e);
        }
        return con;
    }
}
