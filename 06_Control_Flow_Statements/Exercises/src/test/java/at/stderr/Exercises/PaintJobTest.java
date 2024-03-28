package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintJobTest {
    @Test
    public void shouldReturnBucketCount() {
        assertEquals(3, PaintJob.getBucketCount(3.4, 2.1, 1.5,2));
        assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        assertEquals(3, PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));

        assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        assertEquals(5, PaintJob.getBucketCount(3.4, 2.1, 1.5));
        assertEquals(14, PaintJob.getBucketCount(7.25, 4.3, 2.35));

        assertEquals(3, PaintJob.getBucketCount(3.4, 1.5));
        assertEquals(3, PaintJob.getBucketCount(6.26, 2.2));
        assertEquals(5, PaintJob.getBucketCount(3.26, 0.75));
    }
}
