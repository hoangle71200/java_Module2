package Bai7.testToString;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString () {
        return this.name+this.age+this.address;
    }

    public static void main(String[] args) {
        Person p1 = new Person("hoang", 20, "hn");
        System.out.println(p1);
        if (p1.equals("hoang20hn")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
