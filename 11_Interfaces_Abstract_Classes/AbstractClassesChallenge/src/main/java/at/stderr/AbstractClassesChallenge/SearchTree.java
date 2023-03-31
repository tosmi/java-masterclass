package at.stderr.AbstractClassesChallenge;

import java.util.List;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // new item is greate, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no node to the right so add at this poing
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // new item is less, move left if possible
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    // there is no node left, so insert here
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present!");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if ( item != null ) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;
        while ( currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if ( comparison < 0 ) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if ( comparison  > 0 ) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if(item.next() == null) {
            // no right tree, so make parent point to the left tree (which may be null)
            if (parent.next() == item) {
                // item is the right child of the parent
                parent.setNext(item.previous());
            } else if ( parent.previous() == item){
                // item is the left child of the parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we are looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left tree, so make parent point to the left tree (which may be null)
            if (parent.next() == item) {
                // item is the right child of the parent
                parent.setNext(item.next());
            } else if ( parent.previous() == item){
                // item is the left child of the parent
                parent.setPrevious(item.next());
            } else {
                // parent must be item, which means we are looking at the root of the tree
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is now  alot trickier
            // From the right sub-tree, find the smallest value. (i.e. the leftmost)
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while(current.previous() != null){
                leftmostParent = current;
                current = current.previous();
            }

            // now put the smallest value into our node  to be deleted
            item.setValue(current.getValue());
            // and delete the smallest item
            if (leftmostParent ==  item){
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that most now be deleted)
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null)
                leftmostParent.setPrevious(current.next());
            }
        }

    }

    @Override
    public void traverse(ListItem current) {
        if (current != null) {
            traverse(current.previous());
            System.out.println(current.getValue());
            traverse(current.next());
        }
    }
}
