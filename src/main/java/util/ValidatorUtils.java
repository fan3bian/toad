package util;


import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Created by zhangshuyi1 on 2018/1/18.
 */
public class ValidatorUtils {
	 public static final String GOODS_NO_REGEX = "^CMG[0-9]{9,13}";
	 public static final String SO_NO_REGEX = "^CSL[0-9]{9,15}";
    /**
     * null ' '
     * 字符串格式校验
     * @param regex
     * @param target
     * @return
     */
    public static boolean validateCharSequence(String regex, CharSequence target) {
        return StringUtils.isNotBlank(target) && Pattern.compile(regex).matcher(target).matches();
    }

    public static void main(String[] args) {
//        boolean numeric = StringUtils.isNumeric("5");
//        Objects.requireNonNull(null,"null happens here");
    	
    	System.out.println(validateCharSequence(SO_NO_REGEX,"CSL13214139537988"));
    }
    
}
