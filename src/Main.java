import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r;
        double pi = 3.14;

        // Запрос радиуса
        System.out.print("Введите радиус круга: ");
        r = scanner.nextDouble();

        // Проверка, чтобы радиус был положительным
        if (r < 0) {
            System.out.println("Радиус не может быть отрицательным. Введите положительное значение.");
            return;
        }

        // Вычисление формулы
        double s = pi * r * r;

        // Вывод результата
        System.out.println("Площадь круга с радиусом " + r + " равна " + s);
    }
}
