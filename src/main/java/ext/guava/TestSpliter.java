package ext.guava;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.List;

public class TestSpliter {

    @Test
    public void test(){
//        List<String> strings = Splitter.on('?').splitToList("");
//        List<String> strings = Splitter.on('?').splitToList(null);
//        List<String> strings = Splitter.on('?').splitToList("?");
//        List<String> strings = Splitter.on('?').trimResults().splitToList(" ? ?    ");
//        System.out.println(strings);
        System.out.println(splitScanCode("?2342"));
        System.out.println(splitScanCode("2342"));
        System.out.println(splitScanCode("2342?"));
        System.out.println(splitScanCode("2342??"));
        System.out.println(splitScanCode("2342??ws"));
    }

    public static String splitScanCode(String s){
        if (StringUtils.isBlank(s)) {
            return s;
        }
        List<String> strings = Splitter.on('?').trimResults().splitToList(s);
        if (!strings.isEmpty()) {
            return strings.get(strings.size() -1);
        }
        return s;
    }
}
