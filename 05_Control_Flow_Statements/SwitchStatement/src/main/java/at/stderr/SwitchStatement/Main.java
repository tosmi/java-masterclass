package at.stderr.SwitchStatement;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was 3, 4 or 5");
                System.out.println("Acutal value is " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // enhanced switch
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was 3, 4 or 5");
                System.out.println("Acutal value is " + switchValue);
            }
            default -> System.out.println("Was not 1 or 2");
        }

        char charValue = 'F';
        switch(charValue) {
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Found " + charValue);
                break;
            default:
                System.out.println("not found");
                break;
        }

        String month = "january";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("not found");
                break;
        }

        DayOfTheWeekChallange.printDayOfTheWeek(0);
        DayOfTheWeekChallange.printDayOfTheWeek(8);

        month = "APRILX";
        System.out.println(month + " is in quarter " + getQuarter(month) + "quarter");

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
