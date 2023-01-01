package at.stderr.ArraysChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        int[] a = generateArray(10);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        for (int i = 0; i < a.length/2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;

        }
        System.out.println(Arrays.toString(a));
    }

    public static int[] generateArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for ( int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
