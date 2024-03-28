package at.stderr.ReadingUserInput;

import java.util.Scanner;

public class SumOfNumbers {
    public static void calculateSum() {
        //firstTry();
        secondTry();
    }

    public static void firstTry() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (counter < 5) {
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

    public static void secondTry() {
        // will not use nextInt

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int counter = 0;
        while (counter < 5) {
            System.out.println("Enter number #" + (counter + 1) + ": ");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }
        System.out.println("Sum of number: " + sum);

        scanner.close();
    }
}
