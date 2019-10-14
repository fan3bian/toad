package algorithm.some;

import org.apache.commons.text.StrBuilder;
import org.junit.Test;

public class ReverseString {
    @Test
    public void test(){
        String s = "quao";
        String rs = new StrBuilder(s).reverse().append("1").toString();
        System.out.println(rs);
    }
    
    public void reverse(String input){
        input.toCharArray();
    }
}
