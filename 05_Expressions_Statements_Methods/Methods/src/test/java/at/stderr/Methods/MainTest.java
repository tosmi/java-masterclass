package at.stderr.Methods;

import static at.stderr.Methods.Main.calculateHighScorePosition;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * A simple unit test
 */
public class MainTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReturnPositionOne()
    {
        int score = calculateHighScorePosition(1001);
        assertTrue( score == 1 );
    }

    @Test
    public void shouldStillReturnPositionOne() {
        int score = calculateHighScorePosition(1000);
        assertTrue( score == 1 );
    }

    @Test
    public void shouldReturnPositionTwo() {
        int score = calculateHighScorePosition(500);
        assertTrue( score == 2 );
    }

    @Test
    public void shouldReturnPositionThree() {
        int score = calculateHighScorePosition(100);
        assertTrue( score == 3 );
    }

    @Test
    public void shouldReturnPositionFour() {
        int score = calculateHighScorePosition(99);
        assertTrue( score == 4 );
    }
}
