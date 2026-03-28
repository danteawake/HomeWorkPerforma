package homework4;

public class ATM {
    private final int HUNDRED = 100;
    private final int FIFTY = 50;
    private final int TWENTY = 20;
    private int countOf20s;
    private int countOf50s;
    private int countOf100s;

    public ATM(int countOf20s, int countOf50s, int countOf100s) {
        this.countOf20s = countOf20s;
        this.countOf50s = countOf50s;
        this.countOf100s = countOf100s;
    }

    public void addBalance(int addCountOf20s, int addCountOf50s, int addCountOf100s) {
        countOf20s += addCountOf20s;
        countOf50s += addCountOf50s;
        countOf100s += addCountOf100s;
    }

    public boolean withdraw(int sum) {
        int countOf100sWithdraw = 0;
        int countOf50sWithdraw = 0;
        int countOf20sWithdraw = 0;
        int originalSum = sum;
        boolean isOk = true;

        if (checkSum(sum)) {
            countOf100sWithdraw = sum / HUNDRED;
            if (countOf100s > countOf100sWithdraw) {
                sum -= countOf100sWithdraw * HUNDRED;
                countOf100s -= countOf100sWithdraw;
            } else {
                sum -= countOf100s * HUNDRED;
                countOf100s = 0;
            }

            if (sum >= FIFTY) {
                countOf50sWithdraw = sum / FIFTY;
                if (countOf50s > countOf50sWithdraw) {
                    sum -= countOf50sWithdraw * FIFTY;
                    countOf50s -= countOf50sWithdraw;
                } else {
                    sum -= countOf50s * FIFTY;
                    countOf50s = 0;
                }
            }
            if (sum >= TWENTY) {
                countOf20sWithdraw = sum / TWENTY;
                if (countOf20s > countOf20sWithdraw) {
                    sum -= countOf20sWithdraw * TWENTY;
                    countOf20s -= countOf20sWithdraw;
                } else {
                    sum -= countOf20s * TWENTY;
                    countOf20s = 0;
                }
            }
        } else {
            isOk = false;
        }
        if (sum > 0) {
            System.out.println("Amount withdraw - " + (originalSum - sum));
            System.out.println("Funds not issued - " + sum + ". No exchange");

        } else {
            System.out.println("Amount withdraw - " + originalSum);
        }
        System.out.println("Issued in banknotes:");
        System.out.println("100s - " + countOf100sWithdraw);
        System.out.println("50s - " + countOf50sWithdraw);
        System.out.println("20s - " + countOf20sWithdraw);
        return isOk;
    }

    public void checkBalance() {
        int balance = countOf20s * 20 + countOf50s * 50 + countOf100s * 100;
        System.out.println("ATM balance - " + balance);
        System.out.println("Number of 100s - " + countOf100s);
        System.out.println("Number of 50 - " + countOf50s);
        System.out.println("Number of 20 - " + countOf20s);
    }

    private boolean checkSum(int sum) {
        boolean check = true;
        int balance = countOf20s * 20 + countOf50s * 50 + countOf100s * 100;

        if (sum > balance) {
            System.out.println("ATM have not enough money");
            check = false;
        } else if (sum < 20) {
            System.out.println("The amount must be more than 20");
            check = false;
        } else if (sum < minBalance()) {
            System.out.println("The amount must be more than " + minBalance());
            check = false;
        }
        return check;
    }

    private int minBalance() {
        int minBalance = 0;
        if (countOf20s != 0) {
            minBalance = TWENTY;
        } else if (countOf50s != 0) {
            minBalance = FIFTY;
        } else if (countOf100s != 0) {
            minBalance = HUNDRED;
        }
        return minBalance;
    }
}
