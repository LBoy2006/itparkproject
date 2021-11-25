package lesson5;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Введите целое число:");
            scanner.next();
        }
        int chislo = scanner.nextInt();
        if (chislo < 0) {
            chislo = - chislo;
        }
        int n = 1;
        int fibonachi = 1;
        if (chislo == 0) {
            fibonachi = 0;
        } else if (chislo == 1) {
            fibonachi = 1;
        } else {
            int f0 = 0;
            int f1 = 1;
            while (n >= 1) {
                fibonachi = f1 + f0;
                f0 = f1;
                f1 = fibonachi;
                n = n + 1;
                if (n == chislo) {
                    break;
                }
            }
        }
        System.out.println(chislo+"-ое по счету число Фибоначи равняется " + fibonachi);
    }
}
