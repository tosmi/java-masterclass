package at.stderr.Exercises;

public class NumberPalindrome {

    public static boolean isPlaindrom(int n) {
        return n == palindrome(n);
    }

    public static int palindrome(int n) {
        int p = 0;
        n = Math.abs(n);

        do {
            int nextDigit = (n % 10);
            p = (p+nextDigit);

            n = n / 10;
            if (n > 0) {
                // only multiply by 10 if we have another iteration ahead of us
                p*=10;
            }
        } while( n > 0);

        return p;
    }
}
