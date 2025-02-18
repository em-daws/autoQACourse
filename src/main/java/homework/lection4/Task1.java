package homework.lection4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        squareOfANumber();
        cylinderVolume(3.5, 10.0);
        System.out.println(myPowImplementation(5, 6));
    }

    //Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
    public static void squareOfANumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть ціле число:");
        int s1 = Integer.parseInt(s.nextLine());
        System.out.println("Квадрат числа " + s1 + " дорівнює " + (s1 * s1));
    }

    //Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра.
    // Виведіть об'єм циліндра на екран.
    public static void cylinderVolume(double radius, double height) {
        double volume = Math.PI * (radius * radius) * height;
        String resultToDisplay = String.format("Об'єм циліндра з радіусом %s і висотою %s дорівнює %s.", radius, height, volume);
        System.out.println(resultToDisplay);
    }

    //Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
    public static int myPowImplementation(int number, int exponent) {
        int result = number;
        for (int i = 1; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

}
