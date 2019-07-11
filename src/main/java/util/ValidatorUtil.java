package util;


import java.util.regex.Pattern;

/**
 * Created by zhangshuyi1 on 2018/1/18.
 */
public class ValidatorUtil {
    private ValidatorUtil(){}
    public static boolean validateCharSequence(String regex, CharSequence target) {
        return target != null && Pattern.compile(regex).matcher(target).matches();
    }
}
