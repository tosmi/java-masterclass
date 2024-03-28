package at.stderr.NestedClasses.burger;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meal {
    private double base = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;
    private double conversionRate;

    public Meal() {
        this(1);
    }

    public Meal(double conversionRate) {
        this.conversionRate = conversionRate;
        burger = new Burger("regular");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal() {
        double total = burger.getPrice() + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }

    public void addToppings(String... toppings) {
        burger.addToppings(toppings);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side, "Total Due: ", getTotal());
    }

    private class Burger extends Item {
        // enum, records, interfaces are always static when used internally
        // when method getPrice() gets called, it is called with an INSTANCE
        // of the enum. e.g. this is AVACODO or BACON or...
        private enum Extra { AVOCADO, BACON, CHEESE, KETCHUP, MAYO, MUSTARD, PICKLES;
            private double getPrice() {
                return switch(this) {
                    case AVOCADO -> 1.0;
                    case BACON, CHEESE -> 1.5;
                    default -> 0;
                };
            }
        }
        private List<Item> toppings = new ArrayList<>();
        public Burger(String name) {
            super(name, "burger");
        }

        private void addToppings(String... selectedToppings) {
            for (String selectedTopping : selectedToppings) {
                try {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "TOPPING",
                            topping.getPrice()));
                } catch (IllegalArgumentException ie) {
                    System.out.println("No topping found for " + selectedTopping);
                }
            }
        }

        public double getPrice() {
            double total = super.price;
            for(Item topping : toppings ) {
                total += topping.price;
            }
            return total;
        }

        @Override
        public String toString() {
            StringBuilder itemized = new StringBuilder(super.toString());
            for (Item topping : toppings) {
                itemized.append("\n").append(topping);
            }
            return itemized.toString();
        }
    }

    private class Item {
        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? base : 0);
        }
        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name,
                    // can call static method without class name in class
                    getPrice(price, conversionRate));

        }

        public static double getPrice(double price, double rate) {
            return price * rate;
        }
    }
}
