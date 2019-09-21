package util;

public class RegexConstant {
    public static final String DOUBLE= "^(-?\\d+)(\\.\\d+)?$";
    //金额
    public static final String AMOUNT = "^([0-9]+|[0-9]{1,3}(,[0-9]{3})*)(.[0-9]{1,2})?$";
    public static final String POSITIVE_FLOAT = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";


    public static void main(String[] args) {
        boolean b = ValidatorUtil.validateCharSequence(POSITIVE_FLOAT, "0.001");
        System.out.println(b);
    }
}
