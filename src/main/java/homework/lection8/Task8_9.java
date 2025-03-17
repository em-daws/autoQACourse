package homework.lection8;

public class Task8_9 {
    public static void main(String[] args) {

        System.out.println(endsWith("AbC", "HiaBc"));
        System.out.println(endsWith("abc", "abXabc"));
        System.out.println(endsWith("Hiabc", "abc"));

        System.out.println(endsWith2("AbC", "HiaBc"));
        System.out.println(endsWith2("abc", "abXabc"));
        System.out.println(endsWith2("Hiabc", "abc"));

    }

    //Задача передбачає порівняння двох рядків та визначення, чи один рядок з'являється в кінці іншого рядка,
    // ігноруючи різницю у великих і малих літерах (тобто порівняння має бути "case insensitive" або нечутливим до регістру).
    // Функція поверне true, якщо хоча б один з рядків з'являється в кінці іншого.
    //
    //endsWith("AbC", "HiaBc") → true
    //endsWith("abc", "abXabc") → true
    //endsWith("Hiabc", "abc") → true

    public static boolean endsWith(String string1, String string2) {
        return string1.toLowerCase().endsWith(string2.toLowerCase())
                || string2.toLowerCase().endsWith(string1.toLowerCase());
    }

    public static boolean endsWith2(String string1, String string2) {
        int string1Length = string1.length();
        int string2Length = string2.length();

        if (string1Length > string2Length) {
            return string1.substring(string1Length - string2Length).equalsIgnoreCase(string2);
        } else if (string1Length < string2Length) {
            return string2.substring(string2Length - string1Length).equalsIgnoreCase(string1);
        } else {
            return string1.equalsIgnoreCase(string2);
        }
    }
}
