package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        koren(47);
        koren(-5);
        koren(1024);
    }

    public static int koren(int chislo) {
        int n1 = chislo;
        if (chislo < 0) {
            System.out.println("Отрицательное число " + chislo + " не имеет квдратных корней");

        } else if (chislo >= 0) {
            while (n1 != -1) {
                if (chislo == n1 * n1) {
                    System.out.println("Квадратный корень числа " + chislo + " равен " + n1);
                    break;
                }
                n1 = n1 - 1;
            }
        }
        if (n1 == -1) {
            System.out.println("Число " + chislo + " не имеет целых квадратных корней");
        }
        return chislo;
    }
}
