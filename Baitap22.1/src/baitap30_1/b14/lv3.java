package baitap30_1.b14;

import java.util.ArrayList;
import java.util.Scanner;

public class lv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listInt = new ArrayList<>();
        System.out.println(listInt.size());
        int sumArr = 0;
        double trungBinh;
        System.out.println("Nhập số phần thử của mảng: ");
        int numbInt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < numbInt; i++) {
            int inpNum = Integer.parseInt(sc.next());
            System.out.println(listInt.size());
            listInt.add(inpNum);
            sumArr+=inpNum;
        }

        trungBinh = (double) sumArr/numbInt;
        System.out.println("Mảng");
        System.out.println(listInt);
        listInt.remove(3);
        System.out.println(listInt);
        System.out.println("Trung bình các phần tử mảng:");
        System.out.println(trungBinh);
    }
}
