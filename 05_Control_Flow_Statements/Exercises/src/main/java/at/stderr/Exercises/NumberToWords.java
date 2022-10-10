package at.stderr.Exercises;


public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(100);
        numberToWords(0);
    }
    public static void numberToWords(int n) {
        if ( n < 0) {
            System.out.printf("Invalid Value");
        }

        int r = reverseNumber(n);

        int rDigits = getDigitCount(r);
        int nDigits = getDigitCount(n);

        do {
            int number = r % 10;
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            r /= 10;
        } while(r>0);

        if ( rDigits != nDigits) {
            for (int count=0; count < nDigits - rDigits; count++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverseNumber(int n) {
        int reverseN = 0;

        for ( int i = Math.abs(n); i>0; i/=10) {
            int remainder = i % 10;
            reverseN = reverseN * 10 + remainder;
        }

        return n < 0 ? -reverseN : reverseN;
    }

    public static int getDigitCount(int n) {
        if ( n<0 ) {
            return -1;
        }

        int digits = 0;

        do {
            digits++;
            n /= 10;
        } while(n>0);

        return digits;
    }
}
