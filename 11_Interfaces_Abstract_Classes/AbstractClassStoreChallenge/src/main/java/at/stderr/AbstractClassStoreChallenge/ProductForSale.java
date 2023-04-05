package at.stderr.AbstractClassStoreChallenge;

public abstract class ProductForSale {
    private String type;
    private float price;
    private String description;

    public float getSalesPrice(final int quantity) {
        return quantity * price;
    }

    public void printPricedLine(final int quantity) {
        System.out.printf("%s\t\t%s%n",quantity, price);
    }

    public abstract String showDetails();
}
