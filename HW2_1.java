import java.util.Scanner;

public class HW2_1 {
    public static void main(String[] args) {
        Scanner inKonsol = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = inKonsol.nextInt();
        System.out.print("Введите число b: ");
        int b = inKonsol.nextInt();
        System.out.println("");

        // Сравнение чисел
        System.out.println("// Сравнение чисел");
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("");

        // Операции сложения, вычитания, деления и умножения
        System.out.println("// Операции сложения, вычитания, деления и умножения");
        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        double quotient;
        if (b != 0) {
            quotient = (double) a / b;
        } else {
            quotient = Double.NaN;
        }


        System.out.println("Сложение: " + a + " + " + b + " = " + sum);
        System.out.println("Вычитание: " + a + " - " + b + " = " + sub);
        System.out.println("Умножение: " + a + " * " + b + " = " + multi);
        if (b != 0) {
            System.out.println("Деление: " + a + " / " + b + " = " + quotient);
        } else {
            System.out.println("Деление: " + a + " / " + b + " = Деление на ноль невозможно");
        }

        inKonsol.close();
    }
}