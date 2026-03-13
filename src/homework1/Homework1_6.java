package homework1;

public class Homework1_6 {

    /*
    Задача * :
    Написать программу, которая будет менять местами значение целочисленных
    переменных.
    Пример:
    int a = 1;
    int b = 2;
    //код (ваше решение)
    sout(a); //выведет 2
    sout(b); //выведет 1
     */

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

    }
}
