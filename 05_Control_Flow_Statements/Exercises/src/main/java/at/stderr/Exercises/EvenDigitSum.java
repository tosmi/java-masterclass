package at.stderr.Exercises;

public class EvenDigitSum {

    public static int getEvenDigitSum(int n) {
        if ( n < 0 ) {
            return -1;
        }
        int sum = 0;

        while( n > 0 ) {
            int d = n % 10;
            if ( (d % 2) == 0) {
                sum += d;
            }
            n /= 10;
        }

        return sum;
    }
}
