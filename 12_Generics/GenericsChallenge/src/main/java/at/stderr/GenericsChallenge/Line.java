package at.stderr.GenericsChallenge;

import java.util.List;

public class Line implements Mappable {
    private String name;
    private List<Coordinates> coordinates;
    @Override
    public void render() {
        System.out.println(name + " as " + this.getClass().getSimpleName().toUpperCase()  + " " + coordinates + ")");
    }

    public Line(String name, List<Coordinates> coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }
}
