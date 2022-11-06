package at.stderr.ArraySort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        int[] unsorted = getIntegers(2);
        int [] sorted = sortIntegers(unsorted);

        for(int i: unsorted) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(unsorted));
        System.out.println(Arrays.toString(sorted));

        printArray(sorted);

    }

    private static int[] getIntegers(int n) {
        int[] integers = new int[n];

        System.out.println("Please enter " + n + " integers:");
        for (int i = 0 ; i < integers.length ; i++) {
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    public static int[] sortIntegers(int[] unsorted) {
        int[] sorted = Arrays.copyOf(unsorted, unsorted.length);

        for(int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] < sorted[i+1]) {
//                tmp=sorted[i];
//                sorted[i] = sorted[i+1];
//                sorted[i+1] = tmp;
                sorted[i] = sorted[i] ^ sorted[i+1];
                sorted[i+1] = sorted[i+1] ^ sorted[i];
                sorted[i] = sorted[i] ^ sorted[i+1];
                i=-1;
            }
        }
        return sorted;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
