package expection;

import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class TestException {

    @Test
    public void test(){
        Charset cs ;
    }
    @Test
    public void testReadFile() throws IOException {
        File file = new File("D:\\edit\\a");
        StringBuilder sb = new StringBuilder();
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            int available = is.available();
            System.out.println("available is ["+available+"]");
            byte b[] = new byte [5];
            int len ,a;
           while ((len = is.read(b))!=-1){
                   /*((a = is.read())!= -1){
               sb.append(a);*/
               System.out.println(len);
           }
            System.out.println(sb.toString());
        }finally {
            is.close();
        }

    }
}
