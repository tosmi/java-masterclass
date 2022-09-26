package at.stderr.ForLoop;


public class Main 
{
    public static void main( String[] args ) {
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000.0, 2));

        for (int  i = 0; i < 5; i++) {
            System.out.println("Loop " + i);
        }

        for (int interest = 8; interest > 1; interest--) {
            System.out.println("10.000 at " + interest +"% interest = " + String.format("%.2f",calculateInterest(10000.0, interest)));
        }
        findPrimes(10,100);
    }

    public static void findPrimes(int start, int end) {
        int count = 0;
        for( int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println("found prime number " + i);
                count++;
            }
            if (count > 10) {
                break;
            }
        }

        sum3and5();
    }

    public static boolean isPrime(int n) {
        if (n == 1 ) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++ ) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static void sum3and5() {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if( i % 3 == 0 && i % 5 ==0) {
                System.out.println("Found: " + i);
                count++;
                sum += i;
            }

            if ( count >= 5) {
                break;
            }
        }
        System.out.println("sum: " + sum);
    }
}
