package homework2;

import java.util.Scanner;

public class Homework2_5 {

    /*
    Задача *:
    Напишите программу, где пользователь вводит любое целое положительное
    число.
    А программа суммирует все числа от 1 до введенного пользователем числа. Для
    ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
    пользователь не мог ввести некорректные данные
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        if (number < 0) {
            System.out.println("Negative number entered");
        } else {
            for (int i = 1; i < number; i++) {
                sum += i;
            }
        }

        System.out.println("Sum of numbers from 1 to " + number + " = " + sum);
    }
}
