package Homework7;

import java.util.Scanner;

public class Home5 {

    /*
    Задача 5:
    Вывести на консоль новую строку, которой задублирована каждая буква из
    начальной строки. Например, "Hello" -> "HHeelllloo"
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line");
        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            sb.append(line.charAt(i)).append(line.charAt(i));
        }

        System.out.println(line);
        System.out.println(sb);
    }
}
