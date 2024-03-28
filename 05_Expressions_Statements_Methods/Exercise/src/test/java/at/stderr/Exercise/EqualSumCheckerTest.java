package at.stderr.Exercise;

import org.junit.jupiter.api.Test;

import static at.stderr.Exercise.EqualSumChecker.hasEqualSum;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EqualSumCheckerTest {

    @Test
    public void hasEqualSumTest() {
        assertTrue(hasEqualSum(1,1,2));
        assertTrue(hasEqualSum(1,-1,0));
    }

    @Test
    public void hasNotEqualSumTest() {
        assertFalse(hasEqualSum(1,1,1));
    }
}
