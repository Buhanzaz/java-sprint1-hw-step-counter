import java.util.Scanner;
public class StepTracker {
    Scanner scanner;
    Converter converter = new Converter();
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;


    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++){
            monthToData[i] = new MonthData();
        }
    }

    //Print all static data for the month
    void printStatistic() {
        System.out.println("Введите число месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Введите правильный месяц");
        } else {
            MonthData monthData = monthToData[monthNumber - 1];
            int sumSteps = monthData.sumStepsFromMonth();
            System.out.println("Статистика по дням");
            monthData.printDaysAndStepsFromMonth();
            System.out.println("Сумма шагов за месяц: " + monthData.sumStepsFromMonth());
            System.out.println("Максимальное колличество шагов за месяц: " + monthData.maxSteps());
            System.out.println("В среднем вы проходили: " + (sumSteps) / monthData.days.length);
            System.out.println("Вы прошли за месяц: " + converter.convertToKm(sumSteps) + "Км");
            System.out.println("Киллоколорий созжено за месяц: " + converter.convertStepsToKilocalories(sumSteps) + "Ккал");
            System.out.println("Вывод лучшей серии: " + monthData.bestSeries(goalByStepsPerDay));
            System.out.println();
        }
    }

    //Сhange step goal
    void changeStepGoal() {
        while (true){
            int changeStep = scanner.nextInt();
            if (changeStep <= 0) {
                System.out.println("Вы не моожете ввести число меньшее или равное нулю!");
            } else {
                System.out.println("Вы изменили значение шагов с " + goalByStepsPerDay +" на " + changeStep);
                goalByStepsPerDay = changeStep;
                break;
            }
        }
    }

    //Add new number steps per day
    void addNewNumberStepsPerDay() {
        while (true){
            System.out.println("Введите номер месяца");
            int month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Введите правильный месяц");
            } else {
                System.out.println("Введите номер дня, от 1 до 30");
                int day = scanner.nextInt();

                if (day < 1 || day > 30) {
                    System.out.println("Введите правильный день");
                } else {
                    System.out.println("Введите количество шагов");
                    int step = scanner.nextInt();

                    if (step < 0) {
                        System.out.println("Значение не может быть отрецательным");
                    } else {
                        MonthData monthData = monthToData[month - 1];
                        monthData.days[day - 1] = step;
                        break;
                    }
                }
            }
        }
    }
}
