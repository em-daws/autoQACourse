package homework.lection9;

public class Man extends Person {

    static final String XY = "Чоловік";

    public Man(String name, int age, PersonRole profession) {
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
}
