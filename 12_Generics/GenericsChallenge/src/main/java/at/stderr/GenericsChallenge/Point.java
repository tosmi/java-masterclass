package at.stderr.GenericsChallenge;

public class Point implements Mappable {
    private String name;
    private Coordinates coordinates;
    @Override
    public void render() {
        System.out.println(name + " as " + this.getClass().getSimpleName().toUpperCase()  + " (" + coordinates + ")");
    }

    public Point(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }
}
