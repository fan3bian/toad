package ext.apache;

import io.serial.Person;
import org.apache.logging.log4j.util.Strings;
import org.apache.lucene.util.RamUsageEstimator;
import org.junit.Test;

import java.math.BigDecimal;

public class TestObjectSize {
    @Test
    public void test1(){
        //_klass -XX:+UseCompressedOops 4 -XX:-UseCompressedOops 8
        Object o = new Object();//markword:8 + pointer:4 + padding:4 = 16
        Byte b = Byte.MAX_VALUE;//12 + 1 + padding = 16
        Character c = Character.MAX_VALUE;//12 + 2 + padding = 16
        Integer i = Integer.MAX_VALUE;//12 + 4 = 16
        Long l = Long.MAX_VALUE;//12 + 8 + padding = 24
        Double d = Double.MAX_VALUE;//12 + 8 + padding = 24
        BigDecimal bd= BigDecimal.TEN;
        char[] arr = new char[10];//12 + 4(arr) + 2 * 10 + padding = 40
        String s = "abc";//12 + 4(hash int) + 4(value ref) + padding = 24 char[]:12 + 4(arr)+ 3* 2(char) + padding= 24
//        sout(o);
//        sout(b);
//        sout(c);
//        sout(i);
//        sout(l);
//        sout(d);
//        sout(bd);
//        sout(s);
//        sout(arr);
        Person1 person1= new Person1();
        sout(person1);
    }
    private void sout(Object o){
//        System.out.println(RamUsageEstimator.sizeOf(o));
        System.out.println(RamUsageEstimator.shallowSizeOf(o) + " " + RamUsageEstimator.humanSizeOf(o) );
    }
}
