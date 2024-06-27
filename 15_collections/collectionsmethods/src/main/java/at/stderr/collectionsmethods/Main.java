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

        // if the Collection.addAll(...) is commented out this will
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
    }
}
