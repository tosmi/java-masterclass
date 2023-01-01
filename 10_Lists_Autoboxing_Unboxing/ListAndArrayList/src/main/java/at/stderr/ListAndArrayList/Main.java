package at.stderr.ListAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main( String[] args ) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }


    }

    public static void printInstructions() {
        System.out.println("""
                Press:
                0 - To print choice options.
                1 - To print the list of grocery items.
                2 - To add an item to the list.
                3 - To modify an item.
                4 - To remove an item.
                5 - To search for an item.
                6 - To quit.
                """);
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item: ");
        String oldItem = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem))
            System.out.println("Found " + searchItem);
        else
            System.out.println(searchItem + " is not in the list.");

    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        String[] myArray = new String[groceryList.getGroceryList().size()];
        String[] otherArray = new String[groceryList.getGroceryList().size()];
        otherArray = groceryList.getGroceryList().toArray(myArray);

        otherArray[0] = "test";

        System.out.println(Arrays.toString(myArray) + myArray);
        System.out.println(Arrays.toString(otherArray) + otherArray);
    }

}
