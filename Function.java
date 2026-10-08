import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        double result = 0;
        boolean isCalculated = false;

        if (x >= 1 && x < 3) {
            if (a * x != 0) {
                result = 9 / (a * x);
                isCalculated = true;
            } else {
                System.out.println("Помилка: ділення на нуль (a * x = 0)!");
            }
        } else if (x == 3) {
            result = Math.abs(a * x * x + x + b);
            isCalculated = true;
        } else {
            System.out.println("Значення x не потрапляє в задані діапазони.");
        }

        if (isCalculated) {
            System.out.println("Значення функції f(x) = " + result);
        }

        scanner.close();
    }
}