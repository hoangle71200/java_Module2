package Baitap_Access_modifier;

public class TestCircle {
    // Hai thuộc tính có access modifier là private: radius (double) có giá trị khởi tạo là 1.0,
    // color (String) có giá trị khởi tạo là "red".
    private double radius = 1.0;
    private String color = "red";
    // Hai hàm tạo: một không có tham số và một có tham số là radius.
    public TestCircle () {

    }
    public TestCircle(double radius) {
        this.radius = radius;
    }
    // Hai phương thức có access modifier là public: getRadius và getArea.
    public double getRadius () {
        return this.radius;
    }
    public double getArea () {
        return Math.pow(this.radius, 2) * 3.14;
    }
}
