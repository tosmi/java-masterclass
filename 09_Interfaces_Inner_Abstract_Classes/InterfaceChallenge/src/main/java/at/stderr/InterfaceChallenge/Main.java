package at.stderr.InterfaceChallenge;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {

    }

    public static ArrayList<String> readValues() {
        var values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("""
                Choose
                1. to enter a string
                0. to quit
                """);
        while(!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> quit = true;
                case 1 -> {
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(stringInput);
                    index++;
                }
            }
        }
        return values;
    }
}
