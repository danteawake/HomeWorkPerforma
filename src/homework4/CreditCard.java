package homework4;

import java.util.Scanner;

public class CreditCard {
    private final int MAXIMUM_DEPOSIT = 100_000;
    private final int MAXIMUM_WITHDRAWAL = 50_000;
    private final int ACCOUNT_NUMBER = (int) ((Math.random() * 899_999_999) + 100_000_000);
    private int currentBalance = (int) (Math.random() * 999_999);

    public void addBalance() {
        Scanner scanner = new Scanner(System.in);
        checkBalance();
        System.out.println("The maximum possible deposit amount is " + MAXIMUM_DEPOSIT);
        System.out.println("How much money you want to deposit?");
        int amount = scanner.nextInt();
        if (MAXIMUM_DEPOSIT < amount) {
            System.out.println("The maximum possible deposit amount is " + MAXIMUM_DEPOSIT + "!!!");
        } else {
            currentBalance += amount;
            System.out.println("Replenishment of balance on " + amount);
        }
        checkBalance();
    }

    public void reduceBalance() {
        Scanner scanner = new Scanner(System.in);
        checkBalance();
        System.out.println("The maximum possible withdrawal amount is " + MAXIMUM_WITHDRAWAL);
        System.out.println("How much money you want to draw?");
        int amount = scanner.nextInt();
        if (currentBalance < amount) {
            System.out.println("Insufficient funds!!!");
            System.out.println("---------------------------");
        } else if (MAXIMUM_WITHDRAWAL < amount) {
            System.out.println("The maximum possible withdrawal amount is " + MAXIMUM_WITHDRAWAL + "!!!");
        } else {
            currentBalance -= amount;
            System.out.println("Withdrawal of funds for " + amount);
        }
        checkBalance();
    }

    public void checkBalance() {
        System.out.println("Account № " + ACCOUNT_NUMBER);
        System.out.println("Current balance = " + currentBalance);
        System.out.println("---------------------------");
    }
}
