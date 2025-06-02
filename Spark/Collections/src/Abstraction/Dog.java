package Abstraction;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog sound");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}
