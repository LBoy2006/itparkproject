package lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        double a = 10;
        double b = 47;
        double c = 5;
        double diskr = b * b - 4 * a * c;
        double x = -b / (2 * a);
        double x1 = ((-b - Math.pow(diskr, 0.5)) / (2 * a));
        double x2 = ((-b + Math.pow(diskr, 0.5)) / (2 * a));
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else if (diskr == 0) {
            System.out.println(x);
        } else if (diskr > 0) {
            System.out.println(x1 + " " + x2);
        } else System.out.println("Нет действительных решений уравнения");
    }
}