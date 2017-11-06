package factory.abstractfactory;

import factory.Engine;
import factory.Wheel;

public interface BaseCarFactory {

    Engine newEngine();

    Wheel newWheel();
}
