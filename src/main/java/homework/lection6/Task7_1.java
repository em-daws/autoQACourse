package homework.lection6;

public class Task7_1 {

    public static void main(String[] args) {

        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
        System.out.println(repeatEnd("Hello", 0));
        System.out.println(repeatEnd("Hello", 5));
    }

    //Для заданого рядка і цілочисельного значення n повернути рядок, створений з n повторень останніх n символів
    //у вихідному рядку. Можна припускати, що значення n знаходиться в межах від 0 до довжини рядка включно.
    //
    //repeatEnd("Hello", 3) → "llollollo”
    //repeatEnd("Hello", 2) → "lolo”
    //repeatEnd("Hello", 1) → "o”

    public static String repeatEnd(String line, int times) {
        StringBuilder result = new StringBuilder();
        String subline = line.substring(line.length() - times);
        result.append(subline.repeat(Math.max(0, times)));
        return result.toString();
    }
}
