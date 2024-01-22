import java.util.Scanner;

public class ChuyenTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        long usd = sc.nextLong();
        long vnd = usd * 23000;
        System.out.println("Chuyển Sang VND là: " + vnd);
    }
}
