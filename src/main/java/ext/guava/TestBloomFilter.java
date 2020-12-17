package ext.guava;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;

public class TestBloomFilter {
    public static void main(String[] args) {
        BloomFilter<CharSequence> bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charset.forName("utf-8")), 100000000, 0.0001);
        bloomFilter.put("死");
        bloomFilter.put("磕");
        bloomFilter.put("Redis");

        System.out.println(bloomFilter.mightContain("Redis"));
        System.out.println(bloomFilter.mightContain("Java"));
    }
}
