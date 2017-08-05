package strategy.example1;

/**
 * Description: 策略测试类
 *
 * @author yunqiangdi
 * @version 1.0
 * @since 2017-08-02 5:55 PM
 */
public class StrategyTest {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Context ctx = new Context(strategy);
        ctx.operator();
    }
}
