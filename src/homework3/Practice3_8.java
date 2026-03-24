package homework3;

import java.util.Random;
import java.util.Scanner;

public class Practice3_8 {

    /*
    Задача 5
    Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
    строкой и т. д.)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();

        int[][] twoDimArray = new int[number][number];
        int[][] twoDimArrayBuffer = new int[number][number];
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
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArrayBuffer[i][j] = twoDimArray[i][j];
            }
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = twoDimArrayBuffer[j][i];
            }
        }

        System.out.println("--------------------------");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j] < 10) {
                    System.out.print(twoDimArray[i][j] + "  ");
                } else {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
