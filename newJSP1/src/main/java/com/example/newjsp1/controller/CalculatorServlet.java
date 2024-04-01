package com.example.newjsp1.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "calculator", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float num1 = Float.parseFloat(req.getParameter("txtOperand1"));
        float operator = Float.parseFloat(req.getParameter("txtOperator"));
        float num2 = Float.parseFloat(req.getParameter("txtOperand2"));
        req.setAttribute("num1", num1);
        req.setAttribute("operator", operator);
        req.setAttribute("num2", num2);
        req.getRequestDispatcher("calculator.jsp").forward(req, resp);
    }
}
