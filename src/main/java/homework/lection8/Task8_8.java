package homework.lection8;

public class Task8_8 {

    public static void main(String[] args) {

        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
    }

    //Задача полягає в підрахунку кількості входжень підрядка "code" у вказаному рядку,
    // при цьому приймаються будь-які літери для символу 'd'. Отже, рядки "cope" і "cooe"
    // також вважаються входженням "code".
    //
    //countCode("aaacodebbb") → 1
    //countCode("codexxcode") → 2
    //countCode("cozexxcope") → 2

    public static int countCode(String string) {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'c' && i != string.length() - 3) {
               if (string.charAt(i + 1) == 'o' && string.charAt(i + 3) == 'e') {
                   count++;
                   i += 3;
               }
            }
        }
        return count;
    }
}
