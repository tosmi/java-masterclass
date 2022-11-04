package at.stderr.Arrays;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        int[] myInteger = getIntegers(5);
        for (int i = 0; i < myInteger.length; i++) {
            System.out.println("Element " + i + ", typed values was " + myInteger[i]);
        }
        System.out.println("The average is " + getAverage(myInteger));
    }

    public static int[] getIntegers(int n) {
        System.out.println("Enter " + n + " integer values.");
        int[] values = new int[n];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array) {
        int sum = 0;

        for( int i : array) {
            sum += i;
        }
        return (double)sum / (double)array.length;
    }

    public static void arrays() {
        int[] myIntArray = new int[25];
        // int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        myIntArray[5] = 50;

        for (int i = 0; i<myIntArray.length; i++) {
            myIntArray[i] = i*10;
        }

        printArray(myIntArray);

        double[] myDoubleArray = new double[10];

        System.out.println(myIntArray[6]);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i] );
        }
    }
}
