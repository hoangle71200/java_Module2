import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển: ");
        int num = sc.nextInt();
        int motchuso, haichuso, bachuso;
        if (num<0 || num >999) {
            System.out.println("out of ability");
        } else {
            if (num>=0 && num <13) {
                switch (num) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 10:
                        System.out.println("Ten");
                        break;
                    case 11:
                        System.out.println("Eleven");
                        break;
                    case 12:
                        System.out.println("Twelve");
                        break;
                }
            }
            if (num >=14 && num <20) {
                int num1 = num-10;
                switch (num1) {
                    case 3:
                        System.out.println("Thirdteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eightteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
            }
        }
    }
}
}
