package homework.lection9;

public class CreatingPersons {
    public static void main(String[] args) {


        //TASK 9:
        System.out.println("--------TASK 9:----------------------------------------------");

        Person person1 = new Person("Amelia", 23, PersonRole.ENGINEER);
        Person person2 = new Person("Scout", 29, PersonRole.TEACHER);
        Person person3 = new Person("Natalie", 32, PersonRole.PROFESSOR);

        person1.displayInformation();
        person2.displayInformation();
        person3.displayInformation();

        person1.setProfession(PersonRole.TEACHER);

        System.out.println("Після зміни професії:");
        person1.displayInformation();
//        methodWhichPrintsTheInfo(person1);

        //TASK 10.1 TEST:
        System.out.println("--------TASK 10:----------------------------------------------");

        Person person4 = new Man("John", 30, PersonRole.ENGINEER);
        Person person5 = new Woman("Mary", 25, PersonRole.TEACHER);
        Person person6 = new Man("Bob", 35, PersonRole.DOCTOR);

        person4.displayInformation();
        person5.displayInformation();
        person6.displayInformation();

        person6.setProfession(PersonRole.ARCHITECT);
        System.out.println("Після зміни профісії Боба:");
        person6.displayInformation();
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
