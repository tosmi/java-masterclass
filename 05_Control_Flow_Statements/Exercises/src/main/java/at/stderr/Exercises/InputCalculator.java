package at.stderr.Exercises;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String argsv[]) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        long avg = 0;
        int sum = 0;
        int current = 0;
        int count = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                count++;
                current = scanner.nextInt();
                sum += current;
            }
            else {
                break;
            }
        }

        if ( count > 0) {
            avg = Math.round((double) sum / (double) count);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
