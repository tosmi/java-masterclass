package at.stderr.Playlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;

    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        }

        songs.add(new Song(title, duration));
        return true;
    }

    public boolean addToPlaylist(int track, LinkedList<Song> playlist) {
        if ( track > (songs.size() - 1) ) return false;
        playlist.add(songs.get(track));
        return true;
    }

    private Song findSong(String title) {
        for(Song s : songs) {
            if (s.getTitle().equals(title)) return s;
        }

        // XXX: should return an UNKNOWN song?
        return null;
    }


}
