package at.stderr.InterfaceChallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    public void shouldSavePlayer() {
        Player p = new Player("Toni", 5, 10);

        var savedPlayer = p.write();

        assertEquals("Toni", savedPlayer.get(0));
        assertEquals("Sword", savedPlayer.get(1));
        assertEquals("5", savedPlayer.get(2));
        assertEquals("10", savedPlayer.get(3));
    }

    @Test
    public void shouldRestorePlayer() {
        Player p = new Player("Toni", 5, 10);

        var savedPlayer = p.write();

        Player newPlayer =
    }


}