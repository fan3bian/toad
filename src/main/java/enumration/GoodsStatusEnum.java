package enumration;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by guoqingyun on 2016/12/2.
 */
public enum GoodsStatusEnum {
    LP_GOODS_STATUS(Byte.valueOf("1"), "良品"),
    CP_GOODS_STATUS(Byte.valueOf("2"), "残品"),
    ZP_GOODS_STATUS(Byte.valueOf("4"), "脏品"),
    DJD_GOODS_STATUS(Byte.valueOf("6"), "待鉴定");

    private Byte goodsStatus;
    private String goodsStatusName;
    private GoodsStatusEnum(Byte goodsStatus,String value) {
        this.goodsStatus=goodsStatus;
        this.goodsStatusName=value;
    }
    public static final Map<Byte, String> enumMap = new HashMap<Byte, String>();

    static {
        for (GoodsStatusEnum e : EnumSet.allOf(GoodsStatusEnum.class)) {
            enumMap.put(e.goodsStatus, e.goodsStatusName);
        }
    }
    public static String valueOf(Byte goodsStatus){
        for (GoodsStatusEnum  goodsStatusEnum : GoodsStatusEnum.values()) {
            if (goodsStatusEnum.getGoodsStatus().equals(goodsStatus)) {
                return goodsStatusEnum.getGoodsStatusName();
            }
        }
        return "未维护该商品状态";
    }

    public Byte getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Byte goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsStatusName() {
        return goodsStatusName;
    }

    public void setGoodsStatusName(String goodsStatusName) {
        this.goodsStatusName = goodsStatusName;
    }
}
