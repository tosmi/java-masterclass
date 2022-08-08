package at.stderr.masterclass;

public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMindoubleValue);
        System.out.println("double maximum value = " + myMaxdoubleValue);

        int myIntValue = 5 / 3;
        // not recommended
        // float myFloatValue = (float) 5.25;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("MyIntValue=" + myIntValue);
        System.out.println("MyFloatValue=" + myFloatValue);
        System.out.println("MyDoubleValue=" + myDoubleValue);

        double myPound = 200d;
        double myKilogram = myPound * 0.45359237d;
        System.out.println(myPound + " pound(s) == " + myKilogram + " kilogram(s)");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.1_415_927d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
