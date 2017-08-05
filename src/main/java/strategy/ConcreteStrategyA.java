package strategy;

/**
 * Description: 具体策略A
 *
 * @author yunqiangdi
 * @version 1.0
 * @since 2017-08-02 5:47 PM
 */
public class ConcreteStrategyA implements Strategy {

    public void algorithmInterface() {
        System.out.println("策略A执行");
    }
}
