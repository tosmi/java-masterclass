package at.stderr.Exercise;

public class IntEqualityPrinter {
    public static final String INVALID_VALUE = "Invalid Value";

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println(INVALID_VALUE);
        } else if ( (x == z) && (y == z)) {
            System.out.println("All numbers are equal");
        } else if ( (x != y) && (x != z) && (y != z)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
