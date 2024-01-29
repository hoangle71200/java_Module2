package Bai6;

public class Main {
    public static void main(String[] args) {
        HinhHoc hinhHoc1 = new HinhHoc();
        HinhHoc hinhHoc2 = new HinhHoc("Blue", true);
        System.out.println(hinhHoc1.getColor());
        System.out.println(hinhHoc2.toString());
    }
}
