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

        boolean isFirstDigitZero = false; //проверка на случай если в массиве первый элемент 0
        if (array[0] == 0) {
            isFirstDigitZero = true;
        }

        for (int i = array.length - 1; i >= 0; i--) { //Если переполнения не происходит - не продолжаем
            array[i] += 1;
            if (array[i] < 10) {
                break;
            }
            array[i] = 0; //Если переполнение происходит - ставим 0 и продолжаем со след элемента
        }
        // если изначально первый элемент не был 0, но стал им после всех циклов - создаем новый на 1 больше и копируем
        if (!isFirstDigitZero && array[0] == 0) {
            int[] arrayNew = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                arrayNew[i+1] = array[i];
            }
            arrayNew[0] = 1;
            System.out.println("Output: " + Arrays.toString(arrayNew));
        } else {
            System.out.println("Output: " + Arrays.toString(array));
        }
    }
}

