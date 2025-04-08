package homework.lection13;

public class Task13_5 {

    public static void main(String[] args) {
        System.out.println(buildResultString(new String[]{"a", "b", "a"}));
        System.out.println(buildResultString(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(buildResultString(new String[]{"a", "", "a"}));
        System.out.println(buildResultString(new String[]{"a", "", "m"}));
        System.out.println(buildResultString(new String[]{"a", "", "m", "a", "m", "a"}));
    }

    //Якщо рядок зустрічається в масиві вдруге, вчетверте, шосте рази і так далі,
    // додайте цей рядок до результату(тільки перше входження).
    // Якщо ж жодний рядок не зустрічається вдруге, поверніть пустий рядок.
    //
    //buildResultString(["a", "b", "a"]) → "a”
    //buildResultString(["a", "b", "a", "c", "a", "d", "a"]) → "a”
    //buildResultString(["a", "", "a"]) → "a”

    public static String buildResultString(String[] strings) {
        String result = "";
        int howManyTimesMet = 1;

        for (int i = 0; i < strings.length; i++) {
            if (result != "") {
                break;
            } else {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[i].equals(strings[j])) {
                        howManyTimesMet++;
                    }
                }
                result = howManyTimesMet % 2 == 0
                        ? strings[i]
                        : result;
                howManyTimesMet = 1;
            }
        }

        return result;
    }
}
