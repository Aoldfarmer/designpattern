package strategy.example2;

/**
 * @author koou
 * @version 1.0
 * @since 2017-08-05 下午 13:27
 */
public class StrategyProcess {

    /**
     * @param t 策略的执行对象
     * @param strategy 具体策略
     */
    public static <T> void apply(T t, Strategy<T> strategy) {
        strategy.process(t);
    }

}
