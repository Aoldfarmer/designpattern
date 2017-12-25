package composite;

public class Leaf extends Component {

    public Leaf(String s) {
        super(s);
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public void foreach() {
        System.out.println("tself name : " + name);
    }
}
