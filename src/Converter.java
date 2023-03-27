public class Converter {
    //Convert steps to kilometers
    int convertToKm(int steps) {
        int oneStep = 75;
        return 75 * steps / 100000;
    }

    //Convert Steps To Kilocalories
    int convertStepsToKilocalories(int steps) {
        int callories = 50;
        return 50 * steps / 1000;
    }
}
