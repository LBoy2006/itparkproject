package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println(koren(1000));
    }

    public static int koren(int chislo) {
        int n1 = chislo;
        if (chislo < 0) {
            System.out.println("Отрицательное число не имеет квдратных корней");

        } else if (chislo >= 0) {
            while (chislo != n1 * n1) {
                n1 = n1 - 1;

                }
            }
        } else if (n1 < 0){
            System.out.println("Число не имеет целых квадратных корней");
        }
        return n1;
    }
}
