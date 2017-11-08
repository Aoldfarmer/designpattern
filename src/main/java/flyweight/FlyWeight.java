package flyweight;

public interface FlyWeight {
    /**
     * 逻辑处理
     * @param externalState 外部状态
     */
    void action(String externalState);
}
