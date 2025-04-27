package homework.lection5;

public class Task1 {

    public static void main(String[] args) {
        checkAge(17);
    }

    //Напишіть програму, яка приймає вік користувача та виводить повідомлення, чи він є дорослим (вік 18 і більше) чи ні.
    //
    //checkAge(18) → "Ви доросла особа"
    //checkAge(0) → "Ви не є дорослою особою"
    //checkAge(99) → "Ви доросла особа"

    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Ви доросла особа");
        } else {
            System.out.println("Ви не є дорослою особою");
        }
    }
}
