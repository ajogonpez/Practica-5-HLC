package paqueteServlets;

import Controlador.Conexion;
import Controlador.Operaciones;
import Modelo.Comic;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author indes
 */
@WebServlet(name = "ListarArticulos", urlPatterns = {"/ListarArticulos"})
public class ListarArticulos extends HttpServlet {
    public static Connection con;
    private static ArrayList<Comic> com;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            establecerConexion();
            com = Operaciones.getComic();
        } catch (SQLException ex) {
            Logger.getLogger(ServletListadoArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (PrintWriter out = response.getWriter()) {
            for(int i=0;i<com.size();i++){
                Comic c = com.get(i);
                out.println("<div class=\"col-md-2\">");
                out.println("<div class=\"card text-center\">");
                out.println("<div class=\"card-block\">");
                out.println("<img class=\"preview-img\" src=\"Imagenes/" + c.getImagen() + "\" alt=\"Preview Image\" width=\"100\" height=\"150\"/>");
                out.println("<p> Titulo: " + c.getTitulo() + "</p>");
                out.println("<p> Edicion: " + c.getEdicion()+ "</p>");
                out.println("<p> Fecha de Salida:<br>" + c.getFechaSalida()+ "</p>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                
            }
        }
    }

    public static void establecerConexion() throws SQLException
    {
        con = Conexion.getConnection();
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
