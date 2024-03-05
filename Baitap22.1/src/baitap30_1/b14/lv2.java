package baitap30_1.b14;

import java.util.ArrayList;
import java.util.Scanner;

public class lv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listInt = new ArrayList<>();
        int sumDiv3 = 0;
        System.out.println("Nhập số phần thử của mảng: ");
        int numbInt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < numbInt; i++) {
            int inpNum = Integer.parseInt(sc.next());
            listInt.add(inpNum);
            if (inpNum%3==0) {
                sumDiv3+=inpNum;
            }
        }
        System.out.println("Mảng");
        System.out.println(listInt);
        System.out.println("Tổng các phần tử mảng chia hết cho 3:");
        System.out.println(sumDiv3);
    }
}
