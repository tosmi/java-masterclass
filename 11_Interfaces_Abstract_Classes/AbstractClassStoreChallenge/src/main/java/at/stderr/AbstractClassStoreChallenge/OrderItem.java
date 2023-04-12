package at.stderr.AbstractClassStoreChallenge;

public class OrderItem {
    private int quantity;
    private ProductForSale item;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductForSale getItem() {
        return item;
    }

    public void setItem(ProductForSale item) {
        this.item = item;
    }
}
