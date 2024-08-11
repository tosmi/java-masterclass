package at.stderr.cardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record Player(String name, List<Card> hand) {

    Player(String name) {
        this(name, new ArrayList<Card>(5));
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nHand: " + hand;
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

        game.shuffle();
        game.printDeck();

        System.out.println(players.get(0));
        game.deal(players);
    }
}
