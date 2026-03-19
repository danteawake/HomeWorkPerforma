package homework2;

import java.util.Scanner;

public class Homework2_2 {

    /*
    Задача 2:
    Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести
    «Warm».
    Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temp = scanner.nextInt();

        if (temp >= 5) {
            System.out.println("Warm");
        }
        if (temp < 5 && temp > -20) {
            System.out.println("Normal");
        }
        if (temp <= -20) {
            System.out.println("Cold");
        }
    }
}
