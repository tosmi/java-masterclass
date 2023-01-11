package at.stderr.AbstractClassesChallenge;

public abstract class ListItem {

    // only subclasses of ListItem will have access to next and previous
    // per default we have no next and previous element in the list so null
    protected ListItem next = null;
    protected ListItem previous = null;

    Object item;

    abstract public ListItem next();
    abstract public ListItem setNext(ListItem item);
    abstract public ListItem previous();
    abstract public ListItem setPrevious(ListItem item);
    abstract public int compareTo(ListItem other);

     public boolean hasNext() {
         return !next.equals(null);
     }

    public boolean hasPrevious() {
        return !previous.equals(null);
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
