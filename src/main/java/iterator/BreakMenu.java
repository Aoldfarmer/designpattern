package iterator;

import java.util.Iterator;
import java.util.List;

public class BreakMenu implements Menu {

    private List<MenuItem> items;

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        return items.iterator();
    }
}
