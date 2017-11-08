package flyweight.complex;

import flyweight.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyweight implements FlyWeight {

    private Map<String, FlyWeight> flyWeightMap = new HashMap<>();

    public void add(String innerState, FlyWeight flyWeight) {
        flyWeightMap.put(innerState, flyWeight);
    }

    @Override
    public void action(String externalState) {
        flyWeightMap.forEach((innerState, flyweight) ->
            flyweight.action(externalState)
        );
    }
}
