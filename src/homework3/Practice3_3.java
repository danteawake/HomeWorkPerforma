package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice3_3 {

    /*
    Задача 3:
    3.1 Создать пустой массив типа double с названием masDouble такого размера,
    который пользователь вводит с клавиатуры.
    3.2 Заполнить masDouble рандомными числами, используя Math.random() и
    вывести его в консоль.
    3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в
    прямом и обратном порядке
     */

    public static void main(String[] args) {
        //3.1
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        double[] masDouble = new double[arrayLength];

        //3.2
        Random random = new Random();
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = random.nextDouble(10.0);
        }
        System.out.println(Arrays.toString(masDouble));

        //3.3
        for (int i = 0; i < masDouble.length; i++) {
            if ((int) masDouble[i] % 2 == 0 && (int) masDouble[i] > 1) {
                masDouble[i] *= masDouble[i];
            }
        }
        System.out.println(Arrays.toString(masDouble));

        for (int i = masDouble.length - 1; i >= 0; i--) {
            System.out.print(masDouble[i] + " ");
        }
    }
}
