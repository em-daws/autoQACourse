package homework.lection5;

public class Task3 {

    public static void main(String[] args) {
        calculateSumUpToN(1);
        calculateSumUpToN(3);
        calculateSumUpToN(0);
    }

    //Напишіть програму, яка приймає число N та виводить суму всіх чисел від 1 до N.
    //
    //calculateSumUpToN(1) → “1”
    //calculateSumUpToN(3) → “1 2 3”
    //calculateSumUpToN(0) → “Хибні вхідні параметри”

    public static void calculateSumUpToN(int number) {
        if (number < 1) {
            System.out.println("Хибні вхідні параметри");
        } else {
            int result = 0;
            for (int i = 1; i <= number; i++) {
                result += i;
            }
            System.out.println(result);
        }
    }
}
