package homework3;

import java.util.Random;

public class Practice3_1 {

    /*
    Задача 1:
    Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в
    консоль.
     */

    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.println(array[i] *= array[i]);
        }
    }
}
