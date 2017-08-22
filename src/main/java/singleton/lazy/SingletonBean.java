package singleton.lazy;

/**
 * Description: 延迟初始化占位
 *
 * @author yunqiangdi
 * @version 1.0
 * @since 2017-08-22 4:49 PM
 */
public class SingletonBean {

    private static class Holder {
        private static SingletonBean instance = new SingletonBean();
    }

    public static SingletonBean getInstance() {
        return Holder.instance;
    }

}
