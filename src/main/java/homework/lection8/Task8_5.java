package homework.lection8;

public class Task8_5 {

    public static void main(String[] args) {

        System.out.println(differenceLargestSmallest(new int[]{10, 3, 5, 6}));
        System.out.println(differenceLargestSmallest(new int[]{7, 2, 10, 9}));
        System.out.println(differenceLargestSmallest(new int[]{2, 10, 7, 2}));

    }

    //Масив довжиною 1 або більше цілих чисел. Повернути різницю між найбільшим і найменшим значеннями у масиві.
    // Зверніть увагу: вбудовані методи Math.min(v1, v2) та Math.max(v1, v2) повертають менше або більше з двох значень.
    //
    //differenceLargestSmallest([10, 3, 5, 6]) → 7
    //differenceLargestSmallest([7, 2, 10, 9]) → 8
    //differenceLargestSmallest([2, 10, 7, 2]) → 8

    public static int differenceLargestSmallest(int[] numbers) {
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int num : numbers) {
            if (num < smallest)
                smallest = num;
            if (num > largest)
                largest = num;
        }

        return largest - smallest;
    }
}
