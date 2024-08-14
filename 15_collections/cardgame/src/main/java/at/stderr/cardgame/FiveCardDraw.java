package at.stderr.cardgame;

import java.util.*;

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

    public void deal() {

        var deckIndex = 0;
        for (int i = 0; i < cardsInHand; i++) {
                for (Player p : this.players) {
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

        // nCopies returns immutable list, so replaceAll does not work
        // remainingCards = Collections.nCopies(...)
        remainingCards.addAll(Collections.nCopies(cardsRemaining, null));
        this.remainingCards.replaceAll(c -> deck.get(cardsDealt + remainingCards.indexOf(c)));
    }

    public void evaluateHands() {
        for (Player p : this.players) {
            rankCards(p.hand());
        }
    }

    private void rankCards(List<Card> hand) {
        var sorting = Comparator.comparing(Card::rank).thenComparing(Card::suit).reversed();
        hand.sort(sorting);
        System.out.println("------");
        System.out.println(hand);
        List<Integer> ranks = new ArrayList<>(5);
        hand.forEach(card -> ranks.add(card.rank()));
        System.out.println(ranks);

        var pairs = 0;
        var score = Ranking.NONE;

        // needs an iterator because we modify the ranks list on the fly
        Iterator<Integer> i = ranks.iterator();
        while (i.hasNext())

        ranks.forEach(r -> {
            var freqency = Collections.frequency(ranks, ranks.get(0));

            switch (freqency) {
                case 1 -> {}
                case 2 -> {
                    if (score == Ranking.NONE) {
                        score = Ranking.ONE_PAIR;
                    } else if (score == Ranking.ONE_PAIR) {
                        score = Ranking.TWO_PAIR;
                    } else if (score == Ranking.THREE_OF_A_KIND) {
                        score = Ranking.FULL_HOUSE;
                    }
                }
                case 3 -> {
                    if (score == Ranking.NONE) {
                        score = Ranking.THREE_OF_A_KIND;
                    } else if (score == Ranking.TWO_PAIR) {
                        score = Ranking.FULL_HOUSE;
                    }
                }
                case 4 -> {
                    score = Ranking.FOUR_OF_A_KIND;
                }
            }
            ranks.remove(0);
        }

        System.out.println("Final ranking: " + score);
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
