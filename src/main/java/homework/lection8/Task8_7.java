package homework.lection8;

public class Task8_7 {

    public static void main(String[] args) {

        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));
        System.out.println(countHi("hihih hih"));

    }

    //Задача полягає в підрахунку кількості входжень підрядка "hi" у вказаному рядку.
    //
    //countHi("abc hi ho") → 1
    //countHi("ABChi hi") → 2
    //countHi("hihi") → 2

    public static int countHi(String string) {
        int count = 0;

        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == 'h'
                    && string.charAt(i + 1) == 'i') {
                count++;
                i++;
            }
        }
        return count;
    }
}
