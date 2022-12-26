package at.stderr.Playlist;

import java.util.ArrayList;

public class Reproducer {
    ArrayList<TestObject> testObjectList = new ArrayList<>();

    public static void main() {
        var contains = new Reproducer();
        contains.run();
    }

    public boolean add (TestObject o) {
        if (this.testObjectList.contains(o)) {
            return false;
        }

        System.out.println("Adding testObject " + o);
        this.testObjectList.add(o);
        return true;
    }
    public void run() {
        this.add(new TestObject("first", 1));
        this.add(new TestObject("first", 1));
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
