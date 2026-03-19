package homework2;

import java.util.Scanner;

public class Homework2_Practice_1 {

    /*
    Задача 1:
    Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа
    вывести в консоль соответствующую пору года по номеру месяца. При решении
    использовать switch.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 12, 1, 2 -> System.out.println(number + " месяц это Зима");
            case 3, 4, 5 -> System.out.println(number + " месяц это Весна");
            case 6, 7, 8 -> System.out.println(number + " месяц это Лето");
            case 9, 10, 11 -> System.out.println(number + " месяц это Осень");
            default -> System.out.println("Неверно указан месяц");
        }
    }
}
