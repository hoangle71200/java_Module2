package com.example.demo1;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloGenericServlet", value = "/hello-generic-servlet")
public class FirstGeneric extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/j");
        PrintWriter out = servletResponse.getWriter();
        out.print("<h3>that's h3 title</h3>");
        out.print("hello generic servlet");
        out.print("");
    }
}
