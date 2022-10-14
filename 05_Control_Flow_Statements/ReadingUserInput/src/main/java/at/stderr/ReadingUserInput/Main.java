package at.stderr.ReadingUserInput;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        MinAndMaxChallange.minAndMaxChallange();
        // SumOfNumbers.calculateSum();
        // calculateAge();
    }
    public static void calculateAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthyear: ");
        boolean hasNextInt = scanner.hasNextInt();

        if( hasNextInt ) {
            int birthYear = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2022 - birthYear;
            if ( age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth!");
        }

        scanner.close();
    }
}
