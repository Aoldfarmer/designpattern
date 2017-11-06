package factory.abstractfactory;

import factory.Engine;
import factory.EngineA;
import factory.Wheel;
import factory.WheelA;

public class BMWFactory implements BaseCarFactory {


    @Override
    public Engine newEngine() {
        return new EngineA();
    }

    @Override
    public Wheel newWheel() {
        return new WheelA();
    }
}
