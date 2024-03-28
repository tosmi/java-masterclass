package at.stderr.Exercise;

public class PlayingCat {
    public static final int SUMMER_UPPER_LIMIT = 45;
    public static final int WINTER_UPPER_LIMIT = 35;

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int limit = WINTER_UPPER_LIMIT;
        boolean isPlaying = false;

        if (summer) {
            limit = SUMMER_UPPER_LIMIT;
        }

        if ( temperature >= 25 && temperature <= limit) {
            isPlaying = true;
        }

        return isPlaying;
    }
}
