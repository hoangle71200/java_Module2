package baitap30_1.b13;

import java.util.ArrayList;
import java.util.Scanner;

public class lv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listInt = new ArrayList<>();
        int maxInt = 0;
        System.out.println("Nhập số phần thử của mảng: ");
        int numbInt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < numbInt; i++) {
            int inpNum = Integer.parseInt(sc.next());
            listInt.add(inpNum);
            maxInt = Math.max(maxInt, inpNum);
        }
        System.out.println("Mảng");
        System.out.println(listInt);
        System.out.println("Số lớn nhất là:");
        System.out.println(maxInt);
    }
}