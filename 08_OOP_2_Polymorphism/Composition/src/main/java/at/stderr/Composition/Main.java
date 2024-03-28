package at.stderr.Composition;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        room();
    }

    public static void room() {
        Couch couch = new Couch("Leather", 5);
        Television television = new Television("Panasonic" ,"40 inch");
        LivingRoom livingRoom = new LivingRoom(television, couch);

        livingRoom.getTelevision().powerOn();
        livingRoom.sitDownOnCouch();
        livingRoom.standUpFromCouch();
        livingRoom.standUpFromCouch();
    }

    public static void computer() {
        Dimensions dimensions = new Dimensions(20, 20,20);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("2527","Eizo", 27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6,"v2.44");

        PersonalComputer pc = new PersonalComputer(theCase, monitor, motherboard);

        pc.powerUp();
    }
}
