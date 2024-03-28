package at.stderr.Exercise;

import org.junit.jupiter.api.Test;

import static at.stderr.Exercise.BarkingDog.shouldWakeUp;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BarkingDogTest {
    @Test
    public void invalidHour() {
        assertFalse(shouldWakeUp(true, -1));
        assertFalse(shouldWakeUp(true, 24));
    }

    @Test
    public void shouldBark() {
        assertTrue(shouldWakeUp(true, 0));
        assertTrue(shouldWakeUp(true, 7));
        assertTrue(shouldWakeUp(true, 23));
    }

    @Test
    public void shouldNotBark() {
        assertFalse(shouldWakeUp(false, 0));
        assertFalse(shouldWakeUp(false, 7));
        assertFalse(shouldWakeUp(false, 23));

        assertFalse(shouldWakeUp(true, 8));
        assertFalse(shouldWakeUp(true, 22));
    }

}
