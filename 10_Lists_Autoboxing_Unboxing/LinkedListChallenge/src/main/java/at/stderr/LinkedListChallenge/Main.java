package at.stderr.LinkedListChallenge;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class Main
{
    private static final Scanner scanner = new Scanner(System.in);
    private static final Itineray itineray = new Itineray();

    public static void main( String[] args ) {
        itineray.addPlace(new Place("Adelaide", 1374));
        itineray.addPlace(new Place("Alice Springs", 2771));
        itineray.addPlace(new Place("Brisbane", 917));
        itineray.addPlace(new Place("Darwin", 3972));
        itineray.addPlace(new Place("Melbourne", 877));
        itineray.addPlace(new Place("Perth", 3923));

        itineray.doneAddingPlaces();

        itineray.listPlaces();

        boolean quit = false;
        while(!quit) {
            var option = menu();
            switch (option) {
                case 'f' -> itineray.forward();
                case 'b' -> itineray.backward();
                case 'l' -> itineray.listPlaces();
                case 'm' -> menu();
                default -> quit = true;
            }
        }
    }

    private static char menu() {
        System.out.println("""
                Available options (select word or letter):
                (F)orward
                (B)ackward
                (L)ist places
                (M)menu
                (Q)uit
                """);
        var line = scanner.nextLine().trim().toLowerCase();

        return line.charAt(0);
    }
}
