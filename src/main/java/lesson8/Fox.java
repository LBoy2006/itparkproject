package lesson8;

public class Fox extends Animal {
    public Fox(String nickname) {
        super(nickname);
        this.nickname = "Лис " + (nickname);
        voice = "фыр";
    }
}