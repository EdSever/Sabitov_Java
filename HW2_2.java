import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        Scanner stroka = new Scanner(System.in);

        System.out.print("Введите строку a: ");
        String a = stroka.nextLine();
        System.out.print("Введите строку b: ");
        String b = stroka.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        stroka.close();
    }
}