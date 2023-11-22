package at.stderr.InterfaceChallenge17;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        Building house = new Building("Schloss Gobelsburg", BuildingType.CASTLE);
        house.setMarker("RED STAR");

        System.out.println(house.toJson());

        Mappable.mapIt(house);
    }
}
