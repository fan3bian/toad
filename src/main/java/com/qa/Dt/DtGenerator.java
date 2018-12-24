package com.qa.Dt;

import com.google.gson.reflect.TypeToken;
import com.jd.clps.common.util.JsonUtil;

import java.util.Map;

public class DtGenerator {
    public static Dt createDt(){
        Dt dt = new Dt();
        Dt.Sources sources = new Dt.Sources();
        Dt.Mapper mapper = new Dt.Mapper();
        Dt.Mapper.Target target = new Dt.Mapper.Target();
        Dt.Sources.Source source = new Dt.Sources.Source();
        target.setFormat("json");
        source.setAlias("sourceMap");
        source.setFormat("json");
        mapper.setTarget(target);
        dt.setMapper(mapper);
        sources.setSource(source);
        dt.setSources(sources);
        return dt;
    }

    static void bulidDt(Map<String, Object> map, StringBuffer sb){
        Dt dt = createDt();

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Dt.Attr attr =new Dt.Attr();
            attr.setName(entry.getKey());
            dt.addAttr(attr);
//            if (entry.getValue() instanceof String){
//
//            }else if(entry.getValue() instanceof Integer){
//
//            }else if(entry.getValue() instanceof List){
//
//            }else if(entry.getValue() instanceof Map){
//
//            }
        }
        System.out.println(XmlUtil.generateXmlTaskContent(dt));
    }

    public static void main(String[] args) {
        String msgBody = "{\"id\":20032237702,\"wbNo\":\"CYD000000200&  32237702\",\"soNo\":\"CSL4418090946538\",\"partnerNo\":\"CP20000000010\",\"partnerName\":\"\",\"warehouseNo\":\"800000160\",\"warehouseName\":\"重庆揽智云仓1号库\",\"deptNo\":\"CBU4418046511780\",\"deptName\":\"广东粤通天下科技有限公司\",\"sendProvinceNo\":\"500000\",\"sendProvinceName\":\"重庆\",\"sendCityNo\":\"500100\",\"sendCityName\":\"重庆市\",\"sendCountyNo\":\"500113\",\"sendCountyName\":\"巴南区\",\"sendTownNo\":\"500113009\",\"sendTownName\":\"南彭街道\",\"sendAddress\":\"物流基地环道东路18号9号标准厂房\",\"senderName\":\"张家平\",\"senderMobile\":\"13594698861\",\"receiveProvinceNo\":\"530000\",\"receiveProvinceName\":\"云南省\",\"receiveCityNo\":\"530100\",\"receiveCityName\":\"昆明市\",\"receiveCountyNo\":\"530112\",\"receiveCountyName\":\"西山区\",\"receiveTownNo\":\"530112004\",\"receiveTownName\":\"永昌街道\",\"receiveAddress\":\"云南省昆明市官渡区俊发螺蛳湾二期八区四楼8街4132\",\"receiverName\":\"陈静娜\",\"receiveMobile\":\"18388188293\",\"citizenship\":\"\",\"soType\":1,\"soTypeStr\":\"B2C\",\"bizType\":4,\"shipperPartnerNo\":\"\",\"shipperPartnerName\":\"\",\"shipperNo\":\"CYF4398046511115\",\"shipperName\":\"申通快递\",\"sendPay\":\"00002000900000000000000000000000000000000000000000\",\"status\":1000,\"statusStr\":\"未配载\",\"transType\":1,\"transTypeStr\":\"陆运\",\"soCreateTime\":\"2018-12-22 21:00:15\",\"guaranteeValue\":0.0,\"premium\":0.0,\"grossWeight\":4.400,\"grossVolume\":15732000.000,\"actualWeight\":4.400,\"actualVolume\":15732000.000,\"packageQty\":1,\"collectionValue\":0.0,\"createTime\":\"2018-12-22 21:00:15\",\"updateTime\":\"2018-12-22 21:00:15\",\"isDelete\":1,\"version\":0,\"reserve2\":\"C-201812221420005\",\"test\":0,\"wbItemList\":[{\"packageNo\t\":\"\",\"goodsNo\":\"CMG4418047032270\",\"goodsName\":\"东方喜炮吉祥红 新版52度 浓香型白酒\",\"qty\":4,\"qtyUnit\":\"件\",\"weight\":4.400,\"createTime\":\"2018-12-22 21:00:15\",\"isDelete\":0,\"version\":0,\"test\":0,\"uomCode\":\"件\",\"uomQty\":1,\"applyOutPackageQty\":4}],\"taskPart\":\"4398066692326_3988207\t\",\"deptId\":4418046511780,\"sellerId\":20000000528,\"sellerNo\":\"CCP0020000000528\",\"sellerName\":\"广东粤通天下科技有限公司\",\"deliveryType\":1,\"bdSpNo\":\"0030001\",\"coldChainType\":1,\"isGuarantee\":0,\"wbType\":1}";
        Map<String, Object> objectMap = JsonUtil.fromJsonByGoogle(msgBody,new TypeToken<Map<String, Object>>(){});
        bulidDt(objectMap,new StringBuffer());
//        Dt dt = createDt();
//        System.out.println(XmlUtil.toXmlByJaxb(dt));
//        System.out.println(XmlUtil.generateXmlTaskContent(dt));
        System.out.println(objectMap.get("a").getClass());
    }

}
