package baitap20_2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<SV> listSV = new ArrayList<>();
    public static void addSVConst (){
        SV sv1 = new SV();
        SV sv2 = new SV(1, "Hoang", "Male");
        listSV.add(sv1);
        listSV.add(sv2);
    }
    public static void displaySV () {
        for(SV item: listSV) {
            System.out.println(item);
        }
    }
    public static void addSV () {
        System.out.println("Nhập id");
        int addID = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập name");
        String addName = sc.nextLine();
        System.out.println("Nhập gender");
        String addGender = sc.nextLine();
        System.out.println("Nhập điểm toán");
        int addPointToan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập điểm văn");
        int addPointVan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập điểm anh");
        int addPointAnh = Integer.parseInt(sc.nextLine());
        SV newSV = new SV(addID, addName, addGender, addPointToan, addPointVan, addPointAnh);
        listSV.add(newSV);
    }

    public static void deleteSV () {
        System.out.println("Nhập id xóa");
        int deleteID = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getId() == deleteID) {
                listSV.remove(listSV.get(i));
                System.out.println("Xóa thành công");
            }
            count++;
        }
        if (count == listSV.size()) {
            System.out.println("Không có sinh viên này");
        }
    }
    public static void updateSV () {
        System.out.println("Nhập id Sửa");
        int updateID = Integer.parseInt(sc.nextLine());
        try {
            int count = 0;
            for (int i = 0; i < listSV.size(); i++) {
                if (listSV.get(i).getId() == updateID) {
                    System.out.println("Nhập name");
                    listSV.get(i).setName(sc.nextLine());
                    System.out.println("Nhập gender");
                    listSV.get(i).setGender(sc.nextLine());
                    System.out.println("Nhập điểm toán");
                    listSV.get(i).setPointToan(Integer.parseInt(sc.nextLine()));
                    System.out.println("Nhập điểm văn");
                    listSV.get(i).setPointVan(Integer.parseInt(sc.nextLine()));
                    System.out.println("Nhập điểm anh");
                    listSV.get(i).setPointAnh(Integer.parseInt(sc.nextLine()));
                    System.out.println("Sửa thành công");
                }
                count++;
            }
            if (count == listSV.size()) {
                System.out.println("Không có sinh viên này");
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    public static void searchByName () {
        System.out.println("Nhập name cần tìm");
        String searchName = sc.nextLine();

    }
}
