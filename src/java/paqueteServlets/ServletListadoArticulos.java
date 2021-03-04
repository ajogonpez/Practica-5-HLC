package paqueteServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author indes
 */
@WebServlet(name = "ServletListadoArticulos", urlPatterns = {"/ServletListadoArticulos"})
public class ServletListadoArticulos extends HttpServlet {
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
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Listado de Comics</title>");
            //Bootstrap
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">");
            out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://code.jquery.com/jquery-3.5.1.js\" integrity=\"sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.6.0/umd/popper.min.js\" integrity=\"sha512-BmM0/BQlqh02wuK5Gz9yrbe7VyIVwOzD1o40yi1IsTjriX/NGF37NyXHfmFzIlMmoSIBXgqDiG1VNU6kB5dBbA==\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\">");
            out.println("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.bundle.min.js\"></script>");
            //Mi CSS
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/styles.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav class=\"navbar navbar-dark bg-primary\">");
            out.println("<a class=\"navbar-brand\" href=\"index.jsp\">Inicio</a>");
            out.println("<button class=\"navbar-toggler collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample01\" aria-controls=\"navbarsExample01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
            out.println("<span class=\"navbar-toggler-icon\"></span>");
            out.println("</button>");
            out.println("<div class=\"navbar-collapse collapse\" id=\"navbarsExample01\" style=\"\">");
            out.println("<ul class=\"navbar-nav mr-auto\">");
            out.println("<li class=\"nav-item active\">");
            out.println("<a class=\"nav-link d-flex align-items-center\" routerLink=\"/backoffice/jobs\" routerLinkActive=\"active\" href=\"ServletListadoArticulos\">");
            out.println("<h3 class=\"my-0\">Lista de Articulos</h3>");
            out.println("</a>");
            out.println("<div class=\"linea\"></div>");
            out.println("</li>");
            out.println("<li class=\"nav-item active\">");
            out.println("<a class=\"nav-link d-flex align-items-center\" routerLink=\"/backoffice/jobs\" routerLinkActive=\"active\" href=\"ServletTablaArticulos\">");
            out.println("<h3 class=\"my-0\">Tabla de Articulos</h3>");
            out.println("</a>");
            out.println("<div class=\"linea\"></div>");
            out.println("</li>");
            out.println("</div>");
            out.println("</nav>");
            //Listado de Articulos
            out.println("<article>");
            out.println("<div class=\"container py-5\">");
            out.println("<div class=\"row\">");
            ListarArticulos.processRequest(request, response);
            out.println("</div>");
            out.println("</div>");
            out.println("</article>");
            out.println("</body>");
            out.println("</html>");
        }
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
