package adapter;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-06 下午 22:02
 */
public class ProxyAdapter implements Target {

    private Adaptee adaptee;

    public ProxyAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
