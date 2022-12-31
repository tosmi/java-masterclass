package at.stderr.Polymorphism;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args ) {
        // car();

        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Type (A -> Adventure, C -> Comedy, S -> Science Fiction or Q -> Quit: ");
            String type = s.nextLine();
            if (type.contains("qQ"))
                break;

            System.out.println("Enter movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }

    public static void car() {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(8,"Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(8,"Ford Bronco");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(8,"Ford Bronco");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}
