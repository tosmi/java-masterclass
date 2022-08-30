package at.stderr.Exercise;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if ( (year >= 1 && year <= 9999) && (year % 4 == 0) ) {
            if (year % 100 == 0) {
                if ( year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}
