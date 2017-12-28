package pl.lukaszwilk.UnitConverter.models;

public class UnitsTimeCalulations {
    private final static double secondsToMinutes = 0.0166;
    private final static double secondsToHour = 0.000277;
    private final static double secondsToDay = 0.00001157407;
    private final static double secodnsToYear = 0.0000000317097919;

    public static double getSecondsToMinutes() {
        return secondsToMinutes;
    }

    public static double getSecondsToHour() {
        return secondsToHour;
    }

    public static double getSecondsToDay() {
        return secondsToDay;
    }

    public static double getSecodnsToYear() {
        return secodnsToYear;
    }
}
