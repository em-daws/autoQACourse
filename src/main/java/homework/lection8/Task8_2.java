package homework.lection8;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task8_2 {

    public static void main(String[] args) {
        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }

    //Повернути "центроване" середнє значення масиву цілих чисел, яке є середнім значенням елементів,
    // за винятком найбільшого та найменшого значень у масиві. Якщо є кілька копій найменшого значення,
    // ігнорувати лише одну копію, так само із найбільшим значенням. Використовуйте цілочисельне ділення
    // для обчислення кінцевого середнього. Можна припускати, що довжина масиву дорівнює 3 або більше.
    //
    //centeredAverage([1, 2, 3, 4, 100]) → 3
    //centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
    //centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

    public static int centeredAverage(int[] initialNumbers) {
        int[] numbers = Arrays.copyOf(initialNumbers, initialNumbers.length);
        int sum = 0;

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        for (int number : numbers) {
            sum += number;
        }

        sum = sum - max - min;

        return (int) (sum / (numbers.length - 2));
    }
}
