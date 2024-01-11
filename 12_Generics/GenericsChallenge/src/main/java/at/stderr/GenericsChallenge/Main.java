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
        Line l = new Line("test", c);
        l.render();
    }
}
