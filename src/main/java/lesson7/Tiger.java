package lesson7;

public class Tiger {
    public String nickname;
    private static final Integer MAX_RUN = 700;
    private static final Integer MAX_SWIM = 30;

    public Tiger(String nickname) {
        this.nickname = nickname;
    }

    public void run(int run) {
        if (run > MAX_RUN) {
            System.out.println(nickname + " не может пробежать " + run + " метров");
        } else {
            System.out.println(nickname + " пробежал " + run + " метров");
        }
    }

    public void swim(int swim) {
        if (swim > MAX_SWIM) {
            System.out.println(nickname + " утонул =(");
        } else {
            System.out.println(nickname + " проплыл " + swim + " метров");
        }
    }
}
