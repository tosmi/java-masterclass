package at.stderr.StudentChallenge.module;

import java.util.Comparator;

public class LPAStudent extends Student {
    private double percentComplete;
    public static Comparator<LPAStudent> byPercentComplete = Comparator.comparingDouble(LPAStudent::getPercentComplete);

    public LPAStudent() {
        // calls super constructor implicitly
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch(fName) {
            case "PERCENTCOMPLETE" -> percentComplete <= (Integer.parseInt(value));
            default -> super.matchFieldValue(fieldName, value);
        };
    }
}
