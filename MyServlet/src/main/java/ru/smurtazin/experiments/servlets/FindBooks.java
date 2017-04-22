package ru.smurtazin.experiments.servlets;

/**
 * Created by a1 on 26.03.17.
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindBooks
 */
//@WebServlet(description = "The servlet that searches for books", urlPatterns = { "/books" }, name="FindBooks")
@WebServlet(urlPatterns = { "/books" }, name="FindBooks")
public class FindBooks extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    /*public FindBooks() {
        super();
        // TODO Auto-generated constructor stub
    }*/

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*// Get or create the session
        request.getSession(true);

        PrintWriter out = response.getWriter();
        out.println("<html><body bgcolor=yellow>");
        out.println("<h2>Hello from FindBooks</h2>");

        //Destroy the session
        request.getSession(true).invalidate();*/
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "\t<title>Servlet 2 Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h1>HALLAW EVERYBADY</h1>" +
            "\tLorem ipsum dolor sit amet, consectetur adipisicing elit. " +
            "Mollitia repellat quibusdam voluptatum, dicta incidunt " +
            "consectetur molestias doloribus maxime repudiandae assumenda aut, " +
            "excepturi nihil sequi in eos natus perspiciatis nostrum. Quo.\n" +
            "</body>\n" +
            "</html>"
        );
        out.flush();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }*/

}
