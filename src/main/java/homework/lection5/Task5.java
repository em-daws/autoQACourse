package homework.lection5;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(isPrime(0));
        System.out.println(isPrime(8));
        System.out.println(isPrime(7));
        System.out.println(isPrime(2));
        System.out.println(isPrime(17));
        System.out.println(isPrime(18));
    }

    //Напишіть програму, яка приймає число N та перевіряє, чи є воно простим числом.
    //
    //isPrime(0) → false
    //isPrime(8) → false
    //isPrime(7) → true

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
