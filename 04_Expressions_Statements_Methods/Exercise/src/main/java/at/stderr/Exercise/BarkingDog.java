package at.stderr.Exercise;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // wakup = false;
        //        if ((hourOfDay >= 0 && hourOfDay <= 23) && barking) {
//            if (hourOfDay < 8 || hourOfDay > 22) {
//                wakeUp = true;
//            }
//        }
        return ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23)) && barking;
    }
}
