package test;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;
import util.JsonUtil;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangshuyi1 on 2018/7/4.
 */
public class TestJson {
    public static void main(String[] args) {
        String jsonStro = "{\n" +
                "  \"id\": 4398046521552,\n" +
                "  \"soNo\": \"CSL4398046521552\",\n" +
                "  \"isvSoNo\": \"05362024481731\",\n" +
                "  \"soSource\": 1,\n" +
                "  \"isvSource\": \"ISV0000000000036\",\n" +
                "  \"isvSourceName\": \"京东到家\",\n" +
                "  \"spId\": 24,\n" +
                "  \"spName\": \"京东到家\",\n" +
                "  \"bdSpNo\": \"0030001\",\n" +
                "  \"spCreateTime\": \"2018-03-07 12:02:20\",\n" +
                "  \"sellerId\": 29,\n" +
                "  \"sellerNo\": \"CCP0000000000029\",\n" +
                "  \"sellerName\": \"sellerTangWei\",\n" +
                "  \"pinAccount\": \"jinpincode\",\n" +
                "  \"deptId\": 4398046511175,\n" +
                "  \"deptNo\": \"CBU4398046511175\",\n" +
                "  \"deptName\": \"deptnew0001\",\n" +
                "  \"shopId\": 30,\n" +
                "  \"shopNo\": \"CSP0000000000030\",\n" +
                "  \"shopName\": \"0531店铺\",\n" +
                "  \"wayBill\": \"VA00041091610\",\n" +
                "  \"stationNo\": \"39\",\n" +
                "  \"stationName\": \"▲石景山站\",\n" +
                "  \"sortingRoad\": \"0\",\n" +
                "  \"warehouseId\": 60,\n" +
                "  \"warehouseNo\": \"800000060\",\n" +
                "  \"warehouseName\": \"J-WMS-TW03\",\n" +
                "  \"distributionNo\": \"23\",\n" +
                "  \"orgNo\": \"34\",\n" +
                "  \"erpWarehouseNo\": \"45\",\n" +
                "  \"shipperId\": 1,\n" +
                "  \"shipperNo\": \"CYS0000010\",\n" +
                "  \"shipperName\": \"京东配送\",\n" +
                "  \"expectDate\": \"2018-08-10 21:05:27\",\n" +
                "  \"consignee\": \"张三\",\n" +
                "  \"consigneeAddr\": \"北京朝阳区三环以内33333\",\n" +
                "  \"addrProvince\": \"北京\",\n" +
                "  \"addrCity\": \"朝阳区\",\n" +
                "  \"addrCounty\": \"三环以内\",\n" +
                "  \"consigneeMobile\": \"14333432345\",\n" +
                "  \"afterSalesName\": \"金0531\",\n" +
                "  \"afterSalesMobile\": \"13566778877\",\n" +
                "  \"afterSalesAddr\": \"北京朝阳区三环以内\",\n" +
                "  \"soStatus\": 10019,\n" +
                "  \"transType\": 1,\n" +
                "  \"bdOwnerNo\": \"010K100125\",\n" +
                "  \"soSplitFlag\": 0,\n" +
                "  \"receivable\": 100.0,\n" +
                "  \"guaranteeValue\": 0.0,\n" +
                "  \"createTime\": \"2018-08-10 21:00:51\",\n" +
                "  \"updateTime\": \"2018-08-10 21:51:01\",\n" +
                "  \"updateUser\": \"system_status4pop\",\n" +
                "  \"soMark\": \"00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\n" +
                "  \"soWeight\": \"38.080\",\n" +
                "  \"soItemParamList\": [\n" +
                "    {\n" +
                "      \"id\": 10040293,\n" +
                "      \"soId\": 4398046521552,\n" +
                "      \"shopGoodsId\": 4398046511383,\n" +
                "      \"shopGoodsNo\": \"CSG4398046511383\",\n" +
                "      \"shopGoodsName\": \"0601商品1\",\n" +
                "      \"goodsId\": 4398046511484,\n" +
                "      \"goodsNo\": \"CMG4398046511484\",\n" +
                "      \"goodsName\": \"0601商品1\",\n" +
                "      \"spGoodsNo\": \"0601商品1\",\n" +
                "      \"sellerGoodsSign\": \"0601商品1\",\n" +
                "      \"applyOutstoreQty\": 56.0000,\n" +
                "      \"realOutstoreQty\": 56.0000,\n" +
                "      \"goodsStatus\": 1,\n" +
                "      \"price\": 16.0,\n" +
                "      \"deptId\": 4398046511175,\n" +
                "      \"createTime\": \"2018-08-10 21:00:51\",\n" +
                "      \"updateTime\": \"2018-08-10 21:51:01\",\n" +
                "      \"yn\": 0,\n" +
                "      \"isvGoodsNo\": \"0601商品1\",\n" +
                "      \"soGoodsWeight\": \"38.080\",\n" +
                "      \"goodsLevel\": \"100\",\n" +
                "      \"orderLine\": \"1\",\n" +
                "      \"assignedChangeNum\": 0.0000,\n" +
                "      \"uomCode\": \"件\",\n" +
                "      \"uomQty\": 1,\n" +
                "      \"applyOutPackageQty\": 56.0000,\n" +
                "      \"realOutPackageQty\": 56.0000,\n" +
                "      \"priority\": 1,\n" +
                "      \"fourPLMailNo\": \"VA00041091610\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"soType\": 1,\n" +
                "  \"gid\": 1,\n" +
                "  \"soVolume\": \"596288.000\",\n" +
                "  \"giftType\": 0,\n" +
                "  \"freshStockCache\": 0,\n" +
                "  \"againPack\": 0,\n" +
                "  \"isColdChain\": 1,\n" +
                "  \"boxNos\": [\n" +
                "    \"CP0000018A000384\",\n" +
                "    \"CP0000018A000385\"\n" +
                "  ],\n" +
                "  \"operator\": \"userPartnerTangWei\"\n" +
                "}";

    }

    @Test
    public void test2() throws IOException {
        String s = "[\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"orderid\": \"86501100640\",\n" +
                "      \"productId\": \"3167073\",\n" +
                "      \"extTagsMap\": {},\n" +
                "      \"quantity\": 5,\n" +
                "      \"price\": 3.10,\n" +
                "      \"productName\": \"orion 好丽友 蛋黄派 2枚 46g/盒\",\n" +
                "      \"serialId\": 1,\n" +
                "      \"isVMI\": 0,\n" +
                "      \"mobileStoreId\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"orderid\": \"86501100640\",\n" +
                "      \"productId\": \"7785700\",\n" +
                "      \"extTagsMap\": {},\n" +
                "      \"quantity\": 1,\n" +
                "      \"price\": 42.00,\n" +
                "      \"productName\": \"彩虹糖 迷你桶 30g*12桶/单盒装\",\n" +
                "      \"serialId\": 2,\n" +
                "      \"isVMI\": 0,\n" +
                "      \"mobileStoreId\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"orderid\": \"86501100640\",\n" +
                "      \"productId\": \"7785718\",\n" +
                "      \"extTagsMap\": {},\n" +
                "      \"quantity\": 1,\n" +
                "      \"price\": 22.00,\n" +
                "      \"productName\": \"绿箭 口香糖 原味薄荷味 5片15g*20条/单盒装\",\n" +
                "      \"serialId\": 3,\n" +
                "      \"isVMI\": 0,\n" +
                "      \"mobileStoreId\": null\n" +
                "    }\n" +
                "  ]";
        List<Map<String, Object>> itemMapList = JsonUtil.fromJson(s, new TypeReference<List<Map<String, Object>>>(){});
//        List<Object> itemMapList = JsonUtil.fromJson(s, new TypeReference<List<Object>>() {
//        });
        Map<String, Map<String, Object>> objectMapImmutableMap = Maps.uniqueIndex(itemMapList, new Function<Map<String, Object>, String>() {
            @Override
            public String apply(Map<String, Object> stringObjectMap) {
                return (String)stringObjectMap.get("productId");
            }
        });
        for (Map.Entry<String, Map<String, Object>> stringMapEntry : objectMapImmutableMap.entrySet()) {
            stringMapEntry.getValue().put("shortName","hah");
        }
        System.out.println(JsonUtil.toJson(itemMapList));

    }
}
