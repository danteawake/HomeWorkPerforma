package homework3;

import java.util.Scanner;

public class Homework3_1 {

    /*
    Задача 1:
    Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
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

        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
