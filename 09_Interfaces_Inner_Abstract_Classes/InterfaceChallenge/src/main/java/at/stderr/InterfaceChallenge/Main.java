package at.stderr.InterfaceChallenge;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());

        saveObject(tim);
        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Strombringer");
        saveObject(tim);

        // loadObject(tim);

        System.out.println(tim);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println( ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        var values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("""
                Choose
                1. to enter a string
                0. to quit
                """);
        while(!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            System.out.println(scanner.nextLine());
            switch (choice) {
                case 0 -> quit = true;
                case 1 -> {
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(stringInput);
                    index++;
                }
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(String i : objectToSave.write()) {
            System.out.println("Saving " + i + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        var values = readValues();
        objectToLoad.read(values);
    }
}
