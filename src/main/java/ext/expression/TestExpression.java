package ext.expression;

import org.apache.commons.jexl3.*;

/**
 * Created by zhangshuyi1 on 2018/7/25.
 * apache Expression
 */
public class TestExpression {
    private static JexlEngine engine = new JexlBuilder().silent(false).strict(true).create();

    public static void main(String[] args) {

        String exprStr=" val>=1000&&val<=2000 ";

        JexlExpression expr = engine.createExpression(exprStr);
        JexlContext ctx = new MapContext();
        ctx.set("val",1200);

        System.out.println(expr.evaluate(ctx));

    }
}
