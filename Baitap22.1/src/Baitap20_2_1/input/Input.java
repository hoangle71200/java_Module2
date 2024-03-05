package Baitap20_2_1.input;

import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);

    public static int getNumber() {
        while (true) {
            try {
                int number = Integer.parseInt(input.nextLine());
                return number;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Please Enter Number!");
            }
        }
    }

    public static String getString() {
        return input.nextLine();
    }
}
