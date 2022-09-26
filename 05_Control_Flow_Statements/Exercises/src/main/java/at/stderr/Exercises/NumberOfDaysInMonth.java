package at.stderr.Exercises;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            }
            return year % 400 == 0;
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ( (month < 1 || month > 12 ) || ( year < 1 || year > 9999)) {
            return -1;
        }

        switch (month) {
            // java >= 14
            //case 1,3,5,7,8,10,12:
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 :  28;
            default:
                return 30;
        }
    }
}
