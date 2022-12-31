package at.stderr.ArraySort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * A simple unit test
 */
public class MainTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldSortArray()
    {
        final int[] sorted = {1,2,3,4,5};
        final int[] unsorted = {5,4,3,2,1};

        assertArrayEquals(sorted, Main.sortIntegers(unsorted));
    }
}
