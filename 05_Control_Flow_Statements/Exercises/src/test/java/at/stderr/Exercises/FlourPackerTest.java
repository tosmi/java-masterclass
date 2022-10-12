package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlourPackerTest {
    @Test
    public void shouldStateIfPackingPossible() {
        assertFalse(FlourPacker.canPack(1,0,4));
        assertFalse(FlourPacker.canPack(-3,2,12));
        assertFalse(FlourPacker.canPack(1,0,6));
        assertFalse(FlourPacker.canPack(5,3,24));

        assertTrue(FlourPacker.canPack(1,0,5));
        assertTrue(FlourPacker.canPack(0,5,4));
        assertTrue(FlourPacker.canPack(2,1,5));
        assertTrue(FlourPacker.canPack(6,2,17));

    }
}
