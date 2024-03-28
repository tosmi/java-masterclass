package at.stderr.Inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String type,int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(type, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs() {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs();
        super.move(speed);
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf")
            System.out.println("Woooo");
        super.makeNoise();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyes=" + eyes +
                ", legs=" + legs +
                ", tail=" + tail +
                ", teeth=" + teeth +
                ", coat='" + coat + '\'' +
                "} " + super.toString();
    }
}
