package at.stderr.Exercise;

import org.junit.jupiter.api.Test;

import static at.stderr.Exercise.AreaCalculator.area;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaCalculatorTest {

    @Test
    public void shouldReturnAreaRadius() {
        assertEquals(area(5.0d), 78.53981633974483);

    }

    @Test
    public void shouldReturnNegativeOne() {
        assertEquals(area(-1.0d), -1.0d);
    }

    @Test
    public void shouldReturnAreaRectangle() {
        assertEquals(area(5.0, 4.0), 20.0d);
    }

    @Test
    public void shouldReturnNegativeOneRectangle() {
        assertEquals(area(-1.0,4.0), -1.0d);
        assertEquals(area(4.0,-1.0), -1.0d);
        assertEquals(area(-1.0,-1.0), -1.0d);
    }
}
