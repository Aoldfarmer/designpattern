package adapter;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-06 下午 21:59
 */
public class Client {

    public static void main(String[] args) {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target adapter = new Adapter();
        adapter.request();


        Target proxyAdapter = new ProxyAdapter(new Adaptee());
        proxyAdapter.request();
    }
}
