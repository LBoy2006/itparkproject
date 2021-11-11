public class SecondProgram {
    public static void main(String[] args) {
        System.out.println("Пивет, мир!!");
        System.out.println(summa(21, 6));
        System.out.println(multipl(3, 5));
        System.out.println(dif(8, 4));
        System.out.println(div(10, 5));
    }

    public static int summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static int multipl(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int dif(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static int div(int arg1, int arg2) {
        return arg1 / arg2;
    }
}

