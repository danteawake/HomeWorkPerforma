package homework4;

public class Main {

    /*
    Задача 1:
    Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    Добавьте метод, который выводит текущую информацию о карточке. Напишите
    программу, которая создает три объекта класса CreditCard у которых заданы
    номер счета и начальная сумма.
    Тестовый сценарий для проверки: Положите деньги на первые две карточки и
    снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
     */

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard();
        CreditCard creditCard3 = new CreditCard();

        creditCard1.addBalance();
        creditCard2.addBalance();
        creditCard3.reduceBalance();
    }
}
