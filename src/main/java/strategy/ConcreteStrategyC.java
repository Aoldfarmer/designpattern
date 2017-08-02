package strategy;

/**
 * Description: 具体策略C
 *
 * @author yunqiangdi
 * @version 1.0
 * @since 2017-08-02 5:49 PM
 */
public class ConcreteStrategyC implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("策略C执行");
    }
}