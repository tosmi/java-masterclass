package at.stderr.GenericsChallenge;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> elements = new ArrayList<>();

    public Layer(List<T> elements) {
        this.elements = elements;
    }

    public Layer() {
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public void addElements(List<T> elements) {
        this.elements.addAll(elements);
    }

    public void renderLayer() {
        for(Mappable e : elements) {
            e.render();
        }
    }
}
