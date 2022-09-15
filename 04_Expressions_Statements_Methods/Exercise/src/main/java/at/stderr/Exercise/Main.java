package at.stderr.Exercise;

import static at.stderr.Exercise.DecimalOperator.areEqualByThreeDecimalPlaces;
import static at.stderr.Exercise.MegaBytesConverter.printMegaBytesAndKiloBytes;
import static at.stderr.Exercise.SpeedConverter.printConversion;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        areEqualByThreeDecimalPlaces(3.1234, 3.1235);
        MinutesToYearsAndDaysCaclulator.printYearsAndDays(525600);
        MinutesToYearsAndDaysCaclulator.printYearsAndDays(1051200);
        MinutesToYearsAndDaysCaclulator.printYearsAndDays(561600);
        IntEqualityPrinter.printEqual(2,2,2);
        IntEqualityPrinter.printEqual(2,3,2);
        IntEqualityPrinter.printEqual(2,3,1);
    }
}
