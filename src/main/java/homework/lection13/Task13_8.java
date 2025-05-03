package homework.lection13;

import java.util.List;
import java.util.TreeSet;

public class Task13_8 {

    public static void main(String[] args) {
        TreeSet<Integer> setA = new TreeSet<>(List.of(1, 2, 3));
        TreeSet<Integer> setB = new TreeSet<>(List.of(3, 4, 5));
        System.out.println(unite(setA, setB));
    }

    //Умова: Об'єднайте два TreeSet у третій TreeSet, зберігаючи унікальність елементів.
    //Приклад: Для TreeSet A = [1, 2, 3] та TreeSet B = [3, 4, 5], очікуваний результат [1, 2, 3, 4, 5].

    public static TreeSet<Integer> unite(TreeSet<Integer> setA, TreeSet<Integer> setB) {
        TreeSet<Integer> unitedTreeSet = new TreeSet<>(setA);
        unitedTreeSet.addAll(setB);
        return unitedTreeSet;
    }
}
