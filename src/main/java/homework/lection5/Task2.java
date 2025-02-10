package homework.lection5;

public class Task2 {

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(20));
        System.out.println(isPerfectSquare(9));

        //checking
        for (int i = 0; i <= 100; i++) {
            if (isPerfectSquare(i)) {
                System.out.println(i + " is a perfect square");
            }
        }
    }

    //Напишіть програму, яка приймає ціле число від користувача та перевіряє, чи є воно квадратом цілого числа.
    //
    //isPerfectSquare(25) → true
    //isPerfectSquare(20) → false
    //isPerfectSquare(9) → true

    public static boolean isPerfectSquare(int number) {
        double result = Math.sqrt(number);
        return (int) result == result;
    }
}
