package factory.simple;

public class SimpleFactory {

    public static BaseCar newCar(int type) {
        switch (type) {
            case 1:
                return new BMW();
            case 2:
                return new QQ();
            default:
                return new SUV();
        }
    }
}
