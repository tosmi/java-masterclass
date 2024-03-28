package at.stderr.Composition;

public class Television {
    private String brand;
    private String size;

    public Television(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void powerOn() {
        System.out.println("Television turned on");
    }
}
