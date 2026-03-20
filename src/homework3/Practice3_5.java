package homework3;

import java.util.Random;
import java.util.Scanner;

public class Practice3_5 {

    /*
    Задача 2:
    Вывести нечетные элементы находящиеся под главной диагональю
    (включительно)
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

        System.out.println("All odd number under main diagonal inclusive: ");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (j <= i && twoDimArray[i][j] % 2 != 0) {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
        }
    }
}
