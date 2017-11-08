package flyweight;

import flyweight.complex.ConcreteCompositeFlyweight;
import flyweight.simple.ConcreteFlyweight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FlyWeightFactory {

    private static final Logger LOG = LoggerFactory.getLogger(FlyWeightFactory.class);

    private static ConcurrentHashMap<String, FlyWeight> flyWeightMap =
            new ConcurrentHashMap<>();

    public static FlyWeight getCompositeWeight(List<String> innerStates) {
        ConcreteCompositeFlyweight compositeFlyweight =
                new ConcreteCompositeFlyweight();
        innerStates.parallelStream()
                .forEach(innerState -> compositeFlyweight
                        .add(innerState, getFlyWeight(innerState)));
        return compositeFlyweight;
    }

    public static FlyWeight getFlyWeight(String innerState) {
        return flyWeightMap.putIfAbsent(innerState, new ConcreteFlyweight(innerState));
    }
}
