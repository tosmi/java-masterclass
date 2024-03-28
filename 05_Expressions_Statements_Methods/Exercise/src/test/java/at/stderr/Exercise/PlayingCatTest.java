package at.stderr.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayingCatTest {

    @Test
    public void shouldBePlaying() {
        assertTrue(PlayingCat.isCatPlaying(false, 35));
        assertTrue(PlayingCat.isCatPlaying(true, 45));
    }

    @Test
    public void shouldNotBePlaying() {
        assertFalse(PlayingCat.isCatPlaying(true, 24));
        assertFalse(PlayingCat.isCatPlaying(false, 24));
    }
}
