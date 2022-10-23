package at.stderr.Polymorphism;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class Starwars extends Movie {
    public Starwars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class ForgetableMovie extends Movie {
    public ForgetableMovie() {
        super("Forgetable");
    }

    // no plot method
}

public class Main
{
    public static void main( String[] args ) {
        for( int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "Plot: " + movie.plot());
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5 + 1);
        System.out.println("Random number generated was " + randomNumber);

        return switch (randomNumber) {
            case 1 -> new Jaws();
            case 2 -> new IndependenceDay();
            case 3 -> new MazeRunner();
            case 4 -> new Starwars();
            case 5 -> new ForgetableMovie();
            default -> null;
        };

    }
}
