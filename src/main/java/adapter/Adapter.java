package adapter;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-06 下午 21:59
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }
}
