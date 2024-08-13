package at.stderr.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FiveCardDraw {
    List<Card> deck = Card.getStandardDeck();
    List<Card> remainingCards = new ArrayList<>();
    List<Player> players = new ArrayList<>();
    int cardsInHand = 0;

    FiveCardDraw(List<Player> players, int cardsInHand) {
        this.cardsInHand = cardsInHand;
        this.players = players;
    }

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

    public void deal(List<Player> players) {

        var deckIndex = 0;
        for (int i = 0; i < cardsInHand; i++) {
                for (Player p : players) {
                    p.hand().add(deck.get(deckIndex));
                    deckIndex++;
            }
        }
        calculateRemainingCards();
    }

    public void printDeck() {
        Card.printDeck(deck);
    }

    private void calculateRemainingCards() {
        int cardsDealt = cardsInHand * players.size();
        int cardsRemaining = deck.size() - cardsDealt;


        var test = new ArrayList<>(Collections.nCopies(cardsRemaining, null));
        test.replaceAll(c -> deck.get(cardsDealt + test.indexOf(c)));

        // nCopies returns immutable list, so replaceAll does not work
        remainingCards.addAll(Collections.nCopies(cardsRemaining, null));
        this.remainingCards.replaceAll(c -> deck.get(cardsDealt + remainingCards.indexOf(c)));
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("%s".formatted(Card.deckToString(deck, "the deck", 4)));
        output.append("%s".formatted(Card.deckToString(remainingCards, "remaining cards", 4)));

        output.append("--- Players ---\n");
        players.forEach(p -> output.append(p + "\n"));

        return output.toString();
    }
}
