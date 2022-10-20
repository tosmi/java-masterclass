package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    public void testCircle() {
        Circle circle = new Circle(3.75);
        assertAll(
                () -> assertEquals(3.75, circle.getRadius()),
                () -> assertEquals(44.178646691106465, circle.getArea())
        );
    }

    @Test
    public void testCylinder() {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        assertAll(
                () -> assertEquals(5.55, cylinder.getRadius()),
                () -> assertEquals(7.25, cylinder.getHeight()),
                () -> assertEquals(96.76890771219959, cylinder.getArea()),
                () -> assertEquals(701.574580913447, cylinder.getVolume())
        );
    }

}