package interpreter;

public class NumExpression extends AritheticExpression {

    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpreter() {
        return num;
    }
}
