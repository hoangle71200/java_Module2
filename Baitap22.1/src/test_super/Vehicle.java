package test_super;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}

class Bike2 extends Vehicle {
    Bike2() {
        super();//gọi Constructor của lớp cha
        System.out.println("Bike is created");
    }

    public static void main(String args[]) {
        Bike2 b = new Bike2();
    }
}

