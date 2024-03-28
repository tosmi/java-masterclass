package at.stderr.Inheritance;

public class Animal {
    // used in the dog class
    protected String type;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String type, int brain, int body, int size, int weight) {
        this.type = type;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    public String getType() {
        return this.type;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", brain=" + brain +
                ", body=" + body +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
