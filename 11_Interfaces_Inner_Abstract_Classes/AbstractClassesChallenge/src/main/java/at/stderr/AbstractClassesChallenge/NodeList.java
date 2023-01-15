package at.stderr.AbstractClassesChallenge;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem();
    void traverse(ListItem root);
}
