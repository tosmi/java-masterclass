package at.stderr.AbstractClassesChallenge;

import java.util.Objects;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        boolean itemAdded = false;
        // first add a root item if the root is null
        if(this.root == null) {
            this.root = newItem;
            itemAdded = true;
        } else {
            ListItem currentItem = this.root;
            while ( currentItem != null) {
                int comparison = currentItem.compareTo(newItem);
                if(comparison < 0) {
                    // newItem is greater
                    if(currentItem.next() != null) {
                        currentItem = currentItem.next();
                    } else {
                        // there is no next item
                        currentItem.setNext(newItem);
                        newItem.setPrevious(currentItem);
                        itemAdded = true;
                        break;
                    }
                } else if (comparison > 0 ) {
                    // newItem is less
                    if ( currentItem.previous() != null) {
                        currentItem.previous().setNext(newItem);
                        newItem.setPrevious(currentItem.previous());
                        newItem.setNext(currentItem);
                        currentItem.setPrevious(newItem);
                    } else {
                        // node without a previous item (root)
                        newItem.setNext(this.root);
                        this.root.setPrevious(newItem);
                        this.root = newItem;
                    }
                    itemAdded = true;
                    break;
                } else {
                    System.out.println(newItem.getValue() + " is already present, not added.");
                    break;
                }

            }
        }
        return itemAdded;
    }

    @Override
    public boolean removeItem() {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if ( root == null ) {
            System.out.println("List is empty");
        } else {
            while( root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
