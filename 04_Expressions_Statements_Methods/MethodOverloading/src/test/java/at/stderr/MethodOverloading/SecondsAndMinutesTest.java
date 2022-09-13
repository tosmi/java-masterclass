package at.stderr.MethodOverloading;

import org.junit.jupiter.api.Test;

import static at.stderr.MethodOverloading.SecondsAndMinutes.getDurationString;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SecondsAndMinutesTest {

    @Test
    public void shouldFailWithMessage() {
        assertEquals(getDurationString(-1,1), "Invalid value");
        assertEquals(getDurationString(1,-1), "Invalid value");
        assertEquals(getDurationString(1,60), "Invalid value");
        assertEquals(getDurationString(1,61), "Invalid value");
    }

    @Test
    public void shouldReturnDurationString() {
        assertEquals(getDurationString(0,59), "00h 00m 59s");
        assertEquals(getDurationString(59,59), "00h 59m 59s");
        assertEquals(getDurationString(60,59), "01h 00m 59s");
    }

    @Test
    public void shouldReturnDurationStringForSecondsOnly() {
        assertEquals(getDurationString(59), "00h 00m 59s");
        assertEquals(getDurationString(60), "00h 01m 00s");
        assertEquals(getDurationString(61), "00h 01m 01s");
        assertEquals(getDurationString(3600), "01h 00m 00s");
        assertEquals(getDurationString(3660), "01h 01m 00s");
        assertEquals(getDurationString(3661), "01h 01m 01s");
    }
}
