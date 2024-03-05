package baitap30_1.b1;

import java.util.Scanner;

public class lv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = Integer.parseInt(sc.nextLine());
        if (inp%2==0) {
            System.out.println("Số chẵn");
        } else System.out.println("Số lẻ");
    }
}
