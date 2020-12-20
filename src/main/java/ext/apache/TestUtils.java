package ext.apache;

import org.junit.Test;

import java.util.Arrays;

public class TestUtils {
    @Test
    public void testCollections(){
        String[] strArr= null;
        System.out.println(strArr instanceof String[]);
        System.out.println(strArr instanceof Object[]);
        String[] strArrE= new String[10];
        System.out.println(Arrays.toString(strArrE));
        System.out.println(strArrE instanceof String[]);
        System.out.println(strArrE instanceof Object[]);

    }
}
