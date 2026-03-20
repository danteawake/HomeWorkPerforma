package homework3;

import java.util.Random;
import java.util.Scanner;

public class Practice3_7 {

    /*
    Задача 4:
    Посчитать сумму четных элементов стоящих над побочной диагональю (не
    включительно)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();
        int sum = 0;

        int[][] twoDimArray = new int[number][number];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = random.nextInt(51);
                if (twoDimArray[i][j] < 10) {
                    System.out.print(twoDimArray[i][j] + "  ");
                } else {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length - 1 - i; j++) {
                if (twoDimArray[i][j] % 2 == 0) {
                    sum += twoDimArray[i][j];
                }
            }
        }

        System.out.println("Sum of even number above side diagonal = " + sum);
    }
}
