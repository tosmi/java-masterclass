package at.stderr.AbstractClasses;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        //Animal animal = new Animal("animal", "big", 100);
        Dog dog = new Dog("Wolf","big", 100 );
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 100));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
        }

//  Code from old Lecture
//        Dog dog = new Dog("Yorkie");
//        dog.breathe();
//        dog.eat();
//
//        Parrot parrot = new Parrot("Australian ringneck");
//        parrot.breathe();
//        parrot.eat();
//
//        Pinguin pinguin = new Pinguin("Emperor");
//        pinguin.fly();
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
