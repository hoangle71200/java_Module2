import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiengui = sc.nextInt();
        float laisuat = sc.nextFloat();
        int sothang = sc.nextInt();
        float tienlai = tiengui * laisuat / sothang;
        System.out.println("Số tiền lãi là: " + tienlai);
    }
}
