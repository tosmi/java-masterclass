package at.stderr.ReadingUserInput;

import java.util.Scanner;

public class ConsoleVsScanner {
    public static void run() {
        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            // this means that system.console is disabled (IDE?)
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year where you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", thanks for taking the course!");

        System.out.println("What year where you born?");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year > =" +
                    (currentYear - 125) + " and <= " + currentYear);

            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            } catch (NumberFormatException e) {
                System.out.println("Characters not allowed, try again!");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if ( (dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return currentYear - dob;
    }

}
