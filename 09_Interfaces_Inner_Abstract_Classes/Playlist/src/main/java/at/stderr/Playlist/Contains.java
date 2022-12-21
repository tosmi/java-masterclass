package at.stderr.Playlist;

import java.util.ArrayList;

public class Contains {
    ArrayList<TestObject> ar = new ArrayList<TestObject>();

    public void run() {
        TestObject first = new TestObject("first", 1);
        TestObject second = new TestObject("second", 2);
        TestObject third = new TestObject("first", 1);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        ar.add(first);
        ar.add(second);

        System.out.println("Is first object in arraylist? " + ar.contains(first));
        System.out.println("Is third object in arraylist? " + ar.contains(third));

        Album a = new Album("Test Album", "Test Artist");
        a.addSong("Testsong", 1.0);
        a.addSong("Testsong", 1.0);



    }


    private class TestObject {
        String text;
        int count;

        public TestObject(String text, int count) {
            this.text = text;
            this.count = count;
        }

        public String getText() {
            return text;
        }

        public int getCount() {
            return count;
        }
    }
}
