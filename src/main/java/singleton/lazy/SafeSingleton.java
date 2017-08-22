package singleton.lazy;

/**
 * Description: 延迟初始化线程安全单例模式
 *
 * @author yunqiangdi
 * @version 1.0
 * @since 2017-08-22 4:44 PM
 */
public class SafeSingleton {

    private static SafeSingleton instance;

    private SafeSingleton() {
        //防止被实例化
    }

    public synchronized static SafeSingleton getInstance() {
        if(instance == null)
            instance = new SafeSingleton();
        return instance;
    }
}
