package adapter;

/**
 * @author koou
 * @version 1.0
 * @since 2017-12-06 下午 21:58
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("普通类具有普通功能。。");
    }
}
