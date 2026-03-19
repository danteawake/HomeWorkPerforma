package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_2 {

    /*
    Задача 2:
    Найти минимальный - максимальный элементы и вывести в консоль.
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

//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int max = array[array.length - 1];
//        int min = array[0];

        //without sorting
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Maximum array element = " + max);
        System.out.println("Minimum array element = " + min);
    }
}
