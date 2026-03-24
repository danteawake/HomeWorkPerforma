package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_4 {

    /*
    Задача 4:
    Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
    вывести сообщение, что их нет.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int number = scanner.nextInt();
        int zeroNumberCount = 0;

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array " + (i + 1) + " element");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroNumberCount++;
            }
        }
        if (zeroNumberCount > 0) {
            System.out.println("Number of zeros is " + zeroNumberCount);
        } else {
            System.out.println("No zeros in the array");
        }
    }
}
