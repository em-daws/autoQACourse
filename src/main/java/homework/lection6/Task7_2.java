package homework.lection6;

public class Task7_2 {

    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    //Для двох рядків a і b створити більший рядок, складений з першого символу з a, першого символу з b,
    //другого символу з a, другого символу з b і так далі. Будь-які залишкові символи додаються в кінець результату.
    //
    //mixString("abc", "xyz") → "axbycz”
    //mixString("Hi", "There") → "HTihere”
    //mixString("xxxx", "There") → "xTxhxexre”

    public static String mixString(String stringA, String stringB) {
        StringBuilder result = new StringBuilder();
        int lengthOfA = stringA.length();
        int lengthOfB = stringB.length();

        for (int i = 0; i < (Integer.max(lengthOfA, lengthOfB)); i++) {
            if (lengthOfA > i) {
                result.append(stringA.charAt(i));
            }
            if (lengthOfB > i) {
                result.append(stringB.charAt(i));
            }
        }
        return result.toString();
    }
}
