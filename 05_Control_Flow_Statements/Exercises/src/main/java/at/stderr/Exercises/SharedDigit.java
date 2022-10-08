package at.stderr.Exercises;

public class SharedDigit {

    public static boolean hasSharedDigit(int x, int y) {
        boolean hasSharedDigit = false;

        if( x < 10 || x > 99 || y < 10 || y > 99) {
            return hasSharedDigit;
        }

        while (x > 0) {
            int xDigit = x % 10;
            int yToTest = y;
            while (yToTest > 0) {
                if (xDigit == (yToTest % 10)) {
                    hasSharedDigit = true;
                    break;
                }
                yToTest /= 10;
            }
            x /= 10;
        }

        return hasSharedDigit;
    }
}
