package homework.lection7;

import java.util.Arrays;

public class Task6_1 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5 };

        System.out.println("Average is: " + average(numbers));
        System.out.println("Max is: " + maxValue(numbers));
        System.out.println("Min is: " + minValue(numbers));
        System.out.println("Reversed: " + Arrays.toString(reverse(numbers)));
        System.out.println("Is present? " + isPresent(5, numbers));

    }

    //Створіть програму, яка виконує наступні дії:
    //Створіть метод для обчислення середнього значення елементів в масиві чисел.

    public static double average(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    //Реалізуйте функціонал для знаходження максимального і мінімального значення у масиві.

    public static int maxValue(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max)
                max = number;
        }
        return max;
    }

    public static int minValue(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min)
                min = number;
        }
        return min;
    }

    //Напишіть метод для виведення елементів масиву в зворотньому порядку.

    public static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[numbers.length - (i + 1)] = numbers[i];
        }
        return reversed;
    }

    //Створіть програму, яка перевіряє, чи є задане число присутнім у введеному користувачем масиві.

    public static boolean isPresent(int numberToCheck, int[] numbers) {
        for (int number : numbers) {
            if (numberToCheck == number)
                return true;
        }
        return false;
    }
}
