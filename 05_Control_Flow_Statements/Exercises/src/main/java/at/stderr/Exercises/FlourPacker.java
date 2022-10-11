package at.stderr.Exercises;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ( bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        final int maxBigCount = goal % 5;
        final int bigCountKilos = bigCount * 5;

        if (bigCountKilos + smallCount < goal) {
            return false;
        } else if (bigCountKilos > goal) {
            return false;
        }
        return true;
    }
}
