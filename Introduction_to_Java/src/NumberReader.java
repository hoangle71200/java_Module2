import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else if (number < 10) {
            readSingleDigit(number);
        } else if (number < 20) {
            readUpToTwenty(number);
        } else if (number < 100) {
            readTensAndOnes(number);
        } else {
            readHundredsTensAndOnes(number);
        }
    }

    public static void readSingleDigit(int number) {
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            // ... (tiếp tục cho các trường hợp còn lại)
            case 9:
                System.out.println("nine");
                break;
            default:
                break;
        }
    }

    public static void readUpToTwenty(int number) {
        switch (number) {
            case 10:
                System.out.println("ten");
                break;
            case 11:
                System.out.println("eleven");
                break;
            // ... (tiếp tục cho các trường hợp còn lại)
            case 19:
                System.out.println("nineteen");
                break;
            default:
                break;
        }
    }

    public static void readTensAndOnes(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String tensWord = "";
        String onesWord = "";
        switch (tens) {
            case 2:
                tensWord = "twenty";
                break;
            // ... (tiếp tục cho các trường hợp còn lại)
            case 9:
                tensWord = "ninety";
                break;
            default:
                break;
        }
        switch (ones) {
            case 1:
                onesWord = "one";
                break;
            // ... (tiếp tục cho các trường hợp còn lại)
            case 9:
                onesWord = "nine";
                break;
            default:
                break;
        }
        System.out.println(tensWord + " " + onesWord);
    }

    public static void readHundredsTensAndOnes(int number) {
        int hundreds = number / 100;
        int remaining = number % 100;
        String hundredsWord = "";
        switch (hundreds) {
            case 1:
                hundredsWord = "one hundred";
                break;
            // ... (tiếp tục cho các trường hợp còn lại)
            case 9:
                hundredsWord = "nine hundred";
                break;
            default:
                break;
        }
        if (remaining < 10) {
            readSingleDigit(remaining);
        } else if (remaining < 20) {
            readUpToTwenty(remaining);
        } else {
            readTensAndOnes(remaining);
        }
        if (remaining != 0) {
            System.out.println(" and " + hundredsWord);
        } else {
            System.out.println(hundredsWord);
        }
    }
}