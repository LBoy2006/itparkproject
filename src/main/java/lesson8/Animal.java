package lesson8;

public class Animal {
    String nickname;
    String voice;

    public Animal(String nickname) {
        this.nickname = nickname;
    }


    public String getVoice() {
        System.out.println(nickname + " говорит " + voice);
        return voice;
    }
}

