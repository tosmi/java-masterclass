package at.stderr.AbstractClassesChallenge;

public abstract class ListItem {

    // only subclasses of ListItem will have access to next and previous
    // per default we have no next and previous element in the list so null
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    Object value;

    abstract private ListItem next();
    abstract private ListItem setNext(ListItem item);
    abstract private ListItem previous();
    abstract public ListItem setPrevious(ListItem item);
    abstract public int compareTo(ListItem other);

    public ListItem(Object value) {
        this.value = value;
    }

    public ListItem() {
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
