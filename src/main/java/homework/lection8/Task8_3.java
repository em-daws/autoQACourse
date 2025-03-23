package homework.lection8;

public class Task8_3 {
    public static void main(String[] args) {
        System.out.println(sumIgnoreSections(new int[]{1, 2, 2}));
        System.out.println(sumIgnoreSections(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(sumIgnoreSections(new int[]{1, 1, 6, 7, 2}));
    }

    //Повернути суму чисел у масиві, ігноруючи ділянки чисел, що починаються з 6 і закінчуються
    // на наступному 7 (кожен 6 буде наслідувати принаймні одна 7).
    // Повернути 0 у випадку відсутності чисел.
    //
    //sumIgnoreSections([1, 2, 2]) → 5
    //sumIgnoreSections([1, 2, 2, 6, 99, 99, 7]) → 5
    //sumIgnoreSections([1, 1, 6, 7, 2]) → 4

    public static int sumIgnoreSections(int[] numbers) {
        int sum = 0;
        boolean ignore = false;
        int indexWhereToStopIgnoring = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 6 && i != numbers.length - 1) {
                for (int j = i; j < numbers.length; j++) {
                    if (numbers[j] == 7) {
                        ignore = true;
                        indexWhereToStopIgnoring = j;
                        break;
                    }
                }
            }
            if (!ignore) {
                sum += numbers[i];
            }
            if (i == indexWhereToStopIgnoring)
                ignore = false;
        }

        return sum;
    }
}
