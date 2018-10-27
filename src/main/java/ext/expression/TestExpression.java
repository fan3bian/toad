package ext.expression;

import org.apache.commons.jexl3.*;
import org.junit.Test;
import util.ValidatorUtils;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhangshuyi1 on 2018/7/25.
 * apache Expression
 */
public class TestExpression {
    private static JexlEngine engine = new JexlBuilder().silent(false).strict(true).create();
    public final static String AMOUNT = "^([0-9]+|[0-9]{1,3}(,[0-9]{3})*)(.[0-9]{1,2})?$";
    public final static String AMOUNT2 = "^-?\\\\d+(\\\\.\\\\d+)?$";
    public final String positiveFloat = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";
    public final String non_positiveF="^\\d+(\\.\\d+)?$";
    public static void main(String[] args) {

        String exprStr=" val>=1000&&val<=2000 ";

        JexlExpression expr = engine.createExpression(exprStr);
        JexlContext ctx = new MapContext();
        ctx.set("val",new BigDecimal("1010.11"));

        System.out.println(expr.evaluate(ctx));

    }
    @Test
    public void test1(){
        Pattern pattern = Pattern.compile(AMOUNT2);
        Matcher matcher = pattern.matcher("123122");

        System.out.println(matcher.matches());
        System.out.println(pattern.matcher("0").matches());

    }
    @Test
    public void test2(){

        System.out.println(ValidatorUtils.validateCharSequence(non_positiveF,"-12312.1231"));
        System.out.println(ValidatorUtils.validateCharSequence(non_positiveF,"0.0"));
        System.out.println(ValidatorUtils.validateCharSequence(non_positiveF,"0"));
        System.out.println(ValidatorUtils.validateCharSequence(non_positiveF,"123123"));
        System.out.println(ValidatorUtils.validateCharSequence(non_positiveF,"1231.1231231231"));
    }

}
