package factory.simple;

import factory.BMW;
import factory.BaseCar;
import factory.QQ;
import factory.SUV;

public class SimpleFactory {


    public static final int BMW = 1;
    public static final int QQ = 2;
    public static final int SUV = 3;


    public static BaseCar newCar(int type) {
        switch (type) {
            case BMW:
                return new BMW();
            case QQ:
                return new QQ();
            default:
                return new SUV();
        }
    }
}
