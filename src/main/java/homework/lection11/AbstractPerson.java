package homework.lection11;

public abstract class AbstractPerson implements Displayable {

    private String name;
    private int age;
    private PersonRole profession;

    public AbstractPerson(String name, int age, PersonRole profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    /**
     * 1. Змініть клас Person так, щоб він став абстрактним, модифікуйте методи, що маєте до абстрактних, або додайте нові.
     */
    public abstract void sayToConsole();

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonRole getProfession() {
        return profession;
    }

    public void setProfession(PersonRole profession) {
        this.profession = profession;
    }

    @Override
    public void displayInformation() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Ім'я: ")
                .append(this.name)
                .append(", Вік: ")
                .append(this.age)
                .append(", Професія: ")
                .append(this.profession.getRoleName());

        System.out.println(stringBuilder);
    }

    /**
     * 3. Перезавантажте методи інтерфейсу Displayable для класу Person
     */
    @Override
    public void displayInformation(String greetings) {

        String stringBuilder = "Ім'я: " +
                this.name +
                ", Вік: " +
                this.age +
                ", Професія: " +
                this.profession.getRoleName();

        System.out.println(stringBuilder + "\n" + greetings);
    }
}

