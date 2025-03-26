package homework.lection13;

import java.util.HashMap;
import java.util.Map;

public class Task13_3 {

    public static void main(String[] args) {
        formatPrint(countWords(new String[] {"a", "b", "a", "c", "b"}));
        formatPrint(countWords(new String[] {"c", "b", "a"}));
        formatPrint(countWords(new String[] {"c", "c", "c", "c"}));
    }

    //Це класичний алгоритм підрахунку слів: задано масив рядків, повернути Map<String, Integer>
    // з ключем для кожного різного рядка та значенням - кількістю разів, як цей рядок зустрічається в масиві.
    //
    //countWords(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
    //countWords(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
    //countWords(["c", "c", "c", "c"]) → {"c": 4}

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if(map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
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
                    .append(": ")
                    .append(map.get(key))
                    .append(", ");
        }

        System.out.println("{" + sb.substring(0, sb.length() - 2) + "}");
    }
}
