package spring.spel;

import org.junit.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class TestSpel {
    ExpressionParser parser = new SpelExpressionParser();

    @Test
    public void test() {

//        Expression exp = parser.parseExpression("'Hello World'.bytes.length");
//        int length = (Integer) exp.getValue();
//        Expression expression = parser.parseExpression("5>5");
//        Object value = expression.getValue();
//        System.out.println(value);

        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setVariable("target", 1);
        context.setVariable("value", 2);

        Boolean value = parser.parseExpression("#target > #value").getValue(context, Boolean.class);
        System.out.println(value);
    }


}
