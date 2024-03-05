package baitap30_1.b13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listString = new ArrayList<>();
        System.out.println("Nhập số phần thử của mảng: ");
        int numbInt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < numbInt; i++) {
            String inpString = sc.next();
            listString.add(inpString);
        }
        System.out.println("Mảng: ");
        System.out.println(listString);
        Collections.sort(listString);
        System.out.println(listString);
    }
}
