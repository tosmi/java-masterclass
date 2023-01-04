package at.stderr.ArrayListChallenge;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();


    public void addItems(String[] items) {
        for(String item : items) {
            if (!groceryList.contains(item))
                groceryList.add(item);
        }
    }

    public void removeItems(String[] items) {
        for(String item : items) {
            if(groceryList.contains(item)){
                groceryList.remove(item);
            }
        }
    }
}

