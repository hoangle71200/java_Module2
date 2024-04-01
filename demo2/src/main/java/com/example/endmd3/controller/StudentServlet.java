package com.example.endmd3.controller;

import com.example.endmd3.model.Student;
import com.example.endmd3.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "studentServlet", urlPatterns = { "","/student"})
public class StudentServlet extends HttpServlet {
    private StudentServiceImpl service = new StudentServiceImpl();
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
            case "delete":
                deleteStudent(req, resp);
                break;
            default:
                showList(req, resp);
        }
    }
    private void showCreatePage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/student/create.jsp");
    }

    private void showList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("studentList", service.findAll());
        req.getRequestDispatcher("/student/list.jsp").forward(req, resp);
    }
    private void showEditPage(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int editID = Integer.parseInt(req.getParameter("editID"));
        req.setAttribute("editID", editID);
        Student editStudent = service.findById(editID);
        req.setAttribute("editStudent", editStudent);
        req.getRequestDispatcher("/student/edit.jsp").forward(req, resp);
        resp.sendRedirect("/student/edit.jsp");
    }
    private void editStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int studentId = Integer.parseInt(req.getParameter("editID"));
        String name = req.getParameter("editName");
        String birthday = req.getParameter("editBirthday");
        String email = req.getParameter("editEmail");
        String address = req.getParameter("editAddress");
        String phone = req.getParameter("editPhone");
        String classroom = req.getParameter("editClass");

        Student student = new Student(name, birthday, email, address, phone, classroom);
        service.update(studentId, student);

//        showList(req, resp);
        resp.sendRedirect("/student");
    }
    private void deleteStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int deleteID = Integer.parseInt(req.getParameter("deleteID"));
        service.remove(deleteID);
        resp.sendRedirect("/student");
    }
    private void nameSearch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nameSearch = req.getParameter("search");
        List<Student> studentListAll = service.findAll();
        List<Student> studentList = new ArrayList<>();
        for (Student student: studentListAll){
            if (student.getName().contains(nameSearch)) {
                studentList.add(student);
            }
        }
        if (studentList.isEmpty()) {
            studentList.addAll(studentListAll);
        }
        req.setAttribute("studentList", studentList);
        req.setAttribute("nameSearch", nameSearch);
        req.getRequestDispatcher("/student/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createStudent(req, resp);
                break;
            case "edit":
                editStudent(req, resp);
                break;
            case "search":
                nameSearch(req, resp);
                break;
            default:
                showList(req, resp);
        }
    }
    private void createStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("studentName");
        String birthday = req.getParameter("studentBirthday");
        String email = req.getParameter("studentEmail");
        String address = req.getParameter("studentAddress");
        String phone = req.getParameter("studentPhone");
        String classroom = req.getParameter("studentClass");
        Student student = new Student( name, birthday, email, address, phone, classroom);
        service.save(student);
        resp.sendRedirect("/student");
    }
}
