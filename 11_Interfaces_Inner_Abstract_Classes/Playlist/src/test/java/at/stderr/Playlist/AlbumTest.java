package at.stderr.Playlist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @Test
    public void shouldAddSongToAlbum() {
        Album a = new Album("Stormbringer", "Deep Purple");
        assertTrue(a.addSong("Stormbringer", 4.6));
        assertFalse(a.addSong("Stormbringer", 4.6));
    }

    @Test
    public void shouldAddSongsToPlaylist() {
        var albums = new ArrayList<Album>();
        var pl = new LinkedList<Song>();

        Album a = new Album("Stormbringer", "Deep Purple");
        a.addSong("Stormbringer", 4.6);
        a.addSong("Love don't mean a thing", 4.22);

        albums.add(a);

        assertTrue(albums.get(0).addToPlayList("Stormbringer", pl));
        assertTrue(albums.get(0).addToPlayList(1, pl));
        assertTrue(albums.get(0).addToPlayList(2, pl));

        assertFalse(albums.get(0).addToPlayList(3, pl));
        assertFalse(albums.get(0).addToPlayList(0, pl));
    }

}