package Bai6;

public class Circle extends HinhHoc {
    private double radius;
    public Circle() {
        this.radius = 1.0d;
    }
    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString () {
        return "A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(20);
        Circle circle3 = new Circle("Haml", false, 50);
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());
        System.out.println(circle2.getRadius());
        System.out.println(circle3.radius);
    }
}
