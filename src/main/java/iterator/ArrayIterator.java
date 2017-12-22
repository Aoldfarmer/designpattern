package iterator;

import java.util.Iterator;

public class ArrayIterator implements Iterator {

    private MenuItem[] menuItems;
    private int index = 0;

    public ArrayIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (menuItems == null) {
            return false;
        }
        int length = menuItems.length;
        return (index < length);
    }

    @Override
    public Object next() {
        return menuItems[index++];
    }
}
