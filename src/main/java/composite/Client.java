package composite;

public class Client {

    public static void main(String[] args) {
        Component component = new Composite("root");
        component.add(new Leaf("leaf1"));
        component.add(new Leaf("leaf2"));
        component.foreach();
    }
}
