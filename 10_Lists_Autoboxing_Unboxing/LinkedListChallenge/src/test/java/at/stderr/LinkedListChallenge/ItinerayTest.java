package at.stderr.LinkedListChallenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItinerayTest {

    @Test
    @DisplayName("Test if we do not add duplicate places")
    void shouldNotAddDuplicatePlaces() {
        Itineray i = new Itineray();
        assertTrue(i.addPlace(new Place("Adelaide", 1234)));
        assertFalse(i.addPlace(new Place("Adelaide", 1234)));
        assertFalse(i.addPlace(new Place("adelaide", 1234)));
    }

    @Test
    @DisplayName("Test if we add places in the right order")
    void shouldAddPlaceInRightOrder() {
        Itineray i  = new Itineray();
        var adelaide = new Place("Adelaide", 2);
        var brisbane = new Place("Brisbane", 1);

        i.addPlace(adelaide);
        i.addPlace(brisbane);

        i.listPlaces();
    }
}