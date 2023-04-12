package at.stderr.AbstractClassStoreChallenge;

public class Fruit extends ProductForSale {


    public Fruit(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This %s is a beautiful fruit".formatted(this.getType()));
        System.out.println("The price is %6.2f for this fruit".formatted(this.getPrice()));
        System.out.println(this.getDescription());
    }
}
