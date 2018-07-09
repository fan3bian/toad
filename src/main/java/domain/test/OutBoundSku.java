package domain.test;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;

/**
 * 发货数据回传-订单明细-商品明细
 * User: douhuatong
 * Date: 14-8-18
 * Time: 下午6:02
 */
@XStreamAlias("Sku")
public class OutBoundSku implements Serializable {

    private static final long serialVersionUID = 1L;
    /** 商品编号 */
    private String skuId;
    /** 商品数量 */
    private Integer skuNum;
    private String batchNo;

    /**
     * vmi标识：1-vmi商品，0-非vmi商品
     */
    private String vmiFlag;

    /**
     * 商品等级
     */
    private String goodsGrade;

    /**
     * CLPS包装规格编码
     */
    private String packageNo;
    /**
     * 包装单位编码
     */
    private String uomCode;

    /**
     * 包装单位名称
     */
    private String uomName;
    /**
     * 包装单位转化数量
     */
    private Integer uomQty;
    /**
     *  行号
     */
    private String lineNo;


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

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    public String getVmiFlag() {
        return vmiFlag;
    }

    public void setVmiFlag(String vmiFlag) {
        this.vmiFlag = vmiFlag;
    }

    public String getGoodsGrade() {
        return goodsGrade;
    }

    public void setGoodsGrade(String goodsGrade) {
        this.goodsGrade = goodsGrade;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public String getUomCode() {
        return uomCode;
    }

    public void setUomCode(String uomCode) {
        this.uomCode = uomCode;
    }

    public String getUomName() {
        return uomName;
    }

    public void setUomName(String uomName) {
        this.uomName = uomName;
    }

    public Integer getUomQty() {
        return uomQty;
    }

    public void setUomQty(Integer uomQty) {
        this.uomQty = uomQty;
    }

    public String getLineNo() {
        return lineNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }
}
