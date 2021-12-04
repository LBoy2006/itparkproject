package lesson8;

public class Dog extends Animal {
    public Dog(String nickname) {
        super(nickname);
        this.nickname = "Пес " + (nickname);
        voice = "гав";
    }
}