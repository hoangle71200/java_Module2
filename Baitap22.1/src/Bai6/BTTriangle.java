package Bai6;

import java.util.Scanner;

public class BTTriangle extends BTShape{
    private double size1 = 1.0d;
    private double size2 = 1.0d;
    private double size3 = 1.0d;

    public BTTriangle() {
    }

    public BTTriangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public BTTriangle(String color, double size1, double size2, double size3) {
        super(color);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public boolean isBTTriangle () {
        if (this.size1 + this.size2 > this.size3 && this.size2 + this.size3 > this.size1 && this.size3 + this.size1 > this.size2) {
            return true;
        } else return false;
    }
    public double getPerimeter () {
        double p = this.size1 + this.size2 + this.size3;
        return p;
    }
    public double getArea () {
        double p = (this.size1 + this.size2 + this.size3)/2;
        double S =  Math.sqrt(p * (p - this.size1) * (p - this.size2) * (p - this.size3));
        return S;
    }
    public String toString () {
        return "Tam giác có màu " + getColor() + " Diện tích là " + getArea() + " Chu vi là " + getPerimeter();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập màu: ");
        String inColor = sc.nextLine();
        System.out.println("Nhập size1: ");
        double inSize1 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập size2: ");
        double inSize2 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập size3: ");
        double inSize3 = Double.parseDouble(sc.nextLine());
        BTTriangle tri1 = new BTTriangle("Blue", 3, 4, 5);
        BTTriangle tri2 = new BTTriangle(inColor, inSize1, inSize2, inSize3);
        if (tri1.isBTTriangle()) {
            System.out.println(tri1);
        } else {
            System.out.println("Không phải tam giác");
        }
        if (tri2.isBTTriangle()) {
            System.out.println(tri2);
        } else {
            System.out.println("Không phải tam giác");
        }
    }
}
