package interpreter;

public class AdditionExpression extends OperatorExpression {


    public AdditionExpression(AritheticExpression aritheticExpression1, AritheticExpression aritheticExpression2) {
        super(aritheticExpression1, aritheticExpression2);
    }

    @Override
    public int interpreter() {
        return aritheticExpression1.interpreter() + aritheticExpression2.interpreter();
    }
}
