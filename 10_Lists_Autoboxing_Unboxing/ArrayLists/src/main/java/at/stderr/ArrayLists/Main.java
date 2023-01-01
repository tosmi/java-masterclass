package at.stderr.ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
record GroceryItem(String name, String type, int count) {
    GroceryItem(String name, String type, int count) {
        this.name = name;
        this.type = type;
        this.count = count;
    }

    public GroceryItem(String name) {
        this(name,"DAIRY", 0);
    }
}

public class Main 
{
        public static void main(String[] args ) {
            GroceryItem[] grocerArray = new GroceryItem[3];
            grocerArray[0] = new GroceryItem("Milk");
            grocerArray[1] = new GroceryItem("Apples", "PRODUCE", 6);
            grocerArray[2] = new GroceryItem("Oranges", "PRODUCE", 5);

            System.out.println(Arrays.toString(grocerArray));

            ArrayList objectList = new ArrayList();
            objectList.add(new GroceryItem("Butter"));
            objectList.add("Yoghurt");

            ArrayList<GroceryItem> groceryList = new ArrayList<>();
            groceryList.add(new GroceryItem("Butter"));
            groceryList.add(new GroceryItem("Yoghurt"));

    }
}
