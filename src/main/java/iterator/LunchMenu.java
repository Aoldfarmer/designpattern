package iterator;

import java.util.Iterator;

public class LunchMenu implements Menu {

    private MenuItem[] items;

    public void setItems(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        return new ArrayIterator(items);
    }
}
