package Homework8;

    /*
    Задача 3:
    На вход поступает массив строк, верните Map<String, Boolean>, где каждая
    отдельная строка является ключом, и ее значение равно true, если эта строка
    встречается в массиве 2 или более раз. Пример:
    wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"])→{"c": true}
     */

import java.util.HashMap;
import java.util.Map;

public class Home3 {
    public static void main(String[] args) {
        String[] one = new String[]{"a", "b", "a", "c", "b"};
        String[] two = new String[]{"c", "b", "a"};
        String[] three = new String[]{"c", "c", "c", "c"};
        System.out.println(wordMultiple(one));
        System.out.println(wordMultiple(two));
        System.out.println(wordMultiple(three));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }
        return map;
    }
}
