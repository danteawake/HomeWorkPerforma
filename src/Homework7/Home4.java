package Homework7;

import java.util.Scanner;

public class Home4 {

    /*
    Задача 4:
    Ввести 3 строки с консоли. Найти слово, состоящее только из различных
    символов. Если таких слов несколько, найти первое из них.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first line");
        String firstLine = scanner.nextLine();
        System.out.println("Enter second line");
        String secondLine = scanner.nextLine();
        System.out.println("Enter third line");
        String thirdLine = scanner.nextLine();

        String[] strings = {firstLine, secondLine, thirdLine};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            String[] words = strings[i].split(" ");    //в цикле идем по слова в строке и создаем массив слов через пробел
            boolean found = false; //если нашли

            for (int j = 0; j < words.length; j++) {    //идем по массиву слов
                String word = words[j];
                boolean isCharsDifferent = true; //если слово из разных букв

                for (int k = 0; k < word.length(); k++) { //идем по символам в слове
                    char letter = word.charAt(k);

                    for (int l = k + 1; l < word.length(); l++) { //цикл поиска похожего символа в слове
                        if (letter == word.charAt(l)) {
                            isCharsDifferent = false;
                            break;
                        }
                    }
                    if (!isCharsDifferent) {
                        break;
                    }
                }

                if (isCharsDifferent) {
                    sb.append(word);
                    found = true;
                    break;
                }
            }
            if (found) break;

        }

        if (!sb.isEmpty()) {
            System.out.println("First word with different letters - " + sb);
        } else {
            System.out.println("No such word found.");
        }
    }
}
