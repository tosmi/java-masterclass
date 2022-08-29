package at.stderr.Exercise;

import static at.stderr.Exercise.MegaBytesConverter.printMegaBytesAndKiloBytes;
import static at.stderr.Exercise.SpeedConverter.printConversion;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        printConversion(25.42);
        printConversion(-2.0);

        printMegaBytesAndKiloBytes(2500);
    }
}
