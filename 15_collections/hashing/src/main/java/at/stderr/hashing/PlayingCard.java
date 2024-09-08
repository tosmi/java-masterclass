package at.stderr.hashing;

public class PlayingCard {
    private String suit;
    private String face;
    private int internalHashcode;

    public PlayingCard(String suit, String face) {
        this.suit = suit;
        this.face = face;
        this.internalHashcode = 1;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

    @Override
    public int hashCode() {
        return internalHashcode;
    }

    // equals is only called when the hashcode is equal for objects
    // this means they need to be in the same bucket
    // in sets only one such object will be in the bucket
    // but hashes could colide for different (unequal) objects
    @Override
    public boolean equals(Object obj) {
        System.out.println("--> Checking PlayingCard equality");
        return true;
    }
}
