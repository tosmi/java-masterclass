package at.stderr.ReverseArrayChallenge;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        int[] array = new int[] {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int length = array.length;

        for ( int i = 0; i < length/2; i++) {
            int tmp = array[i];
            array[i] = array[length-(i+1)];
            array[length-(i+1)] = tmp;
            System.out.println(Arrays.toString(array));
        }
    }
}
