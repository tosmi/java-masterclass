package at.stderr.Composition;

public class PersonalComputer {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // getMonitor().drawPixelAt(1200, 50, "yellow");
        monitor.drawPixelAt(1200, 50, "yellow");
    }


}
