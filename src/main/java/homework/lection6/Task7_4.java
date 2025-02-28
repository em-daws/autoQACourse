package homework.lection6;

public class Task7_4 {

    public static void main(String[] args) {

        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }

    //Знайти шаблони типу "zip" і "zap" у рядку - це послідовності довжиною 3, які починаються з 'z' і закінчуються 'p'.
    // Повернути рядок, в якому для всіх таких слів середня літера відсутня, отже, "zipXzap" перетворюється у "zpXzp".
    //
    //zipZap("zipXzap") → "zpXzp”
    //zipZap("zopzop") → "zpzp”
    //zipZap("zzzopzop") → "zzzpzp”

    public static String zipZap(String originalString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < originalString.length(); i++) {
            if (i < originalString.length() - 2
                    && originalString.charAt(i) == 'z'
                    && originalString.charAt(i + 2) == 'p') {
                result.append("zp");
                i += 2;
            } else {
                result.append(originalString.charAt(i));
            }
        }

        return result.toString();
    }
}
