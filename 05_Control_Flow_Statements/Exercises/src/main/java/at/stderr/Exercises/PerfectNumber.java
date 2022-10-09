package at.stderr.Exercises;

public class PerfectNumber {

    public static boolean isPerfectNumber(int n) {
        if ( n < 1) {
            return false;
        }

        int divisorSum = 0;
        for (int d = n / 2; d >=1; d--) {
            if (n % d == 0) {
                divisorSum += d;
            }
        }
        return n == divisorSum;
    }
}
