package homework.lection8;

public class Task8_4 {
    public static void main(String[] args) {
        System.out.println(sumWithoutUnlucky13(new int[]{1, 2, 2, 1}));
        System.out.println(sumWithoutUnlucky13(new int[]{1, 1}));
        System.out.println(sumWithoutUnlucky13(new int[]{1, 2, 2, 1, 13}));
        System.out.println(sumWithoutUnlucky13(new int[]{6, 2, 2, 2, 13, 3, 4, 6, 10}));
    }

    //Повернути суму чисел у масиві, повертаючи 0 для порожнього масиву. Однак число 13 - дуже нещасливе,
    // тому воно не враховується, а також числа, які йдуть одразу після числа 13, також не враховуються.
    //
    //sumWithoutUnlucky13([1, 2, 2, 1]) → 6
    //sumWithoutUnlucky13([1, 1]) → 2
    //sumWithoutUnlucky13([1, 2, 2, 1, 13]) → 6

    public static int sumWithoutUnlucky13(int[] ints) {
        int sum = 0;

        for (int num: ints) {
            if(num == 13) {
                break;
            }
            sum += num;
        }

        return sum;
    }
}
