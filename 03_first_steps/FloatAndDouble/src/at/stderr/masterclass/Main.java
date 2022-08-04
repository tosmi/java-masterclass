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

        int myIntValue = 5;
        // not recommended
        // float myFloatValue = (float) 5.25;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;

        System.out.println("MyIntValue=" + myIntValue);
        System.out.println("MyFloatValue=" + myFloatValue);
        System.out.println("MyDoubleValue=" + myDoubleValue);
    }
}
