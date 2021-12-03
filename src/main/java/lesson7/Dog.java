package lesson7;

public class Dog {
    String nickname;
    Integer maxRun;
    Integer maxSwim;

    public Dog(String nickname, Integer maxRun, Integer maxSwim) {
        this.nickname = nickname;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int run) {
        if (run > maxRun) {
            System.out.println(nickname + " не может пробежать " + run + " метров");
        } else {
            System.out.println(nickname + " пробежал " + run + " метров");
        }
    }

    public void swim(int swim) {
        if (swim > maxSwim) {
            System.out.println(nickname + " утонул =(");
        } else {
            System.out.println(nickname + " проплыл " + swim + " метров");
        }
    }
}
