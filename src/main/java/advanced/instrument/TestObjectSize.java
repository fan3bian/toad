package advanced.instrument;

import org.junit.Test;

public class TestObjectSize {

    @Test
    public void test() {
        int i = 1;
        System.out.println(ObjectSizeFetcher.getObjectSize(i));
        System.out.println(ObjectSizeFetcher.getObjectSize(new Integer(1)));
    }
}
