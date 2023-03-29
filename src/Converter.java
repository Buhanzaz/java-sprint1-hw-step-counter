public class Converter {
    int oneStep = 75;
    int callories = 50;
    // Две переменные ниже можно было бы сделать как константы
    // Так как по сути они не изменяемые

    //public static final int ONE_KILOCALORY = 1000;
    //public static final int KILOMETR_IN_CENTIMETERS = 100_000;
    int oneKilocalory = 1000;
    int kilometerInCentimeters = 100_000;
    //Convert steps to kilometers
    int convertToKm(int steps) {
        return oneStep * steps / kilometerInCentimeters;
    }

    //Convert Steps To Kilocalories
    int convertStepsToKilocalories(int steps) {

        return callories * steps / oneKilocalory;
    }
}
