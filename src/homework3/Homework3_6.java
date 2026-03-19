package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_6 {

    /*
    Задача 6:
    Проверить, является ли массив возрастающей последовательностью (каждое
    следующее число больше предыдущего).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int number = scanner.nextInt();

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array " + (i + 1) + " element");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        boolean isIncreasing = true;
        for (int i = 1; i < array.length; ++i)
            if (array[i] < array[i - 1]) {
                System.out.println("Is not an increasing sequence");
                isIncreasing = false;
                break;
            }

        if (isIncreasing) {
            System.out.println("An increasing sequence");
        }
    }
}
