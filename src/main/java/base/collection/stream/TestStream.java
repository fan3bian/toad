package base.collection.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<String> items = new ArrayList<String>();

        items.add("one");
        items.add("two");
        items.add("three");

        Stream<String> stream = items.stream();
        //Configuration
        stream.filter(item -> item.startsWith("o"));
        items.stream().map(t -> t.toUpperCase());
        //Processing
        List<String> filtered = items.stream()
                .filter( item -> item.startsWith("o") )
                .collect(Collectors.toList());
        System.out.println(filtered);
        String shortest = items.stream()
                .min(Comparator.comparing(item -> item.length()))
                .get();
        long count = items.stream()
                .filter( item -> item.startsWith("t"))
                .count();
        String reduced2 = items.stream()
                .reduce((acc, item) -> acc + " " + item)
                .get();
        System.out.println(count);
        System.out.println(reduced2);
    }
}
