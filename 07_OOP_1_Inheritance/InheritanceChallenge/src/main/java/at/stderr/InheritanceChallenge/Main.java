package at.stderr.InheritanceChallenge;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        VolksWagen vw = new VolksWagen(36);
        vw.steer(45);
        vw.accelerate(30);
        vw.accelerate(20);
        vw.accelerate(-42);
    }
}
