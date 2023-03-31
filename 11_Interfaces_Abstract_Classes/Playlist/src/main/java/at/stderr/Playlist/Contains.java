package at.stderr.Playlist;

import java.util.ArrayList;

public class Contains {
    ArrayList<TestObject> testObjectList = new ArrayList<>();
    ArrayList<String> stringList = new ArrayList<>();

    public void run() {
        // Let's create three test objects. Two will be added to
        // the list, the third is used to check if the first one
        // is already in the list of testObjects
        TestObject first = new TestObject("first", 1);
        TestObject second = new TestObject("second", 2);
        TestObject third = new TestObject("first", 1);

        // Same with strings. Three Strings, firstString and secondString
        // will be added to the list of Strings, the third one is used
        // in contains()
        String firstString = "first";
        String secondString = "second";
        String thirdString = "first"; // this is different object, but has the same value

        testObjectList.add(first);
        testObjectList.add(second);

        stringList.add(firstString);
        stringList.add(secondString);

        // this returns TRUE! the object first is in the list
        System.out.println("Is first object in arraylist? " + testObjectList.contains(first));

        // this returns FALSE! we have objects and compare memory addresses
        // the default .equals() method of an Object (TestObject) compares memory
        // addresses
        System.out.println("Is third object in arraylist? " + testObjectList.contains(third));

        // both return TRUE
        // we call .equals() on a String, which compares Strings
        // so .contains() behave differently if used on a list of strings
        // or on a list of objects.
        System.out.println("Is 'first' in arraylist? " + stringList.contains(firstString));
        System.out.println("Is 'first' in arraylist? " + stringList.contains(thirdString));
    }

    private class TestObject {
        String text;
        int count;

        public TestObject(String text, int count) {
            this.text = text;
            this.count = count;
        }
    }
}
