public class Lasagna {
    public int expectedMinutesInOven() {
        final int expectedTime = 40;
        return expectedTime;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int passedMinutes) {
        return expectedMinutesInOven() - passedMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        final int timePerLayer = 2;
        return layers*timePerLayer;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
