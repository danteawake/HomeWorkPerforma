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

        String min = firstLine;
        if (secondLine.length() < min.length()) {
            min = secondLine;
        }
        if (thirdLine.length() < min.length()) {
            min = thirdLine;
        }

        String max = firstLine;
        if (secondLine.length() > max.length()) {
            max = secondLine;
        }
        if (thirdLine.length() > max.length()) {
            max = thirdLine;
        }

        String mid;
        if (firstLine != min && firstLine != max) {
            mid = firstLine;
        } else if (secondLine != min && secondLine != max) {
            mid = secondLine;
        } else {
            mid = thirdLine;
        }

        int averageLength = Math.toIntExact
                (Math.round((firstLine.length() + secondLine.length() + thirdLine.length()) / 3.0));

        String[] strings = {min, mid, max};
        System.out.println("Average length - " + averageLength);
        for (String s : strings) {
            if (s.length() < averageLength) {
                System.out.println("Line with length below average - " + s);
            }
        }
    }
}
