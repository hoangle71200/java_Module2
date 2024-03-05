package baitap30_1.b13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listInt = new ArrayList<>();
        int max2 = 0;
        System.out.println("Nhập số phần thử của mảng: ");
        int numbInt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < numbInt; i++) {
            int inpNum = Integer.parseInt(sc.next());
            listInt.add(inpNum);
        }
        System.out.println("Mảng");
        System.out.println(listInt);
        Collections.sort(listInt);
        max2 = listInt.get(listInt.size()-2);
        System.out.println("Số lớn tứ hai là:");
        System.out.println(max2);
    }
}
