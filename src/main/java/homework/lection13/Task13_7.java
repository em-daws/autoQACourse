package homework.lection13;

import java.util.*;

public class Task13_7 {

    public static void main(String[] args) {
        LinkedHashSet<Integer> setA = new LinkedHashSet<>(List.of(1, 2, 3, 4));
        LinkedHashSet<Integer> setB = new LinkedHashSet<>(List.of(3, 5, 6));
        System.out.println(doBothSetsHaveCommonElements(setA, setB));
    }

    //Визначити, чи є спільні елементи в двох множинах.
    //Приклад: Для LinkedHashSet A = [1, 2, 3, 4] та LinkedHashSet B = [3, 5, 6], очікуваний результат true.

    public static boolean doBothSetsHaveCommonElements(LinkedHashSet<Integer> setA, LinkedHashSet<Integer> setB) {
        boolean setAHasCommonElement = false;

        for (Integer i : setA) {
            if (setB.contains(i)) {
                setAHasCommonElement = true;
                break;
            }
        }
        return setAHasCommonElement;
    }
}
