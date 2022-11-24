package at.stderr.AutoboxingUnboxing;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main 
{
    public static void main( String[] args ) {
        var strArray = new String[10];
        var intArray = new int[10];

        var strArrayList = new ArrayList<String>();
        strArrayList.add("Toni");

        var intArrayList = new ArrayList<IntClass>();

        intArrayList.add(new IntClass(5));

        System.out.println(intArrayList.toString());

        Integer integer = new Integer(5);
        Double doublevalue = new Double(2.0);

        var integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10 ; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println(i + " -> " + integerArrayList.get(i).intValue() );
        }

        // autoboxing
        Integer myIntValue = 56; // Integer.valueOf(56) auto boxing
        int myInt = myIntValue; // myIntValue.intValue() auto unboxing

        var myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl < 10.0; dbl++) {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            System.out.println(i + " -> " + myDoubleValues.get(i));
        }
    }
}
