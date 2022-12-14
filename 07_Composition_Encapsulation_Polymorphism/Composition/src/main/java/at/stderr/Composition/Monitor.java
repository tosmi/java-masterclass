package at.stderr.Composition;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution navtiveResolution;

    public Monitor(String model, String manufacturer, int size, Resolution navtiveResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.navtiveResolution = navtiveResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color) ;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Resolution getNavtiveResolution() {
        return navtiveResolution;
    }

    public void setNavtiveResolution(Resolution navtiveResolution) {
        this.navtiveResolution = navtiveResolution;
    }
}
