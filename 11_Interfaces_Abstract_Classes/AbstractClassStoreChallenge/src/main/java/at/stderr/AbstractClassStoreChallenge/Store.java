package at.stderr.AbstractClassStoreChallenge;

import java.util.ArrayList;

public class Store {
    private ArrayList<ProductForSale> list = new ArrayList<>();

    public static void main(String[] args) {
        Store store = new Store();

        store.addItem(new Fruit("banana", 2.0, "a yellow banana"));
        store.addItem(new Fruit("apple", 1.5, "a red apple"));

        store.listProducts();
    }

    public void listProducts() {
        for (var item : list) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public void addItem(ProductForSale product) {
        list.add(product);
    }

}
