package at.stderr.LinkedList;

import com.sun.source.doctree.InlineTagTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
//        placesToVisit.add("Sidney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");

//        placesToVisit.add(1,"Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);


        addInOrder(placesToVisit, "Sidney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();

        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===============================");

    }

    private static boolean addInOrder(LinkedList<String> list, String newCity) {
        ListIterator<String> li = list.listIterator();

        while(li.hasNext()) {
            // need to use .next() to move to the first entry
            int comparison = li.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // newCity should appear before this one
                // Brisbane -> Adelaide
                li.previous();
                li.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on to next city
            }
        }
        li.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        var scanner = new Scanner(System.in);
        var quit = false;
        var goingForward = true;

        var li = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No Cities in the iteneray");
        } else {
            System.out.println("Now visiting " + li.next());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Holiday over!");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (li.hasNext()) li.next();
                        goingForward = true;
                    }
                    if (li.hasNext()) {
                        System.out.println("Now visiting " + li.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (li.hasPrevious()) li.previous();
                        goingForward = false;
                    }
                    if (li.hasPrevious()) {
                        System.out.printf("Now visiting " + li.previous());
                    } else {
                        System.out.println("We reached the start of the list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("""
                0 - quit
                1 - go to next city
                2 - go to previous city
                3 - print menu options
                """);
    }
}
