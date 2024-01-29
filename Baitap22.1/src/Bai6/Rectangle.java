package Bai6;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0d;
        this.length = 1.0d;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea () {
        return (this.width * this.length);
    }
    public double getPerimeter () {
        return (this.width + this.length) * 2;
    }
    public String toString () {
        return "A Rectangle with width = " + this.width + " and length = " + this.length +
                ", which is a subclass of " + super.toString();
    }
}
