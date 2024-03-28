package at.stderr.WhileAndDoWhile;

public class SumDigits {
    public static int sumDigits(int n) {
        if (n < 10) {
            return -1;
        }

        int sum = 0;
        do {
            sum += n % 10;
            n = n / 10;
        } while ( n > 0);

        return sum;
    }
}
