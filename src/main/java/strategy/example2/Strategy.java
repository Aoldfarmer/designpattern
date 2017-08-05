package strategy.example2;

/**
 * @author koou
 * @version 1.0
 * @since 2017-08-05 下午 13:26
 */
public interface Strategy<T> {
    /**
     * 策略接口
     * @param t 策略执行
     */
    <T> void process(T t);
}
