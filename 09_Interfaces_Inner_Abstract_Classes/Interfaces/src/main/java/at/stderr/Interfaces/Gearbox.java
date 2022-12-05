package at.stderr.Interfaces;

public class Gearbox {
    private boolean clutchIsIn;

    // untidy, we change String arg to boolean
    // not possible if code is already used in other classes
    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}
