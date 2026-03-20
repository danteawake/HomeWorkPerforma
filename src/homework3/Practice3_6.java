package homework3;

import java.util.Random;
import java.util.Scanner;

public class Practice3_6 {

    /*
    Задача 3:
    Проверить произведение элементов какой диагонали больше.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();
        int sideDiagonal = 1;
        int mainDiagonal = 1;

        int[][] twoDimArray = new int[number][number];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = random.nextInt(5) + 1;
                if (twoDimArray[i][j] < 10) {
                    System.out.print(twoDimArray[i][j] + "  ");
                } else {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
            System.out.println();
        }

        int count = 0;
        for (int i = twoDimArray.length - 1; i >= 0; i--) {
            sideDiagonal *= twoDimArray[i][count];
            count++;
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            mainDiagonal *= twoDimArray[i][i];
        }

        System.out.println("Product of main diagonal numbers = " + mainDiagonal);
        System.out.println("Product of side diagonal numbers = " + sideDiagonal);

        if (mainDiagonal > sideDiagonal) {
            System.out.println("Product of main diagonal numbers > product of side diagonal numbers");
        } else if (sideDiagonal > mainDiagonal) {
            System.out.println("Product of side diagonal numbers > product of main diagonal numbers");
        } else {
            System.out.println("Product of main diagonal numbers = product of side diagonal numbers");
        }
    }
}
