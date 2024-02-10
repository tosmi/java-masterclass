package at.stderr.GenericsChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        List<Coordinates> c = new ArrayList<>();
        c.add(new Coordinates(0.1, 0.1));
        c.add(new Coordinates(0.3, 0.3));
        Line l = new Line("River", c);
        Point p = new Point("House", new Coordinates(0.2, 0.2));


        Layer layer = new Layer();
        layer.addElement(l);
        layer.addElement(p);

        layer.renderLayer();

    }
}
