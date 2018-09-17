package base;

import domain.Student;
import org.junit.Test;

import java.util.Objects;

/**
 * Created by zhangshuyi1 on 2018/9/16.
 */
public class TestMethod {

    @Test
    public void test(){
//        BigInteger bi =new BigInteger();
        Student s = new Student();
        Student s1 = Objects.requireNonNull(s, "s");
        System.out.println( s==s1);

        try {
            a(null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
    private void a(String s){
        System.out.println(Objects.requireNonNull(s,"null in invalid"));
        assert (s !=null);
    }

}
