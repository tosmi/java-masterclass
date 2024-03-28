package at.stderr.Exercise;

import org.junit.jupiter.api.Test;

import static at.stderr.Exercise.TeenNumberChecker.hasTeen;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeenNumberCheckerTest {

    @Test
    public void shouldHaveTeen() {
        assertTrue(hasTeen(9,99,19));
        assertTrue(hasTeen(23,15,42));
    }

    @Test
    public void shouldNotHaveTeen() {
        assertFalse(hasTeen(22,23,42));
    }
}
