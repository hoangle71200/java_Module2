package Baitap29_1;

import java.util.Scanner;

public class StudentManager {
    static Scanner sc = new Scanner(System.in);
    static Student listStudent[] = new Student[10];
    private static int studentCount = 0;
    public static void addSComputer () {
        Student st1 = new Student(1, "hoang", 23, "hoang@.com");
        Student st2 = new Student(2, "hung", 23, "hung@.com");
        Student st3 = new Student(3, "hung", 23, "hung1@.com");
        listStudent[0] = st1;
        listStudent[1] = st2;
        listStudent[2] = st3;
    }
    public static String displayS (int index) {
        return listStudent[index].toString();
    }

    public static void addS () {
            Student [] listAdd = new Student[listStudent.length+1];
            System.out.println("Nhập id thêm: ");
            int addID = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập name thêm: ");
            String addName = sc.nextLine();
            System.out.println("Nhập age thêm: ");
            int addAge = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập email thêm: ");
            String addEmail = sc.nextLine();
            Student addStudent = new Student(addID, addName, addAge, addEmail);
            listAdd[listAdd.length - 1] = addStudent;
            for (int i = 0; i < listStudent.length; i++) {
                listAdd[i] = listStudent[i];
            }
            listStudent = listAdd;
    }
    public static void editS (int index) {
        System.out.println("Nhập id sửa: ");
        int addID = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập name sửa: ");
        String addName = sc.nextLine();
        System.out.println("Nhập age sửa: ");
        int addAge = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập email sửa: ");
        String addEmail = sc.nextLine();
        Student editStudent = new Student(addID, addName, addAge, addEmail);
        listStudent[index] = editStudent;
    }
    public static void deleteS (int index) {
        Student [] listDelete = new Student[listStudent.length-1];
        for (int i = 0; i < listStudent.length - 1; i++) {
            if(i<index) {
                listDelete[i] = listStudent[i];
            } else {
                listDelete[i] = listStudent[i+1];
            }
        }
        listStudent = listDelete;
    }
    public static void findByName (String findName) {
        int countName = 0;
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] != null) {
                if(findName.equals(listStudent[i].getName())) {
                    System.out.println(listStudent[i].toString());
                }
                else {
                    countName++;
                }
            }
        }
        if (countName == listStudent.length) {
            System.out.println("Không tồn tại name");
        }
//        boolean found = false;
//        for (int i = 0; i < studentCount; i++) {
//            if (listStudent[i].getName().equalsIgnoreCase(findName)) {
//                System.out.println(listStudent[i]);
//                found = true;
//                System.out.println(listStudent[i].getName());
//            }
//        }
//        if (!found) {
//            System.out.println("Không tìm thấy sinh viên có tên: " + findName);
//        }
    }
    public static void findByID (int findID) {
        int countID = 0;
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] != null) {
                if(findID == listStudent[i].getId()) {
                    System.out.println(listStudent[i].toString());
                }
            } else {
                countID++;
            }
        }
        if (countID == listStudent.length) {
            System.out.println("Không tồn tại id");
        }
    }
}
