import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestA {

    public static void main(String[] args) {


        String[] all = {
        };
        String[] split ={
        };

        List<String> dbs = Arrays.asList(split);
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(all));
        set.removeAll(Arrays.asList(dbs));
        //[FLD_WL_BH, WG1664619063, WG1664619065, WG1664619066, WG1664619067, WG1664619068, WG1664619069, WG1664619070, WG1664879056, WG1664879058, WG9716582245, WG1664249015, WG1664190191, WG1664119581, WG1664119058, WG1664119057, WG1664119027, WG1664119026, WG1664119022, WG1664119021, WG1664112063]
        System.out.println(set);

//        List<String> unContains = Arrays.stream(all).filter(x -> !dbs.contains(x)).collect(Collectors.toList());
//        List<String> contains = Arrays.stream(all).filter(x -> dbs.contains(x)).collect(Collectors.toList());
//        System.out.println(all.length);
//        System.out.println(split.length);
//        System.out.println(unContains);
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
