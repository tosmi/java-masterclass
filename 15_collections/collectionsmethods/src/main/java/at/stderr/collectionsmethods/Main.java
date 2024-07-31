package at.stderr.collectionsmethods;

import java.awt.image.PackedColorModel;
import java.util.*;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');

        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);

        // ArrayList(52) only sets the capacity, it does NOT fill the List with elements
        // so the cards list has still 0 zero elements
        List<Card> cards = new ArrayList<Card>(52);

        // does not add elements, only overwrites existing elements
        Collections.fill(cards, aceOfHearts);
        // prints []
        System.out.println(cards);
        // prints 0
        System.out.println("cards.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collection with Aces added", 2);

        // if Collection.addAll(...) is commented out this will
        // throw an IndexOutOfBounds exception because the cards list is still empty
        // cards.size() == 0
        System.out.println(cards.size());
        // copies the list elements, does not return copy of list
        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "Card Collection with Kings copied", 2);

        System.out.println(cards.get(1));

        cardArray[1] = Card.getNumbericCard(Card.Suit.DIAMOND, 2);
        Card.printDeck(Arrays.asList(cardArray), "Replaced element 1 cardArray", 1);
        // cards.set(1, Card.getNumbericCard(Card.Suit.DIAMOND, 2));
        System.out.println(cards.get(1));
        Card.printDeck(cards, "Replaced element", 2);

        /*var cards2 = List.copyOf(kingsOfClubs);
        Card.printDeck(cards2, "Card Collection with Kings copied", 1);*/

        List<Card> cards2 = new ArrayList<>(kingsOfClubs);
        System.out.println("kingOfClubs = " + kingsOfClubs.getClass());
        System.out.println("cards2 = " + cards2.getClass());

        // it seems like the copy is a deep copy of elements
        // if we change modifyableKingOfClubs the elements in
        // cards2 stay the same
        List<Card> modifyableKingOfClubs = new ArrayList<>(kingsOfClubs);
        Collections.copy(cards2,modifyableKingOfClubs);
        modifyableKingOfClubs.set(1, Card.getNumbericCard(Card.Suit.DIAMOND, 2));
        Card.printDeck(modifyableKingOfClubs, "modifyableKingOfClubs", 1);
        Card.printDeck(cards2, "Card Collection with modifyable Kings copied", 1);


        // Video 200 shuffle, reverse, sort
        System.out.println("\n\n#########\nVideo 200\n#########");
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);
        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled deck", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed deck", 4);

        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);

        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Standard Deck sort by rank, suite", 13);

        Collections.reverse(deck);
        Card.printDeck(deck, "Sorted by rank, suite reversed", 13);

        List<Card> kings = new ArrayList<>(deck.subList(4,8));
        Card.printDeck(kings, "Kings in deck", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16,20));
        Card.printDeck(tens, "Tens in deck", 1);

        int subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("sublist index for tens = " + subListIndex );
        System.out.println("Contains = " + deck.containsAll(tens) );

        boolean disjoint = Collections.disjoint(deck, tens);
        System.out.println("disjoint = " + disjoint);

        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("disjoint2 = " + disjoint2);

        // Video 201 shuffle, reverse, sort
        System.out.println("\n\n#########\nVideo 201\n#########");

        Card.printDeck(deck, "Deck of cards", 4);
        // BinarySearch will fail if the deck is not sorted by sortingAlgorithm
        // see https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#binarySearch(java.util.List,%20T,%20java.util.Comparator)
        deck.sort(sortingAlgorithm);
        Card.printDeck(deck, "Sorted deck of cards", 13);
        //Binary search: list must be sorted, when duplicates, index of element found
        // is not specified
        Card tenOfHearts = Card.getNumbericCard(Card.Suit.HEART, 10);
        System.out.println("Search for: " + tenOfHearts);
        // need to specify sortingAlgorithm, as card does not implement Comparable
        // Collections.binarySearch is overloaded, sortingAlgorithm is optional
        int foundIndex = Collections.binarySearch(deck,tenOfHearts, sortingAlgorithm);
        System.out.println("foundIndex = " + foundIndex);
        // this will find tenOfHearts sorted or not
        // OK if list is small or unsorted, or has duplicates
        System.out.println("foundIndex = " + deck.indexOf(tenOfHearts));
        System.out.println(deck.get(foundIndex));

        // replace a card
        Card tenOfClubs = Card.getNumbericCard(Card.Suit.CLUB, 10);
        Collections.replaceAll(deck, tenOfClubs, tenOfHearts);
        Card.printDeck(deck.subList(32, 36), "Tens row", 1);

        // replaceAll returns boolean if something got replaced
        Collections.replaceAll(deck, tenOfHearts, tenOfClubs);
        Card.printDeck(deck.subList(32, 36), "Tens row", 1);

        if (Collections.replaceAll(deck, tenOfHearts, tenOfClubs)) {
            System.out.println("Tens of hearts replaced with tens of clubs");
        } else {
            System.out.println("No tens of hearts found in the list");
        }

        System.out.println("Ten of Clubs Cards = "
                + Collections.frequency(deck, tenOfClubs));

        System.out.println("Best Card = " + Collections.max(deck, sortingAlgorithm));
        System.out.println("Best Card = " + Collections.min(deck, sortingAlgorithm));

        var sortBySuit = Comparator.comparing(Card::suit)
                .thenComparing(Card::rank);
        deck.sort(sortBySuit);
        Card.printDeck(deck, "Sorted by Suit", 4);

        List<Card> copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied, 2);
        System.out.println("Unrotated: " + deck.subList(0,13));
        System.out.println("Rotated 2:" + copied);

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied, -2);
        System.out.println("Unrotated: " + deck.subList(0,13));
        System.out.println("Rotated -2: " + copied);

        // swap the array
        // we need to only swap half of the array
        copied = new ArrayList<>(deck.subList(0,13));
        for (int i = 0; i < copied.size() / 2; i++) {
            Collections.swap(copied, i, copied.size() - 1 - i);
        }
        System.out.println("Manual reverse: " + copied);

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.reverse(copied);
        System.out.println("Using reverse: " + copied);

    }
}
