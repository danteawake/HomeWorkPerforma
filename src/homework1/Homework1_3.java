package homework1;

public class Homework1_3 {

    /*
    Задача 3:
    В переменной n хранится трёхзначное число. Создайте программу,
    вычисляющую и выводящую на экран сумму цифр n. Например: n = 126, в
    результате мы должны получить 9 (1+2+6).
     */

    public static void main(String[] args) {
        int n = 365;

        int firstDigit = n / 100;
        int secondDigit = (n - (firstDigit * 100)) / 10;
        int thirdDigit = n - firstDigit * 100 - secondDigit * 10;

        int result = firstDigit + secondDigit + thirdDigit;

        System.out.println("Sum of digits of a number " + n + " " +
                "= " + result + " (" + firstDigit + " + " + secondDigit + " + " + thirdDigit + ")");
    }
}
