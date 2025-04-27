package homework.lection6;

public class Task7_5 {

    public static void main(String[] args) {

        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
        System.out.println(xyzThere(".xyz.abcxy.xyzz.xyz"));

    }

    //Повернути true, якщо заданий рядок містить послідовність "xyz", де "xyz" не межує на початку безпосередньо
    // з крапкою (.). Тобто "xxyz" вважається підходящим, але "x.xyz" - ні.
    //
    //xyzThere("abcxyz") → true
    //xyzThere("abc.xyz") → false
    //xyzThere("xyz.abc") → true

    public static boolean xyzThere(String initialString) {
        String consistency = "xyz";
        //replacement з пробілом, щоб уникнути ситуацій, коли xyz послідовність може виникнути після видалення .xyz
        return initialString.replace("." + consistency, " ").contains(consistency);
    }
}
