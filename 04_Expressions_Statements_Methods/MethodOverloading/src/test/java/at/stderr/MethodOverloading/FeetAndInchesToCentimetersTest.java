package at.stderr.MethodOverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static at.stderr.MethodOverloading.FeedAndInchesToCentimeters.calcFeetAndInchesToCentimeters;

public class FeetAndInchesToCentimetersTest {

    @Test
    public void shouldReturnCorrectCentimeters() {
        assertEquals( calcFeetAndInchesToCentimeters(12d), 30.48000d);
        assertEquals( calcFeetAndInchesToCentimeters(2d,8d), 81.28d);
        assertEquals( calcFeetAndInchesToCentimeters(0d,8d), 20.32d);
        assertEquals( calcFeetAndInchesToCentimeters(1d,0d), 30.48d);
    }

    @Test
    public void shouldFailtToConvertFeetAndInchesToCentimeters() {
        assertEquals( calcFeetAndInchesToCentimeters(-1d, 2d), -1d);
        assertEquals( calcFeetAndInchesToCentimeters(2,13d), -1d);
        assertEquals( calcFeetAndInchesToCentimeters(2,-1d), -1d);

    }

}
