package at.stderr.LinkedListChallenge;


import java.util.LinkedList;
import java.util.ListIterator;

public class Itineray {
    private record Place(String name, int distanceFromSidney) {};
    private final LinkedList<Place> itineray = new LinkedList<>();
    private ListIterator iterator = itineray.listIterator();

    private boolean goingForward = true;

    public Itineray() {

    }

    public void addPlace(Place place) {
        if(itineray.contains(place)) {
            System.out.println("Itinerary already contains " + place.name);
        }
        itineray.add(place);
    }

    public void forward() {
        if(iterator.hasNext()) {
            if (!goingForward)
                iterator.next();

            var town = iterator.next();
            System.out.println(town);
            goingForward = true;
            // System.out.println("Next town is " + town.name + ". Distance from Sidney is  " + town.dist);
        } else {
            System.out.println("Your are at the end of the itinerary");
        }
    }

    public void backward() {
        if(iterator.hasPrevious()) {
            if(goingForward)
                iterator.previous();

            var town = iterator.previous();
            System.out.println(town);
            goingForward = false;
            // System.out.println("Next town is " + town.name + ". Distance from Sidney is  " + town.dist);
        } else {
            System.out.println("Your are at the beginning of the itinerary");
        }

    }

    public void listPlaces() {
        System.out.println(itineray.toString());
    }


}
