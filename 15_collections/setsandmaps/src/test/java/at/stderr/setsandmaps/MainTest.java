package at.stderr.setsandmaps;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void shouldAnswerWithTrue()
    {
        Contact c = new Contact( "Toni", "toni@stderr.at", 1234567890);
        assertEquals( c.getph );
    }
}
