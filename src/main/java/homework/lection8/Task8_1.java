package homework.lection8;

public class Task8_1 {

    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
        System.out.println(catDog("1cat1cadodogadsdasdasdacatdasjaborgbaeuodog"));
        System.out.println(catDog("1cat1cadodogadsdasdasdacatdasjaborgbaeuo"));
    }

    //Ця задача полягає в порівнянні кількості входжень підрядків "cat" та "dog" у вказаному рядку.
    //Якщо обидва підрядки зустрічаються у рядку однакову кількість разів, повертається значення true, в іншому випадку - false.
    //
    //catDog("catdog") → true
    //catDog("catcat") → false
    //catDog("1cat1cadodog") → true

    public static boolean catDog(String initialString) {
        String forCatCheck = initialString;
        int cats = 0;
        String forDogCheck = initialString;
        int dogs = 0;

        while (forCatCheck.contains("cat")) {
            forCatCheck = forCatCheck
                    .substring(forCatCheck.indexOf("cat"))
                    .replaceFirst("cat", "");
            cats++;
        }

        while (forDogCheck.contains("dog")) {
            forDogCheck = forDogCheck
                    .substring(forDogCheck.indexOf("dog"))
                    .replaceFirst("dog", "");
            dogs++;
        }

        return cats == dogs;
    }
}
