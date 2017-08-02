package strategy;

/**
 * Description: 具体策略B
 *
 * @author yunqiangdi
 * @version 1.0
 * @since 2017-08-02 5:48 PM
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("策略B执行");
    }
}
