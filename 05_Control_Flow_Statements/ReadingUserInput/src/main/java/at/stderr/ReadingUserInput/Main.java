package at.stderr.ReadingUserInput;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthyear: ");
        int birthYear = scanner.nextInt();
        // handle newline
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        int age = 2022 - birthYear;

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }
}
