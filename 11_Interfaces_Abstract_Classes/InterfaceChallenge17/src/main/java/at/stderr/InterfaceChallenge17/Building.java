package at.stderr.InterfaceChallenge17;

public class Building implements Mappable {

    private String name;
    private UsageType usage;
    private String marker;
    private Geometry geometry = Geometry.POINT;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + this.usage + ")";
    }

    public String getMarker() {
        return switch(usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERMENT -> Color.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
