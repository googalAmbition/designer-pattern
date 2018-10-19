package com.ctc.interpreter;

import org.junit.Test;

import java.text.MessageFormat;
import java.util.Stack;

public class APP {

    @Test
    public void interpreterTest() {
        String string = "4 3 2 - 1 + *";
        Stack<Expression> stack = new Stack<>();

        String[] strings = string.split(" ");
        for (String s : strings) {
            if (isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                System.out.println(MessageFormat.format("popped from stack left: {0}, right: {1}", leftExpression.interpret(), rightExpression.interpret()));
                Expression operator = getOperatorInstance(s, leftExpression, rightExpression);
                System.out.println(MessageFormat.format("operator: {0}", operator));
                int result = operator.interpret();
                NumberExpression resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
                System.out.println(MessageFormat.format("push result to stack {0}", resultExpression.interpret()));
            } else {
                NumberExpression numberExpression = new NumberExpression(s);
                stack.push(numberExpression);
                System.out.println(MessageFormat.format("push to stack {0}", numberExpression.interpret()));
            }
        }
        System.out.println(MessageFormat.format("result: {0}",stack.pop().interpret()));
    }


    public boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    public static Expression getOperatorInstance(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new PlusExpression(left, right);
            case "-":
                return new MinusExpression(left, right);
            case "*":
                return new MultiplyExpression(left, right);
            default:
                return new MultiplyExpression(left, right);
        }
    }
}

