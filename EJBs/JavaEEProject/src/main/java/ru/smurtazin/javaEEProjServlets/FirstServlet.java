package ru.smurtazin.javaEEProjServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by a1 on 06.04.17.
 */
@WebServlet(name = "FirstServlet", urlPatterns = { "/hello", "/a/b/c"} )
public class FirstServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
                "</html>");

        out.flush();
    }
}
