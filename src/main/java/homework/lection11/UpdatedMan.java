package homework.lection11;

public class UpdatedMan extends AbstractPerson {

    static final String XY = "Чоловік";

    public UpdatedMan(String name, int age, PersonRole profession) {
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
                .append(XY);

        System.out.println(stringBuilder);
    }

    /**
     * 2. Перевизначьте методи абстрактного класу Person в класах Woman та Man.
     */
    @Override
    public void sayToConsole() {
        System.out.println("Hi there! My name is " + getName() + ", I am a man.");
    }
}
