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
        System.out.println("------------------------------------");
        countOf20s += addCountOf20s;
        countOf50s += addCountOf50s;
        countOf100s += addCountOf100s;
    }

    public boolean withdraw(int sum) {
        System.out.println("------------------------------------");
        int countOf100sWithdraw; // количество купюр, которое надо вывести в идеале (если они есть)
        int countOf50sWithdraw;
        int countOf20sWithdraw;
        int countOf100sWithdrawPossible = 0; // количество купюр, которое будет выведено пользователю при успешной выдаче
        int countOf50sWithdrawPossible = 0;
        int countOf20sWithdrawPossible = 0;

        int originalSum = sum;
        boolean isOk = true;

        /*
          Если в методе checkSum(int sum) прошли все проверки, тогда логика снятия отработает
         */
        if (checkSum(sum)) {
            countOf100sWithdraw = sum / HUNDRED;
            if (countOf100s > countOf100sWithdraw) { //сравниваем количество купюр в банкомате с тем, которое в идеале надо вывести
                sum -= countOf100sWithdraw * HUNDRED;
                countOf100s -= countOf100sWithdraw;
                countOf100sWithdrawPossible = countOf100sWithdraw; //количество купюр которое выведет пользователь = запрошенному в идеале
            } else {
                sum -= countOf100s * HUNDRED; //если в идеальном варианте их не хватает, выводим все купюры этого номинала и сумму в банкомате меняем исходя из этого
                countOf100sWithdrawPossible = countOf100s; //пользователь выведет столько, сколько сейчас есть в банкомате
                countOf100s = 0; //обнуляем, пользователь их вывел
            }
            if (sum >= FIFTY) {
                countOf50sWithdraw = sum / FIFTY;
                if (countOf50s > countOf50sWithdraw) {
                    sum -= countOf50sWithdraw * FIFTY;
                    countOf50s -= countOf50sWithdraw;
                    countOf50sWithdrawPossible = countOf50sWithdraw;
                } else {
                    sum -= countOf50s * FIFTY;
                    countOf50sWithdrawPossible = countOf50s;
                    countOf50s = 0;
                }
            }
            if (sum >= TWENTY) {
                countOf20sWithdraw = sum / TWENTY;
                if (countOf20s > countOf20sWithdraw) {
                    sum -= countOf20sWithdraw * TWENTY;
                    countOf20s -= countOf20sWithdraw;
                    countOf20sWithdrawPossible = countOf20sWithdraw;
                } else {
                    sum -= countOf20s * TWENTY;
                    countOf20sWithdrawPossible = countOf20s;
                    countOf20s = 0;
                }
            }
        } else {
            isOk = false;
        }
        if (sum > 0) {
            System.out.println("Amount withdraw - " + (originalSum - sum)); //пишем сколько выдано
            System.out.println("Funds not issued - " + sum + ". No exchange"); //пишем сколько не выдано из запрошенных средств причина - нет размена
        } else {
            System.out.println("Amount withdraw - " + originalSum); //пишем сколько выдано
        }
        if (isOk) {
            System.out.println("Issued in banknotes:"); //пишем сколько выдано средств и сколько банкнот, если успех
            System.out.println("100s - " + countOf100sWithdrawPossible);
            System.out.println("50s - " + countOf50sWithdrawPossible);
            System.out.println("20s - " + countOf20sWithdrawPossible);
        }
        return isOk;
    }

    /**
     * Выводит баланс в банкомате и количество купюр
     */
    public void checkBalance() {
        int balance = countOf20s * 20 + countOf50s * 50 + countOf100s * 100;
        System.out.println("------------------------------------");
        System.out.println("ATM balance - " + balance);
        System.out.println("Number of 100s - " + countOf100s);
        System.out.println("Number of 50 - " + countOf50s);
        System.out.println("Number of 20 - " + countOf20s);
    }

    /**
     * Метод, который принимает сумму для проверки того, больше ли она баланса в банкомате
     * Больше ли сумма минимальной банкноты (20)
     * Больше ли сумма минимально возможной выдачи {@link #minBalance()}
     *
     * @param sum сумма для проверки относительно баланса
     * @return true - если все проверки успешны
     */
    private boolean checkSum(int sum) {
        boolean check = true;
        int balance = countOf20s * 20 + countOf50s * 50 + countOf100s * 100;

        if (sum > balance) {
            System.out.println("ATM have not enough money");
            check = false;
        } else if (sum < TWENTY) {
            System.out.println("The amount must be more than " + TWENTY);
            check = false;
        } else if (sum < minBalance()) {
            System.out.println("The amount must be more than " + minBalance());
            check = false;
        }
        return check;
    }

    /**
     * @return возвращает минимально возможную сумму для выдачи, допустим если в банкомате нет купюр 20, а пользователь
     * * хочет вывести 40
     */
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