package Controlador;

import Modelo.Comic;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import paqueteServlets.ListarArticulos;

public class Operaciones {
    
    public static PreparedStatement stmt;
    public static ResultSet rset;
    
    public static ArrayList getComic() throws SQLException
    {
        ArrayList <Comic> c = new ArrayList<>();
        String sql = "SELECT * FROM COMICS";
        stmt = ListarArticulos.con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rset = stmt.executeQuery();
        
        while(rset.next())
        {
            Comic com = new Comic();
            
            com.setTitulo(rset.getString(1));
            com.setEdicion(rset.getInt(2));
            com.setFechaSalida(rset.getDate(3));
            com.setImagen(rset.getString(4));
            
            
            c.add(com);
        }
        
        return c;
    }
}
