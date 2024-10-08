package at.stderr.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        // aText and bText point to the same object in memory
        String aText = "Hello";
        String bText = "Hello";
        // different object in memory
        String cText = String.join("l","He", "lo");
        // different object in memory
        String dText = "He".concat("llo");
        // different object in memory and string is not equal
        String eText = "hello";

        List<String> hellos = Arrays.asList(aText, bText, cText, dText, eText);

        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        // works because of hellos is a collection
        Set<String> mySet = new HashSet<>(hellos);

        System.out.println("mySet = " + mySet);
        System.out.println("# of elements in mySet = " + mySet.size());

        for (String setValue : mySet) {
            System.out.println("Comparing with ==: ");
            System.out.print(setValue + ": ");
            for (int i = 0; i < hellos.size(); i++) {
                if (setValue == hellos.get(i)) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println("\nComparing with .equals(): ");
            for (int i = 0; i < hellos.size(); i++) {
                if (setValue.equals(hellos.get(i))) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println(" ");
        }

        PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenSpades = new PlayingCard("Spades", "Queen");

        List<PlayingCard> cards = Arrays.asList(aceHearts, kingClubs, queenSpades);
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<PlayingCard> deck = new HashSet<>();
        for (PlayingCard card : cards) {
            if (!deck.add(card)) {
                System.out.println("Found a duplicate for " + card );
            }
        }
        System.out.println(deck);
    }
}
