import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        StepTracker stepTracker = new StepTracker(new Scanner(System.in));
        Scanner scanner = new Scanner(System.in);

        //Control unit and menu output
        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 0) {
                scanner.close();
                return;
            } else if (command == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                stepTracker.changeStepGoal();
            } else if (command == 3) {
                stepTracker.printStatistic();
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    // Menu
    static void printMenu(){
        System.out.println("Подсчет шагов - 1");
        System.out.println("Изменение цели - 2");
        System.out.println("Вывод статистики за месяц - 3");
        System.out.println("Выход - 0");
    }
}
