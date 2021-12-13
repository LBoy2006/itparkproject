package lesson8;

public class Fox extends Animal {
    public Fox(String nickname) {
        super(nickname);
        this.nickname = "Лис " + (nickname);
    }

    @Override
    public void getVoice() {
        System.out.println(nickname + " говорит фыр ");
    }
}