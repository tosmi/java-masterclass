package at.stderr.Exercise;

import static at.stderr.Exercise.SpeedConverter.toMilesPerHour;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SpeedConverterTest {

    @Test
    public void speedConverterShouldReturnNegativOne() {
        long miles = toMilesPerHour(-2.0);
        assertEquals(-1, miles);
    }

    @Test
    public void speedConverterTest() {
        long miles = toMilesPerHour(10.25);
        assertEquals(6, miles);
    }
}
