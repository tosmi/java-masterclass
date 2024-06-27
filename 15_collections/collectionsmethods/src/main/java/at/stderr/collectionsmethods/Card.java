package at.stderr.collectionsmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public record Card(Suit suit, String face, int rank) {
    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage() {
            return (new char[]{9827,9830,9829,9824})[this.ordinal()];

            // or, IMHO this is more robust than relying on the right order
            // of the array of char above
            /*return switch (this) {
                case CLUB -> '♣';
                case DIAMOND -> '♦';
                case HEART -> '♥';
                case SPADE -> '♠';
                default -> throw new IllegalArgumentException("Invalid suit: " + this);
            };*/
        }
    }

    public static Card getNumbericCard(Suit suit, int number) {
        if ( number < 2 || number > 10 )
            throw new IllegalArgumentException("Invalid card number: " + number);

        return new Card(suit, Integer.toString(number), number-2);
    }

    //public static Card getFaceCard(Suit suit, String face) {
    public static Card getFaceCard(Suit suit, char abbrev) {
        /*var rank = switch(face) {
            case "J" -> 9;
            case "Q" -> 10;
            case "K" -> 11;
            case "A" -> 12;
            default -> throw new IllegalArgumentException("Invalid face: " + face);
        };*/

        int charIndex = "JQKA".indexOf(abbrev);
        if ( charIndex < 0 )
            throw new IllegalArgumentException("Invalid face: " + abbrev);

        return new Card(suit, "" + abbrev, charIndex + 9);
    }

    public static List<Card> getStandardDeck() {
        List<Card> deck = new ArrayList<>(52);
        for (Suit suit : Suit.values()) {
            for (int number = 2; number <= 10; number++) {
                deck.add(getNumbericCard(suit, number));
            }
            /*deck.add(getFaceCard(suit, "J"));
            deck.add(getFaceCard(suit, "Q"));
            deck.add(getFaceCard(suit, "K"));
            deck.add(getFaceCard(suit, "A"));*/

            for (char c : new char[]{'J','Q','K','A'})
                deck.add(getFaceCard(suit, c));
        }
        return deck;
    }

    public static void printDeck(List<Card> deck) {
        printDeck(deck,"Current Deck", 4);
    }

    public static void printDeck(List<Card> deck, String description, int rows) {
        var deckLength = deck.size();
        var cardsPerRow = (deckLength / rows);

        System.out.println("------------------------------------");

        if (!Objects.isNull(description))
            System.out.println(description);

        for (int i = 0; i < rows; i++) {
            int startIndex = i * cardsPerRow;
            int endIndex = i * cardsPerRow + cardsPerRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }

        /*int currentColumn = 0;
        for (Card card : deck) {
            if (currentColumn == cardsPerRow) {
                System.out.println();
                currentColumn = 0;
            }
            System.out.print(card + " ");
            currentColumn++;
        }
        System.out.println();*/
    }

    public String toString() {

        // is this really required? lets see
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0,index);

        //return "%s%c(%d)".formatted(face, suit.getImage(), rank);
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }
}
