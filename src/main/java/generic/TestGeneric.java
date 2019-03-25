package generic;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.*;

public class TestGeneric {
    @Test
    public void test() {
        Stack s =new Stack();
        Comparable c = null;
        Collections collection =null;
    }
    @Test
    public void test2() throws NoSuchMethodException {
        Method declaredMethod = CustomerFunctions.class.getDeclaredMethod("syaHello",String.class);
        Method method2 = CustomerFunctions.class.getDeclaredMethod("mergeItems", List.class, Map.class,String.class);
//        declaredMethod.invoke()

    }
}
