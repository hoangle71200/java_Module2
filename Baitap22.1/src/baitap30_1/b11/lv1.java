package baitap30_1.b11;

import java.util.ArrayList;
import java.util.Scanner;

public class lv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<Integer> listChan = new ArrayList<>();
        System.out.println("Nhập số phần thử của mảng: ");
        int numbInt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < numbInt; i++) {
            int inpNum = Integer.parseInt(sc.next());
            listInt.add(inpNum);
            if (inpNum%2==0) {
                listChan.add(inpNum);
            }
        }
        System.out.println("Mảng");
        System.out.println(listInt);
        System.out.println("Mảng chẵn");
        System.out.println(listChan);
    }
}
