package at.stderr.cardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record Player(String name, List<Card> hand, Ranking rank) {

    Player(String name) {
        this(name, new ArrayList<Card>(5), Ranking.NONE);
    }

    @Override
    public String toString() {
        return "%s - %s - %s".formatted(name, hand, rank);
    }
}
public class Main 
{
    public static void main( String[] args ) {
        FiveCardDraw game = new FiveCardDraw();
        List players = new ArrayList<>(Arrays.asList(
                new Player("Toni"),
                new Player("Franz"),
                new Player("Karl"),
                new Player("Hans")
                )
        );

        game.printDeck();
        game.shuffle();
        game.printDeck();
        game.cutDeck();
        game.printDeck();
        game.deal(players, 5);
        System.out.println("---------------------");
        players.forEach(System.out::println);
    }
}
