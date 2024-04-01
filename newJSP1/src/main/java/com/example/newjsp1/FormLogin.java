package com.example.newjsp1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class FormLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        String username = req.getParameter("txtUsername");
        String password = req.getParameter("txtPassword");
        System.out.println(username + " - " + password);
        req.setAttribute("studentName", username);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
//        resp.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = resp.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + username + "</h1>");
//        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
