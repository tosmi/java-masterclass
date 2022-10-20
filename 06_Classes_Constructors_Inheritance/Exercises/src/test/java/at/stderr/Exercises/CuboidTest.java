package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertAll(
                () -> assertEquals(5.0, rectangle.getWidth()),
                () -> assertEquals(10.0, rectangle.getLength()),
                () -> assertEquals(50.0, rectangle.getArea())
        );
    }

    @Test
    public void testCubiod() {
        Cuboid cuboid = new Cuboid(5,10,5);
        assertAll(
                () -> assertEquals(5.0, cuboid.getWidth()),
                () -> assertEquals(10.0, cuboid.getLength()),
                () -> assertEquals(5.0, cuboid.getHeight()),
                () -> assertEquals(50.0, cuboid.getArea()),
                () -> assertEquals(250.0, cuboid.getVolume())
        );
    }

}