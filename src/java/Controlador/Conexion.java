package Controlador;

import java.sql.*;

public class Conexion {
    
    public static Conexion con = new Conexion();
    
    private Conexion()
    {}
    
    public static Connection getConnection() throws SQLException
    {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("ERROR: exception loading driver class");
        }
        
        String url = "jdbc:derby://localhost:1527/sample";
        return DriverManager.getConnection(url, "app", "app");
    }
    
    public static void close(ResultSet rs)
    {
        try {
            rs.close();
        } catch (Exception ignored) {}
    }
    
    public static void close(Statement stmt)
    {
        try {
            stmt.close();
        } catch (Exception ignored) {}
    }
    
    public static void close(Connection con)
    {
        try {
            con.close();
        } catch (Exception ignored) {}
    }
    
}