public class Converter {
    int oneStep = 75;
    int calories = 50;
    int oneKilocalories = 1000;
    int kilometerInCentimeters = 100_000;

    //Convert steps to kilometers
    int convertToKm(int steps) {
        return oneStep * steps / kilometerInCentimeters;
    }

    //Convert Steps To Kilocalories
    int convertStepsToKilocalories(int steps) {

        return calories * steps / oneKilocalories;
    }
}
