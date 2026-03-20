package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_3 {

    /*
    Задача 3:
    Найти индексы минимального и максимального элементов и вывести в консоль.
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

        int max = 0;
        int min = 0;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }

        System.out.println("Maximum element index is "+ maxIndex);
        System.out.println("Minimum element index is "+ minIndex);
    }
}
