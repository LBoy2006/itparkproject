package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson6 {

    public static void main(String[] args) {
        System.out.println("Введите длину массива:");
        int dlina = dlinaMassiva();
        int[] massiv = getMassiv(dlina);
        System.out.println(Arrays.toString(massiv));
        int max = getMax(massiv);
        System.out.println("Максимальное значение " + max);
        int min = getMin(massiv);
        System.out.println("Минимальное значение " + min);
        double avg = getAvg(massiv);
        System.out.println("Среднее значение " + avg);

    }

    private static int getMax(int[] massiv) {
        int max = massiv[0];
        for (int znachenie : massiv) {
            if (znachenie > max) {
                max = znachenie;
            }
        }
        return max;
    }

    private static int getMin(int[] massiv) {
        int min = massiv[0];
        for (int znachenie : massiv) {
            if (znachenie < min) {
                min = znachenie;
            }
        }
        return min;
    }

    private static double getAvg(int[] massiv) {
        double avg = 0;
        for (int znachenie : massiv) {
            avg += znachenie;
            }
        avg = avg / massiv.length;
        return avg;
    }
    private static int[] getMassiv(int dlina) {
        int[] massive = new int[dlina];
        for (int i = 0; i < dlina; i++) {
            massive[i] = Math.round((float) Math.random() * 1000);
        }
        return massive;
    }

    public static int dlinaMassiva() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Введите целое число:");
            scanner.next();
        }
        int dlina = scanner.nextInt();
        if (dlina < 0) {
            System.out.println("Длина массива не может быть отрицательной, введите положительное число: ");
            return dlinaMassiva();
        }
        return dlina;
    }
}
