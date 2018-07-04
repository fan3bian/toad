package expection;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TstException {
    @Test
    public void test(){
        try {
            try {
                setDept("de");
            } catch (Exception e) {
               throw  new RuntimeException(e);
            }
        } catch (Exception e) {
//            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }
    }
    private void  setDept(String deptNo) throws IOException{
        if(deptNo == null)
            throw new IllegalArgumentException("illegal param");
        new FileInputStream(new File("a,txt"));
    }
}
