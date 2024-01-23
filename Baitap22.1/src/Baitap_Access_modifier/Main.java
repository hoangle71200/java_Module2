package Baitap_Access_modifier;

public class Main {
    public static void main(String[] args) {
        TestCircle circle1 = new TestCircle(5);
        TestCircle circle2 = new TestCircle(9);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }
}
