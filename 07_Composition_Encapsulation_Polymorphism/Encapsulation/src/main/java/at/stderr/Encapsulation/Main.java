package at.stderr.Encapsulation;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
//        Player player = new Player();
//        player.name = "Toni";
//        // player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Toni", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());

        Printer printer = new Printer(50, true);

        printer.printPages(50);
        System.out.println("Printer pages printed: " + printer.getPagesPrinted());



    }
}
