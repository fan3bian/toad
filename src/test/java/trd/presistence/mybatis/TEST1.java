package trd.presistence.mybatis;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Multimaps;

import javax.annotation.Nullable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TEST1 {
    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("-1");
        System.out.println(bigDecimal.negate());
        List<String> normalPoItemWmsList =new ArrayList<>();
        normalPoItemWmsList.add("1");
        normalPoItemWmsList.add("1");

        ImmutableListMultimap<String, String> normalMap = Multimaps.index(normalPoItemWmsList.iterator(), new Function<String, String>() {
            @Nullable
            @Override
            public String apply(@Nullable String poItemWms) {
                return poItemWms;
//                return poItemWms.getOrderLine() + "_" + poItemWms.getGoodsNo();
            }
        });
        System.out.println(normalMap);
    }
}
