package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void shouldReturnDistance() {
        Point p1 = new Point(6,5);
        Point p2 = new Point(3,1);
        Point p3 = new Point();

        assertAll(
                () -> assertEquals(7.810249675906654, p1.distance()),
                () -> assertEquals(5.0, p1.distance(p2)),
                () -> assertEquals(5.0, p1.distance(2,2)),
                () -> assertEquals(0.0, p3.distance())
        );
    }


}