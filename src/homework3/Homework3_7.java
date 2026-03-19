package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_7 {

    /*
    Задача *:
    Имеется массив из неотрицательных чисел(любой). Представьте что массив
    представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
    добавить единицу к этому “числу” и на выходе получить исправленный массив.
    Массив не содержит нуля в начале, кроме самого числа 0.
    Пример:
    Input: [1,4,0,5,6,3]
    Output: [1,4,0,5,6,4]
    Input: [9,9,9]
    Output: [1,0,0,0]
     */

    public static void main(String[] args) {
        /*
        Этот вариант будет работать только если числа в массиве состоят из одной цифры
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int number = scanner.nextInt();

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array " + (i + 1) + " element");
            array[i] = scanner.nextInt();
        }
        System.out.println("Input: " + Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] += 1;
            if ((array[i] - 1) != 9) {
                break;
            }
            array[i] = 0;
        }
        if (array[0] == 0) {
            array = new int[array.length + 1];
            array[0] = 1;
        }

        System.out.println("Output: " + Arrays.toString(array));
    }
}
