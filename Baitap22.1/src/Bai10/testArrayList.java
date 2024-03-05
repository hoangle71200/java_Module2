package Bai10;

import java.util.ArrayList;

public class testArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(5);
        System.out.println(arrInt.get(0));
        arrInt.add(3, 6);
//        arrInt.add(7);
//        arrInt.add(9);
        System.out.println(arrInt.get(3));
        System.out.println(arrInt.size());
    }
}
