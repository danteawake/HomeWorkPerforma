package Homework7;

import java.util.Scanner;

public class Home3 {

    /*
    Задача 3:
    Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
    меньше средней, а также их длину
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first line");
        String firstLine = scanner.nextLine();
        System.out.println("Enter second line");
        String secondLine = scanner.nextLine();
        System.out.println("Enter third line");
        String thirdLine = scanner.nextLine();

        int averageLength = Math.toIntExact
                (Math.round((firstLine.length() + secondLine.length() + thirdLine.length()) / 3.0));

        String[] strings = {firstLine, secondLine, thirdLine};
        System.out.println("Average length - " + averageLength);
        for (String s : strings) {
            if (s.length() < averageLength) {
                System.out.println("Line with length below average - " + s);
            }
        }
    }
}
