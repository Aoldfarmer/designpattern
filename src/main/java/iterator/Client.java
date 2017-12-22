package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<MenuItem> itemList = Arrays.asList(new MenuItem("包子", 0.50),
                new MenuItem("稀饭", 0.50),
                new MenuItem("油条", 0.50));
        MenuItem[] itemArray = new MenuItem[10];
        itemArray[0] = new MenuItem("苹果", 3.00);
        itemArray[1] = new MenuItem("西瓜", 12);
        BreakMenu breakMenu = new BreakMenu();
        breakMenu.setItems(itemList);

        Iterator<MenuItem> breakIterator = breakMenu.getIterator();
        while (breakIterator.hasNext()) {
            System.out.println(breakIterator.next());
        }

        LunchMenu lunchMenu = new LunchMenu();
        lunchMenu.setItems(itemArray);
        Iterator<MenuItem> lunchIterator = lunchMenu.getIterator();
        while (lunchIterator.hasNext()) {
            System.out.println(lunchIterator.next());
        }


    }
}
