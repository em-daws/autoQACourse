package homework.lection9;

public class Person implements Displayable {

    //Створіть Java програму з використанням класів та конструкторів, яка виконує наступні завдання:

    //1. Створіть клас Person, який представляє особу з такими характеристиками: ім'я, вік та професія.
    // Оголосіть поля для цих характеристик та створіть конструктор класу, який дозволяє встановити значення
    // цих полів при створенні об'єкта класу Person. Додайте гетери і сетери для змінних класу.

    //2. Створіть об'єкти класу Person для трьох різних осіб, використовуючи конструктор класу Person.
    // Виведіть інформацію про цих осіб на екран.

    //3. Додайте метод в клас Person, який дозволяє встановити нову професію для особи.
    // Використайте цей метод для зміни професії одного з об'єктів Person, а потім виведіть оновлену інформацію про цю особу на екран.

    private String name;
    private int age;
    private PersonRole profession;

    public Person(String name, int age, PersonRole profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

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
}

