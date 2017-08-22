package singleton.lazy;

/**
 * Description: 延迟初始化非线程安全单例模式
 *
 * @author yunqiangdi
 * @version 1.0
 * @since 2017-08-22 4:27 PM
 */
public class UnsafeSingleton {

    private static UnsafeSingleton instance;

    private UnsafeSingleton() {
        //防止被实例化
    }

    public static UnsafeSingleton getInstance() {
        if(instance == null)
            instance = new UnsafeSingleton();
        return instance;
    }

}
