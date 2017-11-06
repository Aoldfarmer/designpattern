package factory.normal;

import factory.BMW;
import factory.BaseCar;

public class BMWFactory extends BaseCarFactory {

    @Override
    public BaseCar newCar() {
        return new BMW();
    }
}
