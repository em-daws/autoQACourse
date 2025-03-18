package homework.lection8;

public class Task8_6 {

    public static void main(String[] args) {
        System.out.println(doubleChars("The"));
        System.out.println(doubleChars("AAbb"));
        System.out.println(doubleChars("Hi-There"));

        if (!doubleChars("The").equals("TThhee")) throw new AssertionError();
        if (!doubleChars("AAbb").equals("AAAAbbbb")) throw new AssertionError();
        if (!doubleChars("Hi-There").equals("HHii--TThheerree")) throw new AssertionError();
    }

    //Дано рядок. Потрібно повернути рядок, де кожен символ з оригінального рядка повторюється двічі.
    //
    //doubleChars("The") → "TThhee”
    //doubleChars("AAbb") → "AAAAbbbb”
    //doubleChars("Hi-There") → "HHii--TThheerree”

    public static String doubleChars(String initialString) {
        StringBuilder sb = new StringBuilder();

        for (Character c : initialString.toCharArray() ) {
            sb.append(c).append(c);
        }

        return sb.toString();
    }
}
