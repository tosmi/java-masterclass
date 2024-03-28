package at.stderr.Exercises;

public class LargestPrime {
    public static int getLargestPrime(int n) {
        if (n <= 1 )
            return -1;

        int largestPrime = 2;
        for (int p=2; p <= n; ++p) {
            if (n % p == 0) {
                largestPrime = p;
                n = n/p;
                p = 1;
            }
        }
        return largestPrime;
    }
}
