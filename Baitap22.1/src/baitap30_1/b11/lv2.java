package baitap30_1.b11;

import java.util.ArrayList;
import java.util.Scanner;

public class lv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<Integer> listFirstSmallLast = new ArrayList<>();
        System.out.println("Nhập số phần thử của mảng: ");
        int numbInt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < numbInt; i++) {
            int inpNum = Integer.parseInt(sc.next());
            listInt.add(inpNum);
            if (i > 0) {
                if (listInt.get(i-1)<inpNum) {
                    listFirstSmallLast.add(inpNum);
                }
            }
        }
        System.out.println("Mảng");
        System.out.println(listInt);
        System.out.println("Mảng số sau lớn hơn số trước: ");
        System.out.println(listFirstSmallLast);
    }
}
