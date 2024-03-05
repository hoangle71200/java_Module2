package baitap30_1.b1;

import java.util.Scanner;

public class lv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        System.out.println(Math.max(Math.max(num1, num2), num3));
    }
}
