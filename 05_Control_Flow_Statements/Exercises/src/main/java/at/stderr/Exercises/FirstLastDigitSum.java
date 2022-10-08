package at.stderr.Exercises;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int n) {
        if (n < 0) {
            return -1;
        }

        int lastDigit = n % 10;

        int firstDigit = 0;
        while(n > 0) {
            firstDigit = n % 10;
            n /= 10;
        }
        System.out.println(firstDigit);

        return firstDigit + lastDigit;
    }
}
