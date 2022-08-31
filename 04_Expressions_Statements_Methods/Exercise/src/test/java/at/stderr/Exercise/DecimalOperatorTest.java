package at.stderr.Exercise;

import org.junit.jupiter.api.Test;

import static at.stderr.Exercise.DecimalOperator.areEqualByThreeDecimalPlaces;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecimalOperatorTest {

    @Test
    public void shouldBeEqual() {
        assertTrue(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        assertTrue(areEqualByThreeDecimalPlaces(3.0, 3.0));
    }

    @Test
    public void shouldNotBeEqual() {
        assertFalse(areEqualByThreeDecimalPlaces(3.175, 3.176));
        assertFalse(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
