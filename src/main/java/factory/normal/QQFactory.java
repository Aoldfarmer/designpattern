package factory.normal;

import factory.BaseCar;
import factory.QQ;

public class QQFactory extends BaseCarFactory {

    @Override
    public BaseCar newCar() {
        return new QQ();
    }
}
