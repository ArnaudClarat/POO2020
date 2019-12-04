package be.ifosupwabre.info.poo.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_test", urlPatterns = {"/test"})
public class Servlet_test extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récuperation des données de l'url
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");

        // Ajout à l'envoi
        request.setAttribute("nom", nom);
        request.setAttribute("prenom", prenom);

        request.getRequestDispatcher("views/test.jsp").forward(request, response);
    }
}
