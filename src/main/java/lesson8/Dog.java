package lesson8;

public class Dog extends Animal {
    public Dog(String nickname) {
        super(nickname);
        this.nickname = "Пес " + (nickname);
    }

    @Override
    public void getVoice() {
        System.out.println(nickname + " говорит гав");
    }
}