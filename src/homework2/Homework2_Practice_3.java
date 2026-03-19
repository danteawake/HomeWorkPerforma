package homework2;

public class Homework2_Practice_3 {

    /*
    Задача 3:
    Используя for вывести каждое четное число от 2 до 20 включительно и больше
    10
     */

    public static void main(String[] args) {
        int n = 0;

        for (int i = 0; i <= 20; i += 2) {
            if (i > 10) System.out.println(i);
        }
    }
}
