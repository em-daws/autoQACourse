package homework.lection12;

import com.sun.source.doctree.InlineTagTree;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        //Створіть колекцію, що буде мати у собі наступні числа 3, 14, 15, 92, 6 як окремі елементи.
        List<Integer> numbers = new ArrayList<>(List.of(3, 14, 15, 92, 6));
        System.out.println("Numbers collection: " + numbers);

        //Створіть колекцію елементів, що буде містити три рядки - ваше ім’я, прізвище та по батькові як окремі елементи.
        List<String> myData = new ArrayList<>(List.of("Tetiana", "Babeshko", "Valeriivna"));
        System.out.println("My data collection: " + myData);

//        List<String[]> myData = new ArrayList<>(List.<String[]>of(
//                new String[]{"Tetiana", "Babeshko", "Valeriivna"}
//        ));

        //Створіть сет, та переконайтеся, що він може зберігати лише унікальні елементи.
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        Set<Integer> uniqueNumbersCopy = uniqueNumbers;

        uniqueNumbers.add(3);

        System.out.println("Collection has not changed: " + uniqueNumbersCopy.equals(uniqueNumbers));

        //Створіть мапу, що буде містити міста України та їх телефоний код(наприклад Харків - 057).
        Map<String, String> citiesCodes = new HashMap<>();
        citiesCodes.put("Kharkiv", "057");
        citiesCodes.put("Kyiv", "044");
        citiesCodes.put("Kherson", "0552");

        System.out.println("Cities codes: " + citiesCodes);

        //Результати всіх операцій виводьте до консолі.
        //Всі колекції можна реалізувати у методі main.
    }
}
