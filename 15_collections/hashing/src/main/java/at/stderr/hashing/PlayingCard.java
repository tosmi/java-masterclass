package at.stderr.hashing;

public class PlayingCard {
    private String suit;
    private String face;
    private int internalHashcode;

    public PlayingCard(String suit, String face) {
        this.suit = suit;
        this.face = face;
        // this.internalHashcode = 1;
        this.internalHashcode = (suit.equals("Hearts") ? 11 : 12);
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

    /*@Override
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
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayingCard that = (PlayingCard) o;
        return suit.equals(that.suit) && face.equals(that.face);
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        // 31 because this spreads out hash codes
        // reducing the chance of different objects having the same
        // hash code
        // important if data in object cluster or follows a pattern
        result = 31 * result + face.hashCode();
        return result;
    }
}
