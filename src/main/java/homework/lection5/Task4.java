package homework.lection5;

public class Task4 {

    public static void main(String[] args) {
        getGrade(5);
        getGrade(1);
        getGrade(-3);
    }

    //Напишіть програму, яка приймає числове значення від 1 до 5 та виводить відповідну оцінку студента.
    //
    //getGrade(5) → "Відмінно"
    //getGrade(1) → "Погано"
    //getGrade(-3) → "Неправильна оцінка"

    public static void getGrade(int score) {
        String estimationMessage;
        switch (score) {
            case 5:
                estimationMessage = "Відмінно";
                break;
            case 4:
                estimationMessage = "Добре";
                break;
            case 3:
                estimationMessage = "Зараховано";
                break;
            case 2:
                estimationMessage = "Недостатньо";
                break;
            case 1:
                estimationMessage = "Погано";
                break;
            default:
                estimationMessage = "Неправильна оцінка";
        }
        System.out.println(estimationMessage);
    }
}
