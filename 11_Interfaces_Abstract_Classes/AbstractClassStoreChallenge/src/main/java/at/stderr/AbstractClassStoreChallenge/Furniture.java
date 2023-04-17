package at.stderr.AbstractClassStoreChallenge;

public class Furniture extends ProductForSale {


    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This %s was manufactured in North Carolina".formatted(this.getType()));
        System.out.println("The price is %6.2f for this piece".formatted(this.getPrice()));
        System.out.println(this.getDescription());
    }
}
