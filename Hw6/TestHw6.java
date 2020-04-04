package lesson6.Hw6;

public class TestHw6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog();
        cat.run(150);
        cat.swim(0);
        dog.run(400);
        dog.swim(6);
    }
}