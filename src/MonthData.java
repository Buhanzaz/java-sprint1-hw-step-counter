public class MonthData {
    int[] days = new int[30];

    //Monthly statistics output
    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println( (i + 1) + " день: " + days[i]);
        }
    }

    //Sum of steps per month
    int sumStepsFromMonth() {
        //int sum = Arrays.stream(days).sum();
        int sumStep = 0;
        for (int i = 0; i < days.length; i++){
            sumStep += days[i];
        }
        return sumStep;

    }

    //Maximum number of steps
    int maxSteps(){
        int maxStep = 0;
        for (int i = 0; i < days.length; i++){
            if (maxStep < days[i]) maxStep = days[i];
        }
        return maxStep;
    }

    //Best series of steps
    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (goalByStepsPerDay < days[i]) {
                currentSeries++;
            } else {
                if (finalSeries < currentSeries) {
                    finalSeries = currentSeries;
                }
                currentSeries = 0;
            }
        }
        return finalSeries;
    }
}
