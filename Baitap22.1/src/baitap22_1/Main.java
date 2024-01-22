package baitap22_1;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        Circle circle3 = new Circle(9);
        Circle circle4 = new Circle(6);
        System.out.println("Số đối tượng Circle: " + Circle.getCountID());
        System.out.println("Max radius: " + Circle.maxRadius);
        System.out.println("ID. - Bán kính - Diện tích - Chu vi");
        Circle listCircle[] = {circle1, circle2, circle3, circle4};
        for (int i = 0; i < listCircle.length; i++) {
            System.out.println(listCircle[i].getID() + ". radius = " + listCircle[i].getRadius() + " - " +  + listCircle[i].Dientich() + " - " + listCircle[i].Chuvi());
        }
        System.out.println("Tổng diện tích: " + Circle.sumDisplay());
    }
}
