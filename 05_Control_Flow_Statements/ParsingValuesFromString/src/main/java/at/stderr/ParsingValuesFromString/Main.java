package at.stderr.ParsingValuesFromString;

public class Main
{
    public static void main( String[] args ) {
        String numberAsString = "2018.125";
        System.out.println("number as string: " + numberAsString);

        int number = 0;
        try {
            number = Integer.parseInt(numberAsString);
        } catch(NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println("number: " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("number as string: " + numberAsString);
        System.out.println("number: " + number);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("double number: " + doubleNumber);
    }
}
