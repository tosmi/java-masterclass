package at.stderr.InterfaceChallenge17;

public class Building implements Mappable {

    private String name;
    private BuildingType type;
    private String marker;
    private Geometry geometry = Geometry.POINT;

    public Building(String name, BuildingType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + this.type + ")";
    }

    public void setMarker(String marker) {
        return switch(type) {
            case BUSINESS -> null;
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERMENT -> Color.RED + " " + PointMarker.STAR;
        }
    }

    @Override
    public String getMarker() {
        return this.marker;
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }
}
