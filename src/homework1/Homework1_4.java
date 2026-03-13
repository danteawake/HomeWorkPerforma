package homework1;

public class Homework1_4 {

    /*
    Задача 4:
    В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, которая округляет число n до ближайшего целого и
    выводящую результат на экран.
     */

    public static void main(String[] args) {

        double n = 3532.545345;

        int roundUp = (int) ((n * 10) % 10) / 5;
        int result = (int) (n + roundUp);

        System.out.println("Nearest integer to " + n + " = " + result);

    }
}
