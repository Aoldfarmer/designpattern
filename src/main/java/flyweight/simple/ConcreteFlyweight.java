package flyweight.simple;


import flyweight.FlyWeight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteFlyweight implements FlyWeight {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteFlyweight.class);
    private String innerState;

    public ConcreteFlyweight(String innerState) {
        this.innerState = innerState;
    }

    @Override
    public void action(String externalState) {
        LOG.debug("innerState: {}", innerState);
        LOG.debug("externalState: {}", externalState);
    }
}
