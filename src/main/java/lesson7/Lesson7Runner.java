package lesson7;

public class Lesson7Runner {

    public static void main(String[] args) {
        Dog dogBob = new Dog("Bob");
        Cat catTom = new Cat("Tom");
        dogBob.run(600);
        dogBob.run(100);
        dogBob.swim(5);
        catTom.swim(5);
    }
}
