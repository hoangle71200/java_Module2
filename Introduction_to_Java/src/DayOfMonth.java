import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
                daysInMonth = "31";
                break;
            case 3:
                daysInMonth = "31";
                break;
            case 5:
                daysInMonth = "31";
                break;
            case 7:
                daysInMonth = "31";
                break;
            case 8:
                daysInMonth = "31";
                break;
            case 10:
                daysInMonth = "31";
                break;
            case 12:
                daysInMonth = "31";
                break;
            case 4:
                daysInMonth = "30";
                break;
            case 6:
                daysInMonth = "30";
                break;
            case 9:
                daysInMonth = "30";
                break;
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }

        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
    }
}