package homework.lection6;

public class Task7_3 {

    public static void main(String[] args) {
        //для першого метода
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
        System.out.println(xyzMiddle("xyzB"));
        System.out.println(xyzMiddle("Bxyz"));

        System.out.println("-------------------------------------------");

        //для другого метода
        System.out.println(xyzMiddle2("AAxyzBB"));
        System.out.println(xyzMiddle2("AxyzBB"));
        System.out.println(xyzMiddle2("AxyzBBB"));
        System.out.println(xyzMiddle("xyzB"));
        System.out.println(xyzMiddle("Bxyz"));

    }

    //Для заданого рядка перевірити, чи зустрічається "xyz" у середині рядка. Щоб визначити середину, ми скажемо,
    // що кількість символів ліворуч і праворуч від "xyz" повинна відрізнятися максимум на одиницю.
    // Ця задача складніша, ніж здається.
    //
    //xyzMiddle("AAxyzBB") → true
    //xyzMiddle("AxyzBB") → true
    //xyzMiddle("AxyzBBB") → false

    //перший варіант
    public static boolean xyzMiddle(String input) {
        String searchedSubstring = "xyz";

        int index = input.indexOf(searchedSubstring);
        if (index != -1 && index != 0 && index != input.length() - 3) {
            int leftSubstringLength = input.substring(0, index).length();
            int rightSubstringLength = input.substring(index + 3).length();

            return leftSubstringLength == rightSubstringLength
                    || Math.abs(leftSubstringLength - rightSubstringLength) == 1;
        }

        //якщо враховувати ситуації, коли xyz знаходиться або на початку, або в кінці, але в задачі цього не вказано
        return (input.startsWith(searchedSubstring) || input.endsWith(searchedSubstring))
                && input.length() == 4;
    }

    //другий варіант
    public static boolean xyzMiddle2(String input) {
        String searchedSubstring2 = "xyz";
        int middleIndex = input.length() / 2;

        if (input.indexOf(searchedSubstring2) >= 1 && input.length() >= 5) {
            if (input.length() % 2 == 0)
                return input.substring(middleIndex - 2, middleIndex + 1).equals(searchedSubstring2);
            else
                return input.substring(middleIndex - 1, middleIndex + 2).equals(searchedSubstring2);
        }

        //якщо враховувати ситуації, коли xyz знаходиться або на початку, або в кінці, але в задачі цього не вказано
        return (input.startsWith(searchedSubstring2) || input.endsWith(searchedSubstring2))
                && input.length() == 4;
    }
}
