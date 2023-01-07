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
    private static final Itineray itinery = new Itineray();

    public static void main( String[] args ) {

//        itineray.add(new Place("Adelaide", 1374));
//        itineray.add(new Place("Alice Springs", 2771));
//        itineray.add(new Place("Brisbane", 917));
//        itineray.add(new Place("Darwin", 3972));
//        itineray.add(new Place("Melbourne", 877));
//        itineray.add(new Place("Perth", 3923));

        boolean quit = false;
        while(!quit) {
            var option = menu();
            switch (option) {
                case 'f' -> itinery.forward();
                case 'b' -> itinery.backward();
                case 'l' -> itinery.listPlaces();
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
