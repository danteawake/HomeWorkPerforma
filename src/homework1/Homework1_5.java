package homework1;

public class Homework1_5 {

    /*
    Задача 5:
    В переменных q и w хранятся два натуральных числа. Создайте программу,
    выводящую на экран результат деления q на w с остатком. Пример вывода
    программы (для случая, когда в q хранится 21, а в w хранится 8):
    21 / 8 = 2 и 5 в остатке.
     */

    public static void main(String[] args) {

        int q = 20;
        int w = 6;

        int nod = q % w;
        int division = q / w;

        System.out.println(q + " / " + w + " = " + division + " и " + nod + " в остатке");

    }
}
