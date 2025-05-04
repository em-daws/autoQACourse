package homework.lection11and14;

import java.util.Arrays;

public class CreatingPersons {

    public static void main(String[] args) {
//TASK 11.1-14.1 TEST:
        System.out.println("--------TASK 11 and 14:----------------------------------------------");

        try {
            UpdatedMan person4 = new UpdatedMan("John", 30, PersonRole.ENGINEER);
            person4.displayInformation();
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
//Змініть клас **Person,**Woman та Man ****так, щоб при спробі створити користувача з некоректними даними
// (наприклад, вік користувача спробуємо зробити негативним) ми обробляли таки ситуацію коректно.
        try {
            UpdatedWoman person5 = new UpdatedWoman("Mary", -1, PersonRole.TEACHER);
            person5.displayInformation();
        } catch (InvalidDataException | IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }
//Додайте клас з вашим власним виключенням.
//Змініть клас **Person,**Woman та Man ****так, щоб при спробі створити користувача без ім’я ми “викликали” власне виключення.
        try {
            UpdatedMan person6 = new UpdatedMan(null, 35, PersonRole.DOCTOR);
            person6.displayInformation();

            person6.setProfession(PersonRole.ARCHITECT);
            System.out.println("Після зміни профісії Боба:");
            person6.displayInformation();
            System.out.println("-------------------------------------");
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }

        //using of abstract method and overloaded method:

        try {
            UpdatedMan person7 = new UpdatedMan("Bobby", 29, PersonRole.ARTIST);
            person7.displayInformation("Hi all!");
            System.out.println("--------------------------------------");
            person7.sayToConsole();
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void methodWhichPrintsTheInfo(AbstractPerson person) {
        StringBuilder sb = new StringBuilder();

        sb.append("Ім'я: ")
                .append(person.getName())
                .append(", Вік: ")
                .append(person.getAge())
                .append(", Професія: ")
                .append(person.getProfession());

        System.out.println(sb);
    }
}
