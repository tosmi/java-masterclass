package at.stderr.AbstractClassStoreChallenge;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(final int quantity) {
        return quantity * price;
    }

    public void printPricedLine(final int quantity) {
        System.out.printf("%2d qty at %8.2f each, %-15s %-35s%n",quantity, price, type, description);
    }

    public abstract void showDetails();
}
