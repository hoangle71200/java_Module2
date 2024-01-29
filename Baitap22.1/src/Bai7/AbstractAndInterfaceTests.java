package Bai7;

import Bai7.animals.Animals;
import Bai7.animals.Chicken;
import Bai7.animals.Tiger;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animals animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}