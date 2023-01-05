package at.stderr.ArrayListChallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();


    public void addItems(String[] items) {
        for(String item : items) {
            String trimmed = item.trim();
            if (!groceryList.contains(trimmed))
                groceryList.add(trimmed);
        }
    }

    public void removeItems(String[] items) {
        for(String item : items) {
            String trimmed = item.trim();
            if(groceryList.contains(trimmed)){
                groceryList.remove(trimmed);
            }
        }
    }

    public boolean hasItem(String item) {
        return groceryList.contains(item);
    }

    public void listItems() {
        System.out.println("The following items are one the list: " + groceryList.toString());
    }
}

