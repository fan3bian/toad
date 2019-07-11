package util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;


/**
 * Created by zhangshuyi1 on 2018/3/24.
 */
public class ErrorUtil {
    private ErrorUtil() {}
    public static void ifNull(Object target,String message){
        if(target == null) throw new IllegalArgumentException(message+"["+target+"]为null");
    }
    public static void ifBlank(String target,String message){
        if(StringUtils.isBlank(target)) throw new IllegalArgumentException(message+"["+target+"]为空");
    }
    public static void ifSizeEmpty(final Object o, String message){
        ifNull(o,message);
        if(CollectionUtils.sizeIsEmpty(o)) throw new IllegalArgumentException(message+"["+o+"]为空");
    }
    public static void ifInValid(String regex,String target,String message){
        if(!ValidatorUtil.validateCharSequence(regex,target)) throw new IllegalArgumentException(message+"["+target+"]不合法");
    }

    public static void main(String[] args) {
        ifInValid(RegexConstant.DOUBLE,"-10.00002","温度");
//        ErrorUtil.ifSizeEmpty(null,"hh");
    }
}
