package Homework7;

import java.util.Scanner;

public class Home1 {

    /*
    Задача 1:
    Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
    Вывести найденные строки и их длину.
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

        System.out.println("Line with minimum length ("+min.length()+") : "+ min);
        System.out.println("Line with maximum length ("+max.length()+") : "+ max);
    }
}
