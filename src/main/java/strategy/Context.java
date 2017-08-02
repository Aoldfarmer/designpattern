package strategy;

/**
 * Description: 上下文配置类
 *
 * @author yunqiangdi
 * @version 1.0
 * @since 2017-08-02 5:49 PM
 */
public class Context {

    //持有策略接口的引用
    private Strategy strategy;

    /**
     * 用其中某个策略初始化上下文
     * @param strategy 具体的策略类
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 进行策略的具体执行
     */
    public void operator() {
        strategy.algorithmInterface();
    }
}
