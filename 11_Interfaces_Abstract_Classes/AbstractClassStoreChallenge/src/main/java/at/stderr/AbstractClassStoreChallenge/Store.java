package at.stderr.AbstractClassStoreChallenge;

import java.util.ArrayList;

record OrderItem (int qty, ProductForSale product) {}

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        Store store = new Store();

        storeProducts.add(new Fruit("banana", 2.0, "a yellow banana"));
        storeProducts.add(new Fruit("apple", 1.5, "a red apple"));

        storeProducts.add(new Furniture("Desk", 500, "Mahagony Desk"));
        storeProducts.add(new Furniture("Lamp", 200, "A big lamp"));


        store.listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 3, 1);

        printOrder(order2);

    }

    public void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for ( var item : order) {
            item.product().printPricedLine(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }

        System.out.printf("Sales total = $%6.2f %n",  salesTotal);
    }

}
