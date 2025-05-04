package homework.lection11and14;

public class UpdatedWoman extends AbstractPerson {

    static final String XX = "Жінка";

    public UpdatedWoman(String name, int age, PersonRole profession) throws InvalidDataException {
        super(name, age, profession);
    }

    @Override
    public void displayInformation() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Ім'я: ")
                .append(super.getName())
                .append(", Вік: ")
                .append(super.getAge())
                .append(", Професія: ")
                .append(super.getProfession().getRoleName())
                .append(", Стать: ")
                .append(XX);

        System.out.println(stringBuilder);
    }

    /**
     * 2. Перевизначьте методи абстрактного класу Person в класах Woman та Man.
     */
    @Override
    public void sayToConsole() {
        System.out.println("Hi there! My name is " + getName() + ", I am a woman.");
    }
}
