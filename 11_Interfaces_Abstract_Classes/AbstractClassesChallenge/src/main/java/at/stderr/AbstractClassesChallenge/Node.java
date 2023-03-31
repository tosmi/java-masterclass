package at.stderr.AbstractClassesChallenge;

import java.util.Objects;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem other) {
        // any value is greater than null
        if (Objects.isNull(other))
            return -1;

        return ((String) this.getValue()).compareTo((String) other.getValue());
    }
}
