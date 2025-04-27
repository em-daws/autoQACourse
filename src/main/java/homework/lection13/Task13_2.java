package homework.lection13;

import java.util.HashMap;
import java.util.Map;

public class Task13_2 {

    public static void main(String[] args) {
        System.out.println(createMap(new String[] {"code", "bug"}));
        System.out.println(createMap(new String[] {"man", "moon", "main"}));
        System.out.println(createMap(new String[] {"man", "moon", "good", "night"}));

    }

    //Завдання полягає в тому, щоб створити і повернути Map<String, String>,
    //де ключами будуть перші символи кожного рядка з непорожнього масиву String[],
    //а значеннями будуть останні символи відповідних рядків.
    //
    //createMap(["code", "bug"]) → {"b": "g", "c": "e"}
    //createMap(["man", "moon", "main"]) → {"m": "n"}
    //createMap(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

    public static Map<String, String> createMap (String[] words) {
        Map<String, String> map = new HashMap<>();

        for (String word : words) {
            map.put(word.substring(0, 1), word.substring(word.length() - 1));
        }

        return map;
    }
}
