public class Lasagna {
    public int expectedMinutesInOven() {
        final int expectedTime = 40;
        return expectedTime;
    }

    public int remainingMinutesInOven(int passedMinutes) {
        return expectedMinutesInOven() - passedMinutes;
    }

    public int preparationTimeInMinutes(int layers) {
        final int timePerLayer = 2;
        return layers*timePerLayer;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
