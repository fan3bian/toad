package ext.json;

import com.alibaba.fastjson.JSONObject;

public class FastJsonTest {
    public static void main(String[] args) {
        String msg = "{\n" +
                "    \"code\":\"200\",\n" +
                "    \"msg\":\"成功\",\n" +
                "    \"data\":{\n" +
                "        \"receiptsPerformNo\":\"SCIN48597630466205\",\n" +
                "        \"status\":4000,\n" +
                "        \"receiptsPerformItemDtoList\":[\n" +
                "            {\n" +
                "                \"lineNo\":\"1\",\n" +
                "                \"goodsLevel\":\"100\",\n" +
                "                \"realBackQty\":5,\n" +
                "                \"batchDtoList\":[\n" +
                "                    {\n" +
                "                        \"batchNo\":\"56781625da0b7893b9db5a27cae6be44\",\n" +
                "                        \"backQty\":2,\n" +
                "                        \"lotAttrStr\":\"expiredate=2030-07-30;lot=2030073001;madedate=2020-08-01\",\n" +
                "                        \"goodsLevel\":\"100\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"batchNo\":\"178d43331b748320c51da074029fac7f\",\n" +
                "                        \"backQty\":3,\n" +
                "                        \"lotAttrStr\":\"expiredate=2030-08-30;lot=2030083001;madedate=2020-09-01\",\n" +
                "                        \"goodsLevel\":\"100\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {   \n" +
                "\t\"lineNo\":\"2\",\n" +
                "                \"goodsLevel\":\"100\",\n" +
                "                \"realBackQty\":5,\n" +
                "                \"batchDtoList\":[\n" +
                "                    {\n" +
                "                        \"batchNo\":\"56781625da0b7893b9db5a27cae6be44\",\n" +
                "                        \"backQty\":2,\n" +
                "                        \"lotAttrStr\":\"expiredate=2030-07-30;lot=2030073001;madedate=2020-08-01\",\n" +
                "                        \"goodsLevel\":\"100\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"batchNo\":\"178d43331b748320c51da074029fac7f\",\n" +
                "                        \"backQty\":3,\n" +
                "                        \"lotAttrStr\":\"expiredate=2030-08-30;lot=2030083001;madedate=2020-09-01\",\n" +
                "                        \"goodsLevel\":\"100\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"completeTime\":1599474938000\n" +
                "    }\n" +
                "}";
        JSONObject json= (JSONObject) JSONObject.parse(msg);

    }
}
