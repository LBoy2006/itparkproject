package lesson8;

public abstract class Animal {
    public String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public abstract void getVoice();
    }

