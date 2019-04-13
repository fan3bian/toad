package generic;

import com.google.common.base.Splitter;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

public class CustomerFunctions {
    public static void mergeItems(List<Map<String, Object>> odOrderDetailList, Map<String, Object> var2, String orderid) {
//        var1.get("")
//        Map<String, Map<String, Object>> itemMap = Maps.uniqueIndex(odOrderDetailList, new Function<Map<String, Object>, String>() {
//            @Override
//            public String apply(Map<String, Object> tmp) {
//                return (String) tmp.get("orderid"); // or something else
//            }
//        });

        List<Map<String, Object>> list = (List<Map<String, Object>>) var2.get("content");
        if (CollectionUtils.isNotEmpty(list)) {
            Map<String, Object> orderRel = list.get(0);
            String relationStr = (String) orderRel.get("relations");
            if (StringUtils.isNotBlank(relationStr)) {
                List<String> relations = Splitter.on(",").splitToList(relationStr);
                for (String relation : relations) {
                    if (orderid.equals(orderRel.get(relation + "-orderNo"))) {
                        List<Map<String, Object>> subOrderPrintItems = (List<Map<String, Object>>) var2.get(relation);
                        for (Map<String, Object> printItem : subOrderPrintItems) {
                            for (Map<String, Object> itemMap : odOrderDetailList) {
                                if (itemMap.get("productId").equals(printItem.get("goodsId"))) {
                                    itemMap.put("dta", printItem.get("dta"));
                                    itemMap.put("discountPrice", printItem.get("discountPrice"));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static String syaHello(String str){
        return str;
    }

}
