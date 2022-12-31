package at.stderr.Playlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    @Test
    public void shouldReturnTitle() {
        Song s = new Song("Test", 1.0);

        assertEquals("Test", s.getTitle());
    }

    @Test
    public void shouldReturnCorrectString() {
        Song s = new Song("Test", 1.9);

        assertEquals("Test: 1.9", s.toString());
    }

}