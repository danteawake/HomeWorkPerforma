package Homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Home2 {

    /*
    Задача 2:
    Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
    возрастания значений их длины.
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

        String[] strings = {min,mid,max};
        System.out.println(Arrays.toString(strings));
    }
}
