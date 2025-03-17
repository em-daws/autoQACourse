package homework.lection9;

public class CreatingPersons {
    public static void main(String[] args) {
        Person person1 = new Person("Amelia", 23, "Engineer");
        Person person2 = new Person("Scout", 29, "Teacher");
        Person person3 = new Person("Natalie", 32, "Professor");

        methodWhichPrintsTheInfo(person1);
        methodWhichPrintsTheInfo(person2);
        methodWhichPrintsTheInfo(person3);

        person1.setProfession("Writer");

        System.out.println("Після зміни професії:");
        methodWhichPrintsTheInfo(person1);
    }

    public static void methodWhichPrintsTheInfo(Person person) {
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
