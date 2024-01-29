package Baitap29_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean out = true;
        StudentManager.addSComputer();
        while (out) {
            System.out.println("0. Thoát");
            System.out.println("1. Thêm Student: ");
            System.out.println("2. Sửa Student: ");
            System.out.println("3. Xóa Student: ");
            System.out.println("4. Hiên thị List: ");
            System.out.println("5. Tìm theo tên: ");
            System.out.println("6. TÌm theo id của student: ");
            System.out.println("Chọn chức năng: ");
            int indexInput = Integer.parseInt(sc.nextLine());
            switch (indexInput) {
                case 0: {
                    out = false;
                    break;
                }
                case 1: {
                    StudentManager.addS();
                    break;
                }
                case 2: {
                    System.out.println("Nhập vị trí sửa: ");
                    int indexEdit = Integer.parseInt(sc.nextLine());
                    StudentManager.editS(indexEdit);
                    break;
                }
                case 3: {
                    System.out.println("Nhập vị trí xóa: ");
                    int indexDelete = Integer.parseInt(sc.nextLine());
                    StudentManager.deleteS(indexDelete);
                    break;
                }
                case 4: {
                    System.out.println("Nhập vị trí hiển thị: ");
                    int indexDisplay = Integer.parseInt(sc.nextLine());
                    System.out.println(StudentManager.displayS(indexDisplay));
                    break;
                }
                case 5: {
                    System.out.println("Nhập tên cần tìm: ");
                    String inpuName = sc.nextLine();
                    StudentManager.findByName(inpuName);
                    break;
                }
                case 6: {
                    System.out.println("Nhập id cần tìm: ");
                    int inputID = Integer.parseInt(sc.nextLine());
                    StudentManager.findByID(inputID);
                    break;
                }
            }
        }
    }
}
