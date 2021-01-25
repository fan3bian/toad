import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {

    public static void main(String[] args) {


        String[] all = {
                "KDJJH700002101220014","KDJJH700002101220016","KDJJH700002101220017","KDJJH700002101220010","KDJJH700002101220012","KDJJH700002101220004","KDJJH700002101220005","KDJJH900002101220006","KDJJH700002101220008","KDJJH700002101220013","KDJJH700002101220009","KDJJH700002101220015","KDJJH700002101220007","KDJJH700002101220011","KDJJH700002101220053","LSJH700002101220055","KDJJH700002101220054","PPJH700002101220142","KDJJH700002101230007","SDJJH900002101230012","SDJJH900002101230036","V70000210123030","PPJH700002101230105","XYTJH700002101230059"
        };
        String[] split ={
                "KDJJH700002101220012","KDJJH700002101220013","KDJJH700002101220014","KDJJH700002101220016","KDJJH700002101220008","KDJJH700002101220010","KDJJH700002101220017","KDJJH700002101220054","KDJJH700002101220007","KDJJH700002101230007","KDJJH700002101220009","KDJJH700002101220011","KDJJH700002101220015","KDJJH700002101220053","PPJH700002101220142","LSJH700002101220055","V70000210123030","SDJJH900002101230036","PPJH700002101230105","XYTJH700002101230059"
        };

        List<String> dbs = Arrays.asList(split);
        List<String> unContains = Arrays.stream(all).filter(x -> !dbs.contains(x)).collect(Collectors.toList());
//        List<String> contains = Arrays.stream(all).filter(x -> dbs.contains(x)).collect(Collectors.toList());
        System.out.println(unContains);
//        System.out.println(collect.size());
    }

    @Test
    public void test() {
        String[] a = {};
        String[] b = {};
        List<String> aList = Arrays.asList(a);
        List<String> bList = Arrays.asList(b);
        HashSet<String> strings = new HashSet<>();
        strings.addAll(aList);
        strings.addAll(bList);
        System.out.println(strings);


    }
}
