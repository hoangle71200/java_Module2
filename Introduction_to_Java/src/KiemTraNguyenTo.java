import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class KiemTraNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if (num<2) {
            System.out.println("Không phải số nguyên tố");
        } else {
            for (int i=2; i<=Math.sqrt(num); i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(num + " là số nguyên tố");
            } else {
                System.out.println("Không phải số nguyên tố");
            }
        }
    }
}