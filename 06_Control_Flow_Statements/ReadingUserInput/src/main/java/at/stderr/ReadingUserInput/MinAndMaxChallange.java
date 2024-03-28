package at.stderr.ReadingUserInput;

import java.util.Scanner;

public class MinAndMaxChallange {
    public static void minAndMaxChallange() {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int current = 0;
        // boolean firstNumber = true;

        while(true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                current = scanner.nextInt();
//                if (firstNumber) {
//                    min = current;
//                    max = current;
//                    firstNumber = false;
//                }
                if (current < min) min = current;
                if (current > max) max = current;
            } else {
                break;
            }
        }
        System.out.println("Minimum: " + min + " Maximum: " + max);
    }
}
