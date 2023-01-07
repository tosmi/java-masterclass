package at.stderr.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Java17Demo {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Syndey");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

        // getElements(placesToVisit );
        printItineray3(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue Methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        // Stack Methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");

        // Queue / Deque poll methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");


        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");


        String p3 = list.pollLast(); // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed");
    }

    private static void getElements(LinkedList<String> list ) {
        System.out.println("Retrieved element = " + list.get(4));
        System.out.println("First element = " + list.getFirst());
        System.out.println("Last element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.indexOf("Melbourne"));

        // Queue retrieval
        System.out.println("Element from element() = " + list.element());

        // Stack retrieval
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItineray(LinkedList<String> list) {
        System.out.println("Trip starts " + list.getFirst());
        for ( int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends " + list.getLast());
    }

    public static void printItineray2(LinkedList<String> list) {
        System.out.println("Trip starts " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends " + list.getLast());
    }

    public static void printItineray3(LinkedList<String> list) {
        System.out.println("Trip starts " + list.getFirst());
        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends " + list.getLast());
    }
}
