package at.stderr.GenericsChallenge;

public record Coordinates(double latitude, double longitude) {

    @Override
    public String toString() {
        return "[" + latitude + "], [" + longitude +  "]";
    }
}
