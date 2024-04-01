package com.example.newjsp1.controller;

import com.example.newjsp1.model.KhachHang;
import com.example.newjsp1.service.IKhachHangService;
import com.example.newjsp1.service.KhachHangServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "qlkh", urlPatterns = "/khachHangList")
public class QLKhachHang extends HttpServlet {
    private IKhachHangService service = new KhachHangServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreatePage(req, resp);
                break;
            case "edit":
                showEditPage(req, resp);
                break;
            default:
                //list
                showList(req, resp);
        }
//        req.setAttribute("khachHangList", khachHangList);
//        req.getRequestDispatcher("qlkh.jsp").forward(req, resp);
    }

    private void showEditPage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/KhachHang/edit.jsp");
    }

    private void showCreatePage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/KhachHang/create.jsp");
    }

    private void showList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("khachHangList", service.findAll());
        req.getRequestDispatcher("/KhachHang/qlkh.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createCustomer(req, resp);
                break;
            case "edit":
                break;
            default:
                //list
                showList(req, resp);
        }
    }
    private void createCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("customerID"));
        String name = req.getParameter("customerName");
        String ngaysinh = req.getParameter("customerBirthday");
        String diachi = req.getParameter("customerAddress");
        String image = req.getParameter("customerImage");

        KhachHang khachHang = new KhachHang(id, name, ngaysinh, diachi, image);
        service.save(khachHang);

//        showList(req, resp);
        resp.sendRedirect("/khachHangList");
    }
    private void editCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("studentId"));
        String name = req.getParameter("customerName");
        String ngaysinh = req.getParameter("customerBirthday");
        String diachi = req.getParameter("customerAddress");
        String image = req.getParameter("customerImage");

        KhachHang khachHang = new KhachHang(id, name, ngaysinh, diachi, image);
        service.save(khachHang);

//        showList(req, resp);
        resp.sendRedirect("/khachHangList");
    }
}
