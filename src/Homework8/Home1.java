package Homework8;

    /*
    Задача 1:
    Пользователь вводит набор чисел в виде одной строки с клавиатуры.
    Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
    Вывести результат на экран.
    При решении использовать коллекции.
    */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Home1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a set of numbers separated by commas (e.g., 1, 2, 3, 4, 5)");
        String line = scanner.nextLine();

        boolean hasAlphabetic = false;
        for (char c : line.toCharArray()){
            if (Character.isLetter(c)){
                hasAlphabetic = true;
                break;
            }
        }

        if (hasAlphabetic == true){
            System.out.println("Line contains letters");
        } else {
            String[] numbersString = line.split(",");
            Set<Integer> numberSet = new HashSet<>();

            for (String s : numbersString) {
                int number = Integer.parseInt(s.trim());
                numberSet.add(number);
            }
            System.out.println("Result without duplicates: " + numberSet);
        }
    }
}


