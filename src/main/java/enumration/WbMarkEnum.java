package enumration;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * 标准版sendpay
 */
public enum WbMarkEnum {
    //第1位:是否签收短信回执
    IS_Receipt_SMS_0(1,'0',"否", "signReceiptFlag"),
    IS_Receipt_SMS_1(1,'1',"是", "signReceiptFlag"),

    //第2位:是否派件短信回执
    IS_delivery_SMS_0(2,'0',"否", "deliveryReceiptFlag"),
    IS_delivery_SMS_1(2,'1',"是", "deliveryReceiptFlag"),

    //第3位:是否送货入仓
    IS_Ware_delivery_0(3,'0',"否", "sendToWarehouse"),
    IS_Ware_delivery_1(3,'1',"是", "sendToWarehouse"),

    //第4位:1.  仅装车 2.仅卸车 3.装+卸 标记位为0标识不传
    IS_load_1(4,'1',"仅装车", "loadingType"),
    IS_load_2(4,'2',"仅卸车", "loadingType"),
    IS_load_3(4,'3',"装+卸", "loadingType"),
    IS_load_0(4,'0',"", ""),
    transproduct_type_1(5,'1',"整车","transProductType"),
    transproduct_type_2(5,'2',"纯配快运零担","transProductType"),
    transproduct_type_3(5,'3',"仓配零担","transProductType"),
    transproduct_type_4(5,'4',"冷链整车","transProductType"),
    transproduct_type_5(5,'5',"冷链纯配零担","transProductType"),
    transproduct_type_6(5,'6',"TC零担","transProductType"),
    transproduct_type_0(5,'0',"",""),
    sign_return_0(6,'0',"不返单","signReturnType"),
    sign_return_1(6,'1',"普通返单","signReturnType"),
    sign_return_2(6,'2',"校验身份返单","signReturnType"),
    //第5位:是否卸货
//    IS_unload_0(5,'0',"否", "unloadFlag"),
//    IS_unload_1(5,'1',"是", "unloadFlag"),


//    //第6位:是否签收回执单
//    IS_receipt_bill_0(6,'0',"否", "receiptFlag"),
//    IS_receipt_bill_1(6,'1',"是", "receiptFlag"),


    //第7位:是否运费到付
    IS_fc_0(7,'0',"月结", "fcFlag"),
    IS_fc_1(7,'1',"运费到付", "fcFlag"),
    IS_fc_2(7,'2',"运费现付", "fcFlag"),

    //第8位：支付方式
    pay_type_0(8, '0', "在线支付", "payType"),
    pay_type_1(8, '1', "货到付款", "payType"),
    //第九位
    DELIVERY_TYPE_SIGN_0(9, '0', "不需要城配", "deliveryType"),
    DELIVERY_TYPE_SIGN_1(9, '1', "需要城配", "deliveryType"),
    DELIVERY_TYPE_SIGN_9(9, '9', "优先使用城配，可以使用快递", "deliveryType"),
    //第十位 温层
    COLD_CHAIN_TYPE_6(10,'6',"温控","coldChainType"),
    COLD_CHAIN_TYPE_7(10,'7',"冷藏","coldChainType"),
    COLD_CHAIN_TYPE_8(10,'8',"冷冻","coldChainType"),
    COLD_CHAIN_TYPE_9(10,'9',"深冷","coldChainType"),
    COLD_CHAIN_TYPE_1(10,'0',"",""),
    //十一位 隔离运输
    ISOLATE_TYPE_1(11,'1',"清真","goodsIsolateType"),
    ISOLATE_TYPE_2(11,'2',"易污染","goodsIsolateType"),
    ISOLATE_TYPE_3(11,'3',"清真、易污染","goodsIsolateType"),
    ISOLATE_TYPE_0(11,'0',"",""),

    //TC对接
    CO_JDWARETYPE_0(15,'0',"默认客户地址","jdWareType"),
    CO_JDWARETYPE_1(15,'1',"京东自营仓","jdWareType"),
    CO_JDWARETYPE_2(15,'2',"开放平台仓","jdWareType"),

    /*CO_TRANSTYPE_0(16,'0',"默认运输方式","transType"),
    CO_TRANSTYPE_1(16,'1',"公路零担","transType"),
    CO_TRANSTYPE_2(16,'2',"公路整车","transType"),*/

    CO_TC_0(17,'0',"非TC","isTc"),
    CO_TC_1(17,'1',"TC","isTc"),

    CO_JDWAREACTION_TYPE_0(18,'0',"默认","jdWareActionType"),
    CO_JDWAREACTION_TYPE_1(18,'1',"送货入京仓","jdWareActionType"),
    CO_JDWAREACTION_TYPE_2(18,'2',"退供出京仓","jdWareActionType"),

    TC_TO_CLPS_0(19,'0',"否","tcToClps"),
    TC_TO_CLPS_1(19,'1',"是","tcToClps"),
            ;
    public static final Map<Integer,WbMarkEnum> WB_MARK_ENUM_MAP = new HashMap<Integer, WbMarkEnum>();
    private final String name;
    private final char key;
    private final int index;
    private final String fieldName;

    static {
        for(WbMarkEnum e: EnumSet.allOf(WbMarkEnum.class)){
            WB_MARK_ENUM_MAP.put(e.getCode(),e);
        }
    }

    private WbMarkEnum(int index, char key, String name, String fieldName) {
        this.index = index;
        this.name = name;
        this.key = key;
        this.fieldName = fieldName;
    }

    public int getIndex() {
        return this.index;
    }

    public Enum getSelf() {
        return this;
    }

    public Integer getCode() {
        return Integer.valueOf(Integer.parseInt(this.index + "" + this.key));
    }

    public char getKey() {
        return this.key;
    }

    public String getDesc() {
        return this.name;
    }

    public String getFieldName() {
        return fieldName;
    }
}
