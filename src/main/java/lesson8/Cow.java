package lesson8;

public class Cow extends Animal {
    public Cow(String nickname) {
        super(nickname);
        this.nickname = "Корова " + (nickname);
        voice = "муу";
    }
}