package be.ifosupwabre.info.poo.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_Hello", urlPatterns = {"/hello"})
public class Servlet_Hello extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Définition du type de contenu
        response.setContentType("text/html");

        // Définition du flux de sortie
        PrintWriter sortie = response.getWriter();

        // Écriture dans le flux
        sortie.println("<h1>Hello les programmeurs! </h1>");

        // Vider le flux vers la sortie
        sortie.flush();
    }
}
