package at.stderr.ArraySort;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        int[] unsorted = getUnsortedIntegers(5);
        int [] sorted = sortIntegerArray(unsorted);

    }

    private static int[] getUnsortedIntegers(int n) {
        int[] integers = new int[n];

        System.out.println("Please enter " + n + " integers:");
        for (int i = 0 ; i < integers.length ; i++) {
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    public static int[] sortIntegerArray(int[] unsorted) {
        int tmp;
        int[] sorted = new int[unsorted.length];

        // 5 4 3 2 1
        for(int i = 0; i < unsorted.length - 1; i++) {
            if (unsorted[i] > unsorted[i+1]) {
                tmp=unsorted[i+1];
                unsorted[i] = unsorted[i+1];
                unsorted[i+1] = tmp;
            }
        }

        for(int i: unsorted) {
            System.out.println(i);
        }
        return unsorted;
    }
}
