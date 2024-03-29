package at.stderr.playlistExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlbumTest {

    @Test
    public void shouldAddSong() {
        var a = new Album("Stormbringer", "Deep Purple");
        var result = a.addSong("Test", 3.23);
        assertTrue(result);
    }
}
