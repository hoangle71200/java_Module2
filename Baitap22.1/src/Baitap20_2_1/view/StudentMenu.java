package Baitap20_2_1.view;

import Baitap20_2_1.input.Input;
import Baitap20_2_1.model.Student;
import Baitap20_2_1.service.StudentService;
import java.util.List;
import java.util.Scanner;

public class StudentMenu {
    private Scanner sc = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("------------ Student Manager -----------");
            System.out.println("1.Add student");
            System.out.println("2.Edit student");
            System.out.println("3.Delete student");
            System.out.println("4.Find student");
            System.out.println("5.Find By Name Containing");
            System.out.println("6.Find Student max score");
            System.out.println("7.Show all student");
            System.out.println("0.Exit");
            System.out.println("Enter choice: ");
            choice = Input.getNumber();
            switch (choice) {
                case 1:
                    showFormAdd();
                    break;
                case 2:
                    showFormEdit();
                    break;
                case 7:
                    showAll();
                    break;
            }
        } while (choice != 0);
    }

    public void showAll() {
        System.out.println("------------- Show all Student ---------------");
        List<Student> list = studentService.findAll();
        for (Student s: list) {
            System.out.println(s);
        }
    }
    public void showFormAdd() {
        System.out.println("------------- Thêm mới sinh viên -----------");
        System.out.println("Enter ID: ");
        int id = Input.getNumber();
        System.out.println("Enter name: ");
        String name = Input.getString();
        System.out.println("Enter gender: ");
        String gender = Input.getString();
        System.out.println("Enter Score: ");
        double score = Input.getNumber();
        Student newStudent = new Student(id, name, gender, score);
        studentService.add(newStudent);
        System.out.println("Add Success!");
    }

    public void showFormEdit() {
        System.out.println("------------- Edit Student -----------");
        System.out.println("Enter id edit: ");
        int index = studentService.findById(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter name: ");
        String name = Input.getString();
        System.out.println("Enter gender: ");
        String gender = Input.getString();
        System.out.println("Enter Score: ");
        double score = Input.getNumber();
        Student editStudent = new Student(index, name, gender, score);
        studentService.edit(index, editStudent);
        System.out.println("Edit Success!");
    }
}