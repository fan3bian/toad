package util;


import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * Created by zhangshuyi1 on 2018/1/18.
 */
public class ValidatorUtils {

    public static boolean validateCharSequence(String pattern, CharSequence target) {
        return StringUtils.isNotBlank(target) && Pattern.compile(pattern).matcher(target).matches();
    }
}
