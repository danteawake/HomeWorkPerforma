package homework3;

import java.util.Arrays;

public class Practice3_2 {

    /*
    Задача 2:
    2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
    2.2 вывести в консоль второй и четвертый.
    2.3 вывести в консоль длину массива.
    2.4 третий фрукт заменить на иной.
    2.5 проверить результат в консоли.
     */

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange", "Apple"}; //2.1

        System.out.println(fruits[1] + " " + fruits[3]); //2.2

        System.out.println("Array length = " + fruits.length); //2.3

        fruits[2] = "Tomato"; //2.4

        System.out.println(Arrays.toString(fruits)); //2.5
    }
}
