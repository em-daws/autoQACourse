package homework.lection13;

import java.util.*;

public class Task13_6 {

    public static void main(String[] args) {
        int[] integer = new int[]{3, 1, 2, 2, 1, 2, 3, 3, 3};
        System.out.println(theMostFrequent(integer));
    }

    //Умова: Знайдіть елемент, який зустрічається найчастіше у списку.
    //
    //Приклад: Для списку [3, 1, 2, 2, 1, 2, 3, 3, 3], очікуваний результат 3,
    // оскільки він зустрічається найбільшу кількість разів.

    public static int theMostFrequent(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.replace((arr[i]), map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) > max) {
                max = map.get(arr[i]);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), max)) {
                result = entry.getKey();
            }
        }

        return result;
    }
}
