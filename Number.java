import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        int length = String.valueOf(Math.abs((long) number)).length();
        String format = "%0" + length + "d\n";

        int tempWhile = Math.abs(number);
        long reversedWhile = 0;

        while (tempWhile > 0) {
            reversedWhile = reversedWhile * 10 + (tempWhile % 10);
            tempWhile /= 10;
        }

        System.out.print("Результат циклу while: ");
        if (number < 0 && reversedWhile != 0) {
            System.out.print("-");
        }
        System.out.printf(format, reversedWhile);

        int tempDoWhile = Math.abs(number);
        long reversedDoWhile = 0;

        if (tempDoWhile > 0) {
            do {
                reversedDoWhile = reversedDoWhile * 10 + (tempDoWhile % 10);
                tempDoWhile /= 10;
            } while (tempDoWhile > 0);
        }

        System.out.print("Результат циклу do-while: ");
        if (number < 0 && reversedDoWhile != 0) {
            System.out.print("-");
        }
        System.out.printf(format, reversedDoWhile);

        scanner.close();
    }
}
