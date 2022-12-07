package at.stderr.Playlist;

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

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

//        public boolean addSong(String title, double duration) {
//            if (findSong(title) != null) {
//                return false;
//            }
//
//            this.songs.add(new Song(title, duration));
//            return true;
//        }

        public boolean add (Song song) {
            if (this.songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        public Song findSong(String title) {
            for(Song s : this.songs) {
                if (s.getTitle().equals(title)) return s;
            }
            // XXX: should return an UNKNOWN song?
            return null;
        }

        public Song findSong(int track) {
            if ( track < 1 || track > songs.size() ) return null;
            return this.songs.get(track - 1);
        }
    }

    public boolean addSong(String title, double duration) {
        //return songs.addSong(title, duration);
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        Song song = songs.findSong(track);
        if (song == null) return false;
        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song s = songs.findSong(title);

        if (s == null) return false;

        playlist.add(s);
        return true;
    }


}
