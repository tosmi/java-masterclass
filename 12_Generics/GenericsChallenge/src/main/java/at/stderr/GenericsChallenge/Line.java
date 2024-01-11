package at.stderr.GenericsChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
