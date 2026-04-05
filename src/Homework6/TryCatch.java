package Homework6;

import java.util.Arrays;

public class TryCatch {

    //1. try-catch
    public void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Divine result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not possible!");
        }
    }

    //2. try-catch, где catch будет несколько
    public void parseNumber(String[] strings) {
        try {
            for (String string : strings) {
                int number = Integer.parseInt(string);
            }
            System.out.println("Transformation was successful: " + Arrays.toString(strings));
        }
        catch (NullPointerException e) {
            System.out.println("Error: An empty object (null) was passed instead of an array!");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: One of the array elements is not a number");
        }
    }

    //3. try-catch, с использованием multi - catch
    public void parseNumberMultiTry(String[] strings) {
        try {
            for (String string : strings) {
                int number = Integer.parseInt(string);
            }
            System.out.println("Transformation was successful: " + Arrays.toString(strings));
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Transformation error: " + e.getClass().getSimpleName());
        }
    }

    //4. try-catch-finally
    public void divideWithFinally(Integer a, Integer b) {
        try {
            int result = a / b;
            System.out.println("Divine result " + a + " / " + b + " = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getClass().getSimpleName());
        }
        catch (Exception e) {
            System.out.println("Unknown error: " + e.getClass().getSimpleName());
        }
        finally {
            System.out.println("You will see this no matter what");
        }
    }
}
