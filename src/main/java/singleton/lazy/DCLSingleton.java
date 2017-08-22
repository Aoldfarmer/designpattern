package singleton.lazy;

/**
 * Description: 非线程安全双重加锁初始化单例
 *
 * @author yunqiangdi
 * @version 1.0
 * @since 2017-08-22 4:55 PM
 */
public class DCLSingleton {

    private static DCLSingleton instance;

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null)
                    instance = new DCLSingleton();
            }
        }
        return instance;
    }
}
