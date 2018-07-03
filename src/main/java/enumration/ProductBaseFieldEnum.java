//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package enumration;

public enum ProductBaseFieldEnum {
    SKU_ID("0", "skuId"),
    NAME("1", "name"),
    IS_DELELTE("4", "isDelete"),
    STATE("3", "state"),
    BAR_CODE("21", "barCode"),
    ERP_PID("22", "erpPid"),
    COLOR("23", "color"),
    COLOR_SEQUENCE("24", "colorSequence"),
    SIZE("25", "size"),
    SIZE_SEQUENCE("26", "sizeSequence"),
    UPC("31", "upc"),
    BACKUPSTR("43", "backupstr"),
    TAXINFO("44", "taxInfo"),
    CREATED("49", "created"),
    SKU_MARK("51", "skuMark"),
    SALE_DATE("15", "saleDate"),
    CID2("27", "cid2"),
    VALUE_WEIGHT("10", "valueWeight"),
    WEIGHT("6", "weight"),
    PRODUCT_AREA("14", "productArea"),
    WSERVE("16", "wserve"),
    SHANG_JIA("12", "shangJia"),
    SALER("18", "saler"),
    SHANGG("17", "shangg"),
    ALLNUM("19", "allnum"),
    MAX_PURCH_QTY("13", "maxPurchQty"),
    BRAND_ID("20", "brandId"),
    VALUE_PAY_FIRST("11", "valuePayFirst"),
    LENGTH("7", "length"),
    WIDTH("8", "width"),
    HEIGHT("9", "height"),
    VENDER_TYPE("41", "venderType"),
    VENDER_ID("39", "venderId"),
    PNAME("32", "pname"),
    ISSN("35", "issn"),
    BUYER("45", "buyer"),
    SAFE_DAYS("46", "safeDays"),
    SALE_UNIT("47", "saleUnit"),
    PACK_SPECIFICATION("48", "packSpecification"),
    CATEGORY("36", "category"),
    SHOP_CATEGORYS("50", "shopCategorys"),
    PHONE("33", "phone"),
    SITE("34", "site"),
    EBRAND("28", "ebrand"),
    CBRAND("29", "cbrand"),
    MODEL("30", "model"),
    IMAGE_PATH("2", "imagePath"),
    VENDER_NAME("40", "venderName"),
    SHOP_ID("37", "shopId"),
    SHOP_NAME("38", "shopName"),
    POP_PID("42", "popPid"),
    SPEC("52", "spec"),
    SPEC_NAME("53", "specName"),
    SPEC_SEQUENCE("54", "specSequence"),
    BUYER_POST("55", "buyerPost"),
    /** @deprecated */
    @Deprecated
    IS_FLASHPURCHASE("95", "isFlashPurchase"),
    /** @deprecated */
    @Deprecated
    IS_JIT("114", "isJIT"),
    /** @deprecated */
    @Deprecated
    IS_OVERSEAPURCHASE("111", "isOverseaPurchase"),
    /** @deprecated */
    @Deprecated
    IS_EBAY("120", "isEbay"),
    VENDER_COLTYPE("56", "venderColType"),
    PLATFORM("57", "platform"),
    TIMELINESSID("58", "timelinessId"),
    SALE_ATTS("59", "saleAtts"),
    PURCHASING_CONTROLLER("60", "purchasingController"),
    REGIONAL_BUYER("61", "regionalBuyer");

    private String field;
    private String desc;

    private ProductBaseFieldEnum(String field, String desc) {
        this.field = field;
        this.desc = desc;
    }

    public String getField() {
        return this.field;
    }

    public String getDesc() {
        return this.desc;
    }
}
