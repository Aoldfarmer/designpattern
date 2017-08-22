package singleton.nolazy;

/**
 * Description: 非懒加载模式的单例
 *
 * @author yunqiangdi
 * @version 1.0
 * @since 2017-08-22 5:02 PM
 */
public class UnLazySingleton {

    private static UnLazySingleton instance = new UnLazySingleton();

    private UnLazySingleton() {

    }

    public static UnLazySingleton getInstance() {
        return instance;
    }
}
