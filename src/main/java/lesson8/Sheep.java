package lesson8;

public class Sheep extends Animal {
    public Sheep(String nickname) {
        super(nickname);
        this.nickname = "Овечка " + (nickname);
    }

    @Override
    public void getVoice() {
        System.out.println(nickname + " говорит мее");
    }
}