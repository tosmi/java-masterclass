package at.stderr.cardgame;

import java.util.Collections;
import java.util.List;

public class FiveCardDraw {
    List<Card> deck = Card.getStandardDeck();

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void deal(List<Player> players) {

    }

    public void printDeck() {
        Card.printDeck(deck);
    }
}
