package at.stderr.ArrayListChallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GroceryListTest {

    @Test
    void addItems() {
        GroceryList g = new GroceryList();
        g.addItems(new String[]{"Butter", "Milk", "Bread"});
        assertTrue(g.hasItem("Butter"));
        assertTrue(g.hasItem("Milk"));
        assertTrue(g.hasItem("Bread"));
    }

    @Test
    void removeItems() {
        GroceryList g = new GroceryList();
        g.addItems(new String[]{"Butter", "Milk", "Bread"});
        g.removeItems(new String[]{"Butter", "Bread"});
        assertTrue(g.hasItem("Milk"));
        assertFalse(g.hasItem("Butter"));
        assertFalse(g.hasItem("Bread"));
    }
}