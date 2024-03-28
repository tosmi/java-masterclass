package at.stderr.playlistExercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;

    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        }

        songs.add(new Song(title, duration));
        return true;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        if ( track < 1 || track > songs.size() ) return false;
        playlist.add(songs.get(track - 1));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song s = findSong(title);

        if (s == null) return false;

        playlist.add(s);
        return true;
    }

    private Song findSong(String title) {
        for(Song s : songs) {
            if (s.getTitle().equals(title)) return s;
        }

        // XXX: should return an UNKNOWN song?
        return null;
    }

    public class SongList {
        private List<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {

        }

        private Song findSong(String title) {
            for(Song s : songs) {
                if (s.getTitle().equals(title)) return s;
            }

            // XXX: should return an UNKNOWN song?
            return null;
        }

        private Song findSong(int tracknumber) {
            return new Song();
        }
    }
}
