package at.stderr.InterfaceChallenge17;

public interface Mappable {
    String JSON_PROPERTIES = """
            "properties":{%s}
            """;

    String getLabel();
    GeometryType getGeometry();
    IconType getIcon();

    String toJson();

    public static void print(Mappable m) {
        System.out.println(m);
    }
}
