package at.stderr.Composition;

public class LivingRoom {
    private Television television;
    private Couch couch;

    public LivingRoom(Television television, Couch couch) {
        this.television = television;
        this.couch = couch;
    }

    public Television getTelevision() {
        return television;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }

    public void sitDownOnCouch() {
        if (!couch.sitDown()){
            System.out.printf("Couch is full, sorry!");
        }
    }

    public void standUpFromCouch() {
        if (!couch.standUp()) {
            System.out.println("Seems there is no one on the couch!");
        }
    }
}
