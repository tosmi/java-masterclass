package at.stderr.MinElementChallange;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        int n = readInteger();
        int array[] = readElements(n);
        int min = findMin(array);
        System.out.println(min);
    }

    private static int readInteger() {
        return scanner.nextInt();

    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) min =i;
        }
        return min;
    }

    private static int[] readElements(int n) {
        int[] array = new int[n];

        System.out.println("Please enter " + n + " integers:");
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
