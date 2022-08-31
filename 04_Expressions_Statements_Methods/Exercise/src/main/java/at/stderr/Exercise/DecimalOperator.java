package at.stderr.Exercise;

public class DecimalOperator {

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        return (int)(x*1000) == (int)(y*1000);
    }
}
