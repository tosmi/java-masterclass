package at.stderr.ReadingUserInput;

import java.util.Scanner;

public class SumOfNumbers {
    public static void calculateSum() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        while (counter < 10) {
            System.out.println("Enter number #" + (counter + 1) + ": ");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of number: " + sum);

        scanner.close();
    }
}
