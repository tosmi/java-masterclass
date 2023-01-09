package at.stderr.AutoboxingUnboxing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdatedCourseJdk17 {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15);
        Integer deprecatedBoxing = new Integer(15);
        int unboxedInt = boxedInt.intValue();

        // automatic
        Integer autoboxed = 15;
        int autoUnboxed = autoboxed;
        System.out.println(autoboxed.getClass().getName());
        //System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(characterArray));

        var outList = getList(1,2,3,4,5);
        var otherOutList = List.of(1,2,3,4,5);
        System.out.println(outList);

    }

    private static ArrayList<Integer> getList(Integer... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }
}
