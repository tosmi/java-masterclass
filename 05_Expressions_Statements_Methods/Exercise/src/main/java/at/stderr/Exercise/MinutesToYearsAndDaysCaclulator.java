package at.stderr.Exercise;


public class MinutesToYearsAndDaysCaclulator {
    public static final String INVALID_VALUE = "Invalid Value";
    public static final long MINUTES_PER_DAY = 24 * 60;
    public static final long DAYS_PER_YEAR = 365;

    public static void printYearsAndDays(long minutes) {
        if ( minutes < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            long days = minutes / (MINUTES_PER_DAY);

            long years = days / DAYS_PER_YEAR;
            long remainingDays = days % DAYS_PER_YEAR;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
