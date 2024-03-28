package at.stderr.Composition;

public class Couch {
    private String name;
    private int capacity;
    private int occuppied;

    public Couch(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.occuppied = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean sitDown() {
      if (occuppied <= capacity) {
          occuppied++;
          System.out.println(occuppied + " out of " + capacity + " seat taken.");
          return true;
      }

      return false;
    }

    public boolean standUp() {
        if (occuppied != 0) {
            occuppied--;
            System.out.println(occuppied + " out of " + capacity + " seat taken.");
            return true;
        }

        return false;
    }
}
