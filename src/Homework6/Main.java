package Homework6;

public class Main {

    /*
    Задача 1:
    Создать класс с как минимум 4 разными методами, в каждом методе добавить
    проверку на исключительные ситуации, используя:
    1. try- catch
    2. try-catch, где catch будет несколько
    3. try -catch, с использованием multi - catch
    4. try-catch-finally
    Продемонстрировать обработку исключительных ситуаций на примерах
     */

    public static void main(String[] args) {

        TryCatch tryCatch = new TryCatch();
        //1. try-catch
        tryCatch.divideNumbers(5, 2);
        tryCatch.divideNumbers(5, 0);
        System.out.println("---------------------");

        //2. try-catch, где catch будет несколько
        tryCatch.parseNumberMultiTry(new String[]{"123", "Banana", "456"});
        tryCatch.parseNumber(new String[]{"123", "Banana", "456"});
        tryCatch.parseNumber(null);
        System.out.println("---------------------");

        //3. try -catch, с использованием multi - catch
        tryCatch.parseNumberMultiTry(new String[]{"123", "Banana", "456"});
        tryCatch.parseNumberMultiTry(null);
        System.out.println("---------------------");

        //4. try-catch-finally
        tryCatch.divideWithFinally(5, 2);
        tryCatch.divideWithFinally(5, 0);
        tryCatch.divideWithFinally(null, 0);
        System.out.println("---------------------");
    }
}
