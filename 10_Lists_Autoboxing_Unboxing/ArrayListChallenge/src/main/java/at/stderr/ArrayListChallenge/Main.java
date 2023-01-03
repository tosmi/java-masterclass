package at.stderr.ArrayListChallenge;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{

    public static void main( String[] args ) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        boolean shutdown = false;
        GroceryList groceryList = new GroceryList();

        while(!shutdown) {
            displayMenu();

            var line = scanner.nextLine();
            var input = Integer.parseInt(line);

            switch (input) {
                case 0 -> shutdown = true;
                case 1 -> groceryList.addItems();
                case 2 -> groceryList.removeItems();
                default -> throw new IllegalStateException("Unexpected value: " + input);
            }
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
}
