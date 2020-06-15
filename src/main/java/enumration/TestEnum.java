package enumration;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestEnum {
    public static void main(String[] args) {
        Student student = new Student();
        List<String> list1 = Arrays.asList("1", "2", "3");
        student.setList(list1);
        List<String> temList = list1;
        for (String str : temList) {
            System.out.println(temList.size());
        }


        String targets = ",,,,";
        String[] arr = targets.split(",");
        System.out.println(arr[1]);
    }

    @Test
    public void test() {
        Integer a = 1;
        Byte b = 1;
        System.out.println(a.equals(b));
    }

    @Test
    public void test2() throws Exception {

    }

    @Test
    public void test3() throws Exception {

    }
}
		