package lesson7;

public class Lesson7Runner {

    public static void main(String[] args) {
        Dog dogBob = new Dog("Bob", 500, 10);
        Cat catTom = new Cat("Tom", 200, 0);
        dogBob.run(600);
        dogBob.run(100);
        dogBob.swim(5);
        catTom.swim(5);
    }
}
