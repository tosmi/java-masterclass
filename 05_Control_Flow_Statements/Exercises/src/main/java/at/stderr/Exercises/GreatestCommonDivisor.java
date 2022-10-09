package at.stderr.Exercises;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int x, int y) {
        if ( x < 10 || y < 10 ) {
            return -1;
        }

        while( y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        return x;

//        int minimum = Math.min(x, y);
//        int maximum = Math.max(x,y);

//        int gcd = 1;
//        int divisor = 1;
//        while(true) {
//            if ( (minimum % divisor == 0) && (maximum % divisor == 0)) {
//                gcd = divisor;
//            }
//
//            if ( divisor >= minimum) {
//                break;
//            }
//            divisor++;
//        }
//        return gcd;
    }
}
