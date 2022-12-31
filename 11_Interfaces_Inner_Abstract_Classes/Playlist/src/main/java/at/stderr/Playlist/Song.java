package at.stderr.Playlist;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;

        if (this.getClass() != otherObject.getClass() )
            return false;

        Song other = (Song) otherObject;

        return this.title.equals(other.getTitle());

    }
}
