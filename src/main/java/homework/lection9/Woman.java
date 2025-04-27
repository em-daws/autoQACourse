package homework.lection9;

public class Woman extends Person {

    static final String XX = "Жінка";

    public Woman(String name, int age, PersonRole profession) {
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
}
