package lesson8;

public class Sheep extends Animal {
    public Sheep(String nickname) {
        super(nickname);
        this.nickname = "Овечка " + (nickname);
        voice = "мее";
    }
}