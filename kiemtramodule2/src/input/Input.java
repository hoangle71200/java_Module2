package input;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);
    public static int getNumber() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }
        }
    }
    public static String getString() {
        while (true) {
            String inputString = sc.nextLine();
            if (inputString.equals("")) {
                System.out.println("Hãy nhập chữ");
            } else return inputString;
        }
    }
}
