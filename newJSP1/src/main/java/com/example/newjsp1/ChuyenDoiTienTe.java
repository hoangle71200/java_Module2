package com.example.newjsp1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "chuyenDoiTienTe", value = "/chuyen-doi-tien-te")
public class ChuyenDoiTienTe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int tiGia = Integer.parseInt(req.getParameter("txtTiGia"));
        int soTien = Integer.parseInt(req.getParameter("txtSoTien"));
        req.setAttribute("tiGia", tiGia);
        req.setAttribute("soTien", soTien);
        req.getRequestDispatcher("chuyendoitiente.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
