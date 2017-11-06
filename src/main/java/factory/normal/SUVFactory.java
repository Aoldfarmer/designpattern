package factory.normal;

import factory.BaseCar;
import factory.SUV;

public class SUVFactory extends BaseCarFactory {

    @Override
    public BaseCar newCar() {
        return new SUV();
    }
}
