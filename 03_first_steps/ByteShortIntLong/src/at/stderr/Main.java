package at.stderr;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Overflow
        System.out.println("Busted MAX value " + (myMaxIntValue + 1));

        // Underflow
        System.out.println("Busted MIN value " + (myMinIntValue - 1));

        // jdk >= 7
        int myMaxIntTest =  2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        // long requires l or better L at the end
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);

        // L is required here because otherwise the literal value is an
        // int
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        // int implicitly converted to short
        short bitShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        // this does not work without a cast. 2 is an int -> byte gets
        // converted to int and we then try to assign to a byte.
        // we need to cast the result to a byte.
        // https://stackoverflow.com/questions/41034555/why-byte-and-short-division-results-in-int-in-java
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte b = 126;
        short s = 250;
        int i = 1_000;

        // no casting required. L is optional
        long l = (50000L + 10L * (b + s +i));
        System.out.println(l);

        short sTotal = (short) (1000 + 10 * (b + s + i));
        System.out.println(sTotal);
    }
}
