package baitap30_1.b12;

import java.util.ArrayList;
import java.util.Scanner;

public class lv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listInt = new ArrayList<>();
        int sumChan = 0;
        int sumLe = 0;
        System.out.println("Nhập số phần thử của mảng: ");
        int numbInt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < numbInt; i++) {
            int inpNum = Integer.parseInt(sc.next());
            listInt.add(inpNum);
            if (i%2 ==0) {
                sumChan+=inpNum;
            } else sumLe+=inpNum;
        }
        System.out.println("Mảng");
        System.out.println(listInt);
        System.out.println("Tổng phần tử vị trí chẵn: ");
        System.out.println(sumChan);
        System.out.println("Tổng phần tử vị trí lẻ: ");
        System.out.println(sumLe);
        if (sumChan<sumLe) System.out.println("Tổng chẵn nhỏ hơn tổng lẻ");
        else if(sumChan == sumLe) System.out.println("Tổng chẵn bằng tổng lẻ");
        else System.out.println("Tổng chẵn lớn hơn tổng lẻ");
    }
}
