import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        int inp = sc.nextInt();
        switch (inp) {
            case 1: {
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
            };
            break;
            case 2: {
                System.out.println("top-left");
                for (int i=0; i<5; i++) {
                    for (int j=0; j<5; j++) {
                        if (j<=i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
            };
            break;
            case 3: {

            };
            break;
            case 4: {

            };
            break;
            default:
                System.out.println("No Number Input");
        }
    }
}
