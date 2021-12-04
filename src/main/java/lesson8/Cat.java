package lesson8;

public class Cat extends Animal {
    public Cat(String nickname) {
        super(nickname);
        this.nickname = "Кот " + (nickname);
        voice = "мяу";
    }
}

