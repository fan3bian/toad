package domain.test;

/**
 * 包裹明细
 * Created by guoqingyun on 2017/3/26.
 */
public class WaybillDetail {
    private static final long serialVersionUID = 1L;
    /** 商品编号 */
    private String skuId;
    /** 商品数量 */
    private Integer skuNum;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }
}
