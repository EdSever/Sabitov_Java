public class HW2_3 {
    public static void main(String[] args) {

        int[] massiv = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Четные числа из массива данных:");
        for (int number : massiv) {

            if (number % 2 == 0) {

                System.out.println(number);
            }
        }
    }
}
