package Homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    /*
    Задача 1:
    1.1 Объединить 2 строки в одну 2-мя способами.
    1.2 Проверить 2 строки на равенство с и без учета регистра.
    1.3 Вернуть подстроку с 3-го символа до конца.
    1.4 Вывести длину строки
    1.5 Вывести порядковый номер любого символа в строке.
    1.6 Преобразовать логический тип true к строке.
    1.7 Перевести строку в верхний регистр.
    1.8 Заменить ‘1’ в строке на ‘%’.
    1.9 Убрать все пробелы в строке с двух сторон.
    1.10 Проверить, пустая ли строка.
    1.11 Разбить строку на несколько по делителю.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first line");
        String firstString = scanner.nextLine();
        System.out.println("Enter second line");
        String secondString = scanner.nextLine();

        //1.1 Объединить 2 строки в одну 2-мя способами.
        String finalString1 = "";
        finalString1 = finalString1.concat(firstString).concat(secondString);
        System.out.println("Result of the union №1 : " + finalString1);

        String finalString2 = "";
        finalString2 = String.join(finalString2, firstString, secondString);
        System.out.println("Result of the union №2 : " + finalString2);

        //1.2 Проверить 2 строки на равенство с и без учета регистра.
        System.out.println("Is lines equals - "
                + (firstString.equals(secondString) ? "Yes" : "No"));
        System.out.println("Is lines equals with ignored case : "
                + (firstString.equalsIgnoreCase(secondString) ? "Yes" : "No"));

        //1.3 Вернуть подстроку с 3-го символа до конца.
        System.out.println("Returning a string without taking into account the first 3 characters : "
                + finalString1.substring(3));

        //1.4 Вывести длину строки
        System.out.println("Number of characters in line : " + finalString1.length());

        //1.5 Вывести порядковый номер любого символа в строке.
        System.out.println("Enter char index from 1 to " + finalString1.length());
        int charIndex = scanner.nextInt();
        if (charIndex > finalString1.length() | charIndex <= 0) {
            System.out.println("Index out of line borders");
        } else {
            System.out.println("The character that matches the index : "
                    + "'" + finalString1.charAt(charIndex - 1) + "'");
        }

        //1.6 Преобразовать логический тип true к строке.
        boolean boolean1 = false;
        String booleanToString = String.valueOf(boolean1);
        System.out.println("Convert boolean to string : " + booleanToString);

        //1.7 Перевести строку в верхний регистр.
        System.out.println("Convert line to lowerCase : " + finalString1.toLowerCase());

        //1.8 Заменить ‘1’ в строке на ‘%’.
        StringBuilder finalStringSb = new StringBuilder(finalString1);
        for (int i = 0; i <= finalString1.length() - 1; i++) {
            if (finalString1.charAt(i) == '1') {
                finalStringSb.setCharAt(i, '%');
            }
        }
        System.out.println("Replace all 1 in line to '%' : " + finalStringSb);

        //1.9 Убрать все пробелы в строке с двух сторон.
        System.out.println("Delete all spaces on both sides :  '" + finalString1.trim() + "'");

        // 1.10 Проверить, пустая ли строка.
        System.out.println("Is line empty : " + (finalString1.isEmpty() ? "Yes" : "No"));

        //1.11 Разбить строку на несколько по делителю.
        String[] stringArray;
        stringArray = finalString1.split(" ");
        System.out.println(Arrays.toString(stringArray));
    }
}
