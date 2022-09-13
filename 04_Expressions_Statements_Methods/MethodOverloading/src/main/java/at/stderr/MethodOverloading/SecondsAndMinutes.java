package at.stderr.MethodOverloading;

public class SecondsAndMinutes {

    private static final String INVALID_VALUES_MSG = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {
        if ( minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUES_MSG;
        }

        int durationHours = minutes / 60;
        int durationMinutes = minutes % 60;

        String hoursString = durationHours + "h";
        if (durationHours < 10) {
            hoursString = "0" + durationHours + "h";
        }

        String minutesString = durationMinutes + "m";
        if (durationMinutes < 10) {
            minutesString = "0" + durationMinutes + "m";
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + seconds + "s";
        }

        String message = hoursString + " " + minutesString + " " + secondsString;

        System.out.println(message);

        return message;
    }

    public static String getDurationString(int seconds) {
        if ( seconds < 0) {
            return INVALID_VALUES_MSG;
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
}
