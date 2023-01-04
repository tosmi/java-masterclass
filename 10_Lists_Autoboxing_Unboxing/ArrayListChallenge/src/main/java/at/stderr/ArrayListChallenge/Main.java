package at.stderr.ArrayListChallenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static GroceryList groceryList = new GroceryList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        run();
    }

    public static void run() {
        boolean shutdown = false;

        while(!shutdown) {
            displayMenu();
            shutdown = parseMenu();
        }
    }

    private static void displayMenu() {
        System.out.println("""
                Available actions:
                
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove item(s) (comma delimited list)

                Enter a number for which action you want to do
                """);
    }

    private static boolean parseMenu() {
        var line = scanner.nextLine();
        var input = Integer.parseInt(line);

        switch (input) {
            case 0 -> { return true; }
            case 1 -> addItems();
            case 2 -> removeItems();
            default -> throw new IllegalStateException("Unexpected value: " + input);
        }
        return false;
    }


    private static void addItems() {
        System.out.println("Enter a comma separated list of items:");
        var line = scanner.nextLine();
        groceryList.addItems(line.split(","));
        groceryList.listItems();
    }

    private static void removeItems() {

    }
}
