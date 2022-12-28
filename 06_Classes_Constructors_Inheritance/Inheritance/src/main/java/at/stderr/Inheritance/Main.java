package at.stderr.Inheritance;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Yorkie", 8, 20,2, 4,1,20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
        doAnimalStuff(animal, 5);
        doAnimalStuff(dog, 5);
        doAnimalStuff(new Dog("Wolf", 8, 20,2, 4,1,20, "long silky"), 8);
    }

    public static void doAnimalStuff(Animal animal, int speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}
