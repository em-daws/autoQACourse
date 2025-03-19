package homework.lection13;

import java.util.HashMap;
import java.util.Map;

public class Task13_1 {

    public static void main(String[] args) {
        formatPrint(getLengthOfStrings(new String[] {"a", "bb", "a", "bb"}));
        formatPrint(getLengthOfStrings(new String[] {"this", "and", "that", "and"}));
        formatPrint(getLengthOfStrings(new String[] {"code", "code", "code", "bug"}));
    }

    //Задача полягає в тому, щоб створити і повернути Map<String, Integer>,
    // де кожен унікальний рядок з масиву String[] буде ключем, а значенням буде його довжина.
    //
    //getLengthOfStrings(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
    //getLengthOfStrings(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
    //getLengthOfStrings(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3

    public static Map<String, Integer> getLengthOfStrings(String[] initialArray) {
        Map<String, Integer> map = new HashMap<>();

        for (String string : initialArray) {
            if (!map.containsKey(string)) {
                map.put(string, string.length());
            }
        }
        return map;
    }

    public static void formatPrint(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (String key : map.keySet()) {
            sb.append("\"")
                    .append(key)
                    .append("\"")
                    .append(" : ")
                    .append(map.get(key))
                    .append(", ");
        }

        System.out.println(sb);
    }
}
