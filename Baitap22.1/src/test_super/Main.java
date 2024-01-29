package test_super;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Hoang", 20);
        user1.setAge(40);
        System.out.println(user1.getAge());
        Student student1 = new Student();
        System.out.println(student1.getName());
    }
}
