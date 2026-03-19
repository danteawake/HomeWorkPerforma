package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_5 {

    /*
    Задача 5:
    Пройти по массиву и поменять местами элементы первый и последний, второй
    и предпоследний и т.д.
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

        for (int i = 0; i < array.length / 2; i++) {
            int buffer = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buffer;
        }
        System.out.println(Arrays.toString(array));
    }
}
