package at.stderr.InterfaceChallenge17;

public interface Mappable {
    String JSON_PROPERTIES = """
            "properties":{%s}
            """;

    String getLabel();
    String getMarker();
    Geometry getShape();

    default String toJson() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(this.getShape(), this.getLabel(), this.getMarker());
    }

    public static void mapIt(Mappable m) {
        System.out.println(JSON_PROPERTIES.formatted(m.toJson()));
    }
}
