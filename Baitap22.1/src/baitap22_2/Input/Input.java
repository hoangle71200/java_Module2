package baitap22_2.Input;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);
    public static int getNumber() {
        while (true) {
            try {
//                int number = Integer.parseInt(sc.nextLine());
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Please enter number");
            }
        }
    }
    public static String getString() {
        return sc.nextLine();
    }
}
