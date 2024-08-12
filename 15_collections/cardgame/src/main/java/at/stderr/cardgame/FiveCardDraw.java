package at.stderr.cardgame;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FiveCardDraw {
    List<Card> deck = Card.getStandardDeck();

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void cutDeck() {
        Random rand = new Random();
        int middle = rand.nextInt(20,30);

        Collections.rotate(deck, middle);

        // this is better done via Collections.rotate();
        /*List<Card> firstHalf = deck.subList(0,middle - 1);
        List<Card> secondHalf = deck.subList(middle,deck.size());

        deck = secondHalf;
        deck.addAll(firstHalf);*/
    }

    public void deal(List<Player> players, int numberOfCards) {
        for (int i = 0; i < numberOfCards; i++) {
                for (Player p : players) {
                    p.hand().add(deck.get(0));
                    deck.remove(0);
            }
        }
    }

    public void printDeck() {
        Card.printDeck(deck);
    }
}
