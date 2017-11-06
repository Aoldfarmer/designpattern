package factory.abstractfactory;

import factory.Engine;
import factory.EngineB;
import factory.Wheel;
import factory.WheelA;

public class SUVFactory implements BaseCarFactory {

    @Override
    public Wheel newWheel() {
        return new WheelA();
    }

    @Override
    public Engine newEngine() {
        return new EngineB();
    }
}
