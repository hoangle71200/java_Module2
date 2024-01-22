package baitap22_1;

import java.util.Arrays;

public class Circle {
    private int id = 0;
    private int radius;
    public static final double PI = 3.14;
    public static int count = 0;
    public static double sum = 0;
    public static double maxRadius = 0;
    public Circle () {
//        setID();
        setCountID();
    }

    public Circle(int radius) {
        this.radius = radius;
        setCountID();
//        setID();
//        maxRadius();
        this.id = count;
        if (radius > maxRadius) {
            maxRadius = radius;
        }
        sum += Dientich();
    }

//    public void setID () {
//        this.id++;
//    }
    public int getID () {
        return this.id;
    }
    public int getRadius () {
        return this.radius;
    }
    public static void setCountID () {
        count++;
    }
    public static int getCountID () {
        return count;
    }
//    public static int maxRadius () {
//        if (radius > maxR) {
//            maxR = radius;
//        }
//        return maxR;
//    }

    public double Chuvi () {
        return 2 * PI * radius;
    }

    public double Dientich () {
        return PI * Math.pow(radius, 2);
    }

    public static double sumDisplay () {
        return sum;
    }


}
