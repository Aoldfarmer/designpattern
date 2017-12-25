package interpreter;

public abstract class OperatorExpression extends AritheticExpression {

    protected AritheticExpression aritheticExpression1, aritheticExpression2;

    public OperatorExpression(AritheticExpression aritheticExpression1, AritheticExpression aritheticExpression2) {
        this.aritheticExpression1 = aritheticExpression1;
        this.aritheticExpression2 = aritheticExpression2;
    }

}
