package homework.lection13;

import java.util.HashMap;
import java.util.Map;

public class Task13_4 {
    public static void main(String[] args) {
        System.out.println(mergeStringsByFirstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(mergeStringsByFirstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(mergeStringsByFirstChar(new String[]{}));
    }

    //Ця задача передбачає створення і повернення Map<String, String>,
    // де ключами будуть різні перші символи зустрінутих рядків,
    // а значеннями будуть всі рядки,
    // які починаються з цього символу, об'єднані у порядку їх зустрічі у вихідному масиві.
    //
    //mergeStringsByFirstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    //mergeStringsByFirstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
    //mergeStringsByFirstChar([]) → {}

    public static Map<String, String> mergeStringsByFirstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        String firstLetter;

        for (String string : strings) {
            firstLetter = string.substring(0, 1);
            if (map.containsKey(firstLetter))
                map.replace(firstLetter, map.get(firstLetter) + string);
            else
                map.put(firstLetter, string);
        }

        return map;
    }
}
