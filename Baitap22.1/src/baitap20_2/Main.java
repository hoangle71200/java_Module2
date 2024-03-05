package baitap20_2;

import Baitap29_1.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV.addSVConst();
        boolean out = true;
        StudentManager.addSComputer();
        while (out) {
            System.out.println("0. Thoát");
            System.out.println("1. Thêm SV: ");
            System.out.println("2. Sửa SV: ");
            System.out.println("3. Xóa SV: ");
            System.out.println("4. Hiên thị List: ");
            System.out.println("5. Tìm theo tên SV: ");
            System.out.println("6. TÌm theo id của SV: ");
            System.out.println("Chọn chức năng: ");
            int indexInput = Integer.parseInt(sc.nextLine());
            switch (indexInput) {
                case 0: {
                    out = false;
                    break;
                }
                case 1: {
                    QLSV.addSV();
                    break;
                }
                case 2: {
                    QLSV.updateSV();
                    break;
                }
                case 3: {
                    QLSV.deleteSV();
                    break;
                }
                case 4: {
                    QLSV.displaySV();
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
