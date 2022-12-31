package at.stderr.InnerClasses;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main( String[] args ) {
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.printf(title + " was clicked!");
//            }
//        }
        // btnPrint.setOnClickListener(new ClickListener());


//        btnPrint.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked (anonymous class)");
//            }
//        });

        btnPrint.setOnClickListener(title -> System.out.println(title + " was clicked (lambda)"));

        listen();

//        Gearbox mcLaren = new Gearbox(6);
//
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

    }

    public static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = Integer.parseInt(scanner.nextLine());
           switch(choice) {
               case 0 -> quit = true;
               case 1 -> btnPrint.onClick();
           }
        }
    }
}
