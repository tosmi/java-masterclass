package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {

    @Test
    void getArea() {
        Wall w = new Wall(5,4);
        assertAll(
                () -> assertEquals(20, w.getArea() )
        );
    }

    @Test
    void setWidth() {
        Wall w = new Wall(5,4);
        assertEquals(20, w.getArea() );

        w.setWidth(-1.5);
        assertEquals(0, w.getWidth());
        assertEquals(0, w.getArea());
    }

    @Test
    void setHeight() {
        Wall w = new Wall(5,4);
        assertEquals(20, w.getArea() );

        w.setHeight(-1.5);
        assertEquals(0, w.getHeight());
        assertEquals(0, w.getArea());
    }
}