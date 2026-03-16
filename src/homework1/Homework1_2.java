package homework1;

public class Homework1_2 {

    /*
    Задача 2:
    В переменной n хранится двузначное число. Создайте программу,
    вычисляющую и выводящую на экран сумму цифр n. Например: n = 26, в
    результате мы должны получить 8 (2 + 6).
     */

    public static void main(String[] args) {

        int n = 57;

        int firstDigit = n / 10;
        int secondDigit = n - (firstDigit * 10);
        int result = firstDigit + secondDigit;

        System.out.println("Sum of digits of a number " + n + " " +
                "= " + result + " (" + firstDigit + " + " + secondDigit + ")");

    }
}
