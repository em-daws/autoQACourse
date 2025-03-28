package homework.lection11;

public class CreatingPersons {
    public static void main(String[] args) {

//TASK 11.1 TEST:
        System.out.println("--------TASK 11:----------------------------------------------");

        UpdatedMan person4 = new UpdatedMan("John", 30, PersonRole.ENGINEER);
        UpdatedWoman person5 = new UpdatedWoman("Mary", 25, PersonRole.TEACHER);
        UpdatedMan person6 = new UpdatedMan("Bob", 35, PersonRole.DOCTOR);

        person4.displayInformation("Hi! Nice to meet you!");
        person5.displayInformation("What's up?");
        person6.displayInformation("Nice to see you!");

        person6.setProfession(PersonRole.ARCHITECT);
        System.out.println("Після зміни профісії Боба:");
        person6.displayInformation();

        //using of abstract method:
        person6.sayToConsole();
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
