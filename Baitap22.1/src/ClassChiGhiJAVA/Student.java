package ClassChiGhiJAVA;

public class Student {
    // Hai thuộc tính có access modifier là private: name (string) có giá trị mặc định là "John",
    // classes (String) có giá trị mặc định là "C02".
    public   String name = "John";
    public   String classes = "C02";
    // Một hàm tạo không có tham số.
    public Student () {

    }
    // Hai phương thức có access modifier là public: setName và setClasses.
    public  void setName (String name) {
        this.name = name;
    }
    public  void setClasses (String classes) {
        this.classes = classes;
    }
}

