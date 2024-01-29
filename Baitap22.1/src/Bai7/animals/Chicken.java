package Bai7.animals;

public class Chicken extends Animals implements Edible {

    @Override
    public String howtoEat() {
        return "could be fried";
    }

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
}
