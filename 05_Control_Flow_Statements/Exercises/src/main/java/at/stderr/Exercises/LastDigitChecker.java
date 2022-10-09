package at.stderr.Exercises;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(z)) {
            return false;
        } else {
            return (x % 10 == y % 10) || (y % 10 == z % 10) || ( x % 10 == z % 10);
        }
    }

    public static boolean isValid(int n) {
        return n >= 10 && n <= 1000;
    }
}
