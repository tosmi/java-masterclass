package at.stderr.LinkedListChallenge;


import javax.print.attribute.standard.Finishings;
import java.util.LinkedList;
import java.util.ListIterator;

;

public class Itineray {

    private final LinkedList<Place> itineray = new LinkedList<>();
    private ListIterator iterator;

    private boolean goingForward = true;

    public Itineray() {

    }

    public boolean addPlace(Place newPlace) {
        boolean placeAdded = false;

        if (hasDuplicatePlace(newPlace))
            System.out.println("Itinerary already contains " + newPlace.name());
        else {
            addPlaceInOrder(newPlace);
            placeAdded = true;
        }

        return placeAdded;
    }

    public void doneAddingPlaces() {
        this.iterator = itineray.listIterator();
    }

    private boolean hasDuplicatePlace(Place place) {
        boolean hasDuplicate = false;

        if(itineray.contains(place)) {
            hasDuplicate = true;
        } else {
            for (Place p : itineray) {
                if (place.name().toLowerCase().equals(p.name().toLowerCase()))
                    hasDuplicate = true;
            }
        }

        return hasDuplicate;
    }

    private void addPlaceInOrder(Place newPlace) {
        int currentIndex = 0;
        for (Place p : itineray) {
            if (newPlace.distanceFromSidney() < p.distanceFromSidney()) {
                itineray.add(currentIndex, newPlace);

                // iterator might be better, if we don't break
                // after adding the place we get a comodification exception
                return;
            }
            currentIndex++;
        }

        itineray.add(newPlace);
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
