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
    public boolean removeItem(ListItem item) {
        if ( item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currenItem = this.root;
        while(currenItem != null) {
            int comparision = currenItem.compareTo(item);
            if ( comparision == 0 ) {
                if(currenItem == this.root) {
                    this.root = currenItem.next();
                } else {
                    currenItem.previous().setNext(currenItem.next());
                    if(currenItem.next() != null) {
                        currenItem.next().setPrevious(currenItem.previous());
                    }
                }

                return true;
            } else if (comparision < 0) {
                currenItem = currenItem.next();
            } else { // comparision > 1
                // We are at an item greater than to one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        // We have reached the end of the list
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

        // bad idea for a link list, because of the possible length of the list
        // binary try has a way lower depth!!
//        if ( root != null){
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }
    }
}
