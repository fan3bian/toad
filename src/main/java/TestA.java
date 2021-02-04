import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {

    public static void main(String[] args) {


        String[] all = {

        };
        String[] split ={
        };

        List<String> dbs = Arrays.asList(split);
        List<String> unContains = Arrays.stream(all).filter(x -> !dbs.contains(x)).collect(Collectors.toList());
//        List<String> contains = Arrays.stream(all).filter(x -> dbs.contains(x)).collect(Collectors.toList());
        System.out.println(unContains);
//        System.out.println(collect.size());
    }

    @Test
    public void test() {
        String[] a = {

        };
        String[] b = {

        };

        List<String> aList = Arrays.asList(a);
        List<String> bList = Arrays.asList(b);
        HashSet<String> strings = new HashSet<>();
        List<String> unContains = bList.stream().filter(x -> !aList.contains(x)).collect(Collectors.toList());
        System.out.println(unContains.size());
        System.out.println("--\n");
        List<String> contains = bList.stream().filter(x -> aList.contains(x)).collect(Collectors.toList());
        System.out.println(contains);

    }
}
