package interpreter;

import java.util.Stack;

public class Calculator {

    protected Stack<AritheticExpression> expressionStack = new Stack<>();

    public  Calculator(String expression) {
        AritheticExpression aritheticExpression1, aritheticExpression2;

        String[] elements = expression.split("" );
        String temp = "";
        for (int i = 0; i < elements.length; ++i) {
            switch (elements[i].charAt(0)) {
                case '+':
                    expressionStack.push(new NumExpression(Integer.valueOf(temp)));
                    temp = "";
                    aritheticExpression1 = expressionStack.pop();
                    aritheticExpression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    expressionStack.push(new AdditionExpression(aritheticExpression1, aritheticExpression2));
                    break;
                default:
                    temp += elements[i];
                    break;
            }
        }
    }
    public int calculate() {
        return expressionStack.pop().interpreter();
    }

}
