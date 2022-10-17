package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @Test
    void add() {
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber two = new ComplexNumber(2.5,-1.5);

        one.add(1,1);
        assertAll(
                () -> assertEquals(2.0, one.getReal()),
                () -> assertEquals(2.0, one.getImaginary())
        );
    }

    @Test
    void subtract() {
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber two = new ComplexNumber(2.5,-1.5);

        one.add(1,1);
        one.subtract(two);
        assertAll(
                () -> assertEquals(-0.5, one.getReal()),
                () -> assertEquals(3.5, one.getImaginary())
        );

        two.subtract(one);
        assertAll(
                () -> assertEquals(3.0, one.getReal()),
                () -> assertEquals(-5.0, one.getImaginary())
        );
    }


}