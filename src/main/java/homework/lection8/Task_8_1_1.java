package homework.lection8;

public class Task_8_1_1 {

    public static void main(String[] args) {
        System.out.println(countEvenInts(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvenInts(new int[]{2, 2, 0}));
        System.out.println(countEvenInts(new int[]{1, 3, 5}));
    }

    //Повернути кількість парних цілих чисел у заданому масиві.
    //Зверніть увагу: оператор % "mod" обчислює залишок від ділення, наприклад, 5 % 2 дорівнює 1.
    //
    //countEvenInts([2, 1, 2, 3, 4]) → 3
    //countEvenInts([2, 2, 0]) → 3
    //countEvenInts([1, 3, 5]) → 0

    public static int countEvenInts(int[] intsMassive) {
        int countOfEvenInts = 0;

        for (int num : intsMassive) {
            if (num % 2 == 0) {
                countOfEvenInts++;
            }
        }

        return countOfEvenInts;
    }
}
