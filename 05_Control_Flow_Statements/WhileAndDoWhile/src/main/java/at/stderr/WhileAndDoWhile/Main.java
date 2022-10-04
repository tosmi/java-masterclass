package at.stderr.WhileAndDoWhile;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
//        int count = 0;
//
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count=0;
//        while(true) {
//            if ( count==5) {
//                break;
//            }
//            System.out.println("Count: " + count );
//            count++;
//        }
//
//        count = 0;
//        do {
//            System.out.println("Count value was: " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count !=6);

//        for (int i = 1; i < 6; i++) {
//            System.out.println("Count value is " + i);
//        }

        // challange
        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;
        while(number <= finishNumber) {
            number++;
            if ( !isEven(number) ) {
                continue;
            }

            evenNumbers++;
            System.out.println("Even number " + number);
            if (evenNumbers == 4 ) {
                break;
            }
        }

    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
