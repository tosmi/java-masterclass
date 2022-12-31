package at.stderr.UsingArrays;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {

    }

    private static int[] getRandomArray(int length ) {
        Random random = new Random();
        int[] newInt = new int[length];

        for(int i = 0; i < length; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;

    }
}
