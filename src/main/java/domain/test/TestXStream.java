package domain.test;

import com.thoughtworks.xstream.XStream;

/**
 * Created by zhangshuyi1 on 2018/7/4.
 */
public class TestXStream {
    private volatile static XStream b2cXStream = null;
    protected static XStream getXStreamNewInstance() {
        if (b2cXStream == null) {
//            synchronized (AbstractSoMaterialService.class) {
                if (b2cXStream == null) {
                    b2cXStream = new XStream();
                    b2cXStream.ignoreUnknownElements();
                    b2cXStream.autodetectAnnotations(true);
                    b2cXStream.alias("DeliveryBatch", DeliveryBatch.class);
                    b2cXStream.alias("Waybill", Waybill.class);
                    b2cXStream.alias("waybillDetail", WaybillDetail.class);
                    b2cXStream.alias("goodsMaterial", GoodsMaterial.class);
                    b2cXStream.alias("OutBound", OutBound.class);
                    b2cXStream.alias("Sku", OutBoundSku.class);
                    b2cXStream.alias("response", WmsSoCancelResult.class);
//                    b2cXStream.addImplicitArray(List.class,"boxList");
                    b2cXStream.alias("boxNo", String.class);
            }
        }
        return b2cXStream;
    }
    public static void main(String[] args) {
        String str = "<DeliveryBatch><outBoundList><OutBound><skuList><Sku><uomCode/><goodsGrade>100</goodsGrade><vmiFlag/><isPackageOut>0</isPackageOut><uomName/><packageNo/><skuId>CMG4418046556333</skuId><skuNum>1</skuNum></Sku></skuList><outboundType/><outboundNo>CSL4418049348029</outboundNo></OutBound></outBoundList><batchNo>BSC718070300001</batchNo><deliveryTime>2018-07-03 08:08:45</deliveryTime><soWeight>1.0000</soWeight><soNo>CSL4418049348029</soNo><distributeNo></distributeNo><source>JWMS</source><deliveryList><Waybill><senderAddress><![CDATA[常州]]></senderAddress><signReturn/><outboundNo>CSL4418049348029</outboundNo><packageWeight/><county>3906</county><senderName>方跃</senderName><receiveName>马燕</receiveName><senderPostcode/><province>24</province><packageRequired/><packageTime>2018-07-03 08:08:45</packageTime><packageUser>耀镁照明仓库01</packageUser><goodsMaterialName/><guaranteeValueAmount/><town/><receiveAddress><![CDATA[贵州贵阳市南明区城区王家桥中天世纪新城四组团B4栋2单元]]></receiveAddress><postcode/><waybillDetailList><waybillDetail><skuId>CMG4418046556333</skuId><skuNum>1</skuNum></waybillDetail></waybillDetailList><customerName/><packageVolume/><transType/><fourPLMailNo>VB45442300153</fourPLMailNo><goodsMaterialList></goodsMaterialList><receiveTel>13639098347</receiveTel><materialOBusinessType/><selfPrintWayBill>1</selfPrintWayBill><vloumLong/><city>2144</city><description/><remark/><senderTel>13962161567</senderTel><packageNo>VB45442300153-1-1-<![CDATA[&]]>null<![CDATA[&]]>null<![CDATA[｜]]>null</packageNo><pickMethod/><siteNo/><packageSequence/><customerId/><collectionValue/><receiveMobile>13639098347</receiveMobile><guaranteeValue/><senderMobile>13962161567</senderMobile><salePlat>0030001</salePlat><collectionMoney/><vloumHeight/><vloumWidth/><aging/><materialOwnerType/><packageCount>1</packageCount><goodsMaterialNo/><waybillNo>VB45442300153<![CDATA[&]]>null</waybillNo></Waybill></deliveryList><partnerNo>CP20000000016</partnerNo><deliveryUserName>耀镁照明仓库01</deliveryUserName><orgNo></orgNo><deliveryUserNo></deliveryUserNo><warehouseBusinessType>0</warehouseBusinessType><carrierNo>CYS0000010</carrierNo><clpsWarehouseNo>800000155</clpsWarehouseNo><soVolume>25000.0000</soVolume><againPack>NO</againPack></DeliveryBatch>";
//        String str2 = "";
        String str2 = "<DeliveryBatch><outBoundList><OutBound><skuList><Sku><uomCode/><goodsGrade>100</goodsGrade><vmiFlag/><isPackageOut>0</isPackageOut><uomName/><packageNo/><skuId>CMG4398046533369</skuId><skuNum>1</skuNum></Sku></skuList><outboundType/><outboundNo>CSL4418049235350</outboundNo></OutBound></outBoundList><operator>操作人</operator><batchNo>BS2V18070200001</batchNo><deliveryTime>2018-07-02 09:00:25</deliveryTime><soWeight>0.1000</soWeight><soNo>CSL4418049235350</soNo><distributeNo/><source>JWMS</source><deliveryList><Waybill><receiveTel>18777801513</receiveTel><materialOBusinessType/><selfPrintWayBill>1</selfPrintWayBill><senderAddress><![CDATA[怀源]]></senderAddress><signReturn/><vloumLong/><city>1818</city><outboundNo>CSL4418049235350</outboundNo><packageWeight/><county>2991</county><description/><remark/><senderTel/><packageNo>VB43958172274-1-1-<![CDATA[&]]>null<![CDATA[&]]>null<![CDATA[｜]]>null</packageNo><pickMethod/><senderName>梅道龙</senderName><receiveName>廖菲</receiveName><senderPostcode/><siteNo/><province>20</province><packageSequence/><packageRequired/><customerId/><collectionValue/><packageTime>2018-07-02 09:00:25</packageTime><packageUser>mei1412955862</packageUser><receiveMobile>18777801513</receiveMobile><goodsMaterialName/><guaranteeValueAmount/><town/><receiveAddress><![CDATA[广西河池市罗城县东门镇矿务局廉租房8栋二单元]]></receiveAddress><guaranteeValue/><postcode/><senderMobile/><waybillDetailList><waybillDetail><skuId>CMG4398046533369</skuId><skuNum>1</skuNum></waybillDetail></waybillDetailList><customerName/><packageVolume/><salePlat>0030001</salePlat><transType/><collectionMoney/><vloumHeight/><fourPLMailNo>VB43958172274</fourPLMailNo><vloumWidth/><aging/><materialOwnerType/><packageCount>1</packageCount><goodsMaterialNo/><waybillNo>VB43958172274<![CDATA[&]]>null</waybillNo></Waybill></deliveryList><partnerNo>CP0000086</partnerNo><deliveryUserName>mei1412955862</deliveryUserName><orgNo/><deliveryUserNo/><warehouseBusinessType>0</warehouseBusinessType><carrierNo>CYS0000010</carrierNo><clpsWarehouseNo>800000098</clpsWarehouseNo><soVolume>1352000.0000</soVolume><againPack>NO</againPack><boxList><boxNo>box1</boxNo><boxNo>box2</boxNo><boxNo>box3</boxNo></boxList><zhagn></zhagn></DeliveryBatch>";
        DeliveryBatch  deliveryBatch = (DeliveryBatch) getXStreamNewInstance().fromXML(str2);
    }
}
