package at.stderr.MethodOverloading;

public class FeedAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ( feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        double totalInches = feet * 12 + inches;

        return calcFeetAndInchesToCentimeters(totalInches);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if ( inches < 0) {
            return -1;
        }
        return inches * 2.54;
    }
}
