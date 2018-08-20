package domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * saf对外接口入参
 * 销售订单明细
 *
 * @author douhuatong
 * @org clps.jd.com
 * @Date 2014-08-06 下午 09:27:51
 */
public class SoItemParam {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 订单主键
     */
    private Long soId;

    /**
     * 店铺商品ID
     */
    private Long shopGoodsId;

    /**
     * 店铺商品编号
     */
    private String shopGoodsNo;

    /**
     * 店铺商品名称
     */
    private String shopGoodsName;

    /**
     * 主商品ID
     */
    private Long goodsId;

    /**
     * 主商品编号
     */
    private String goodsNo;

    /**
     * 主商品名称
     */
    private String goodsName;

    /**
     * 销售平台商品编码
     */
    private String spGoodsNo;

    /**
     * 商家商品标识
     */
    private String sellerGoodsSign;

    /**
     * 下单数量
     */
    private BigDecimal applyOutstoreQty;

    /**
     * 实际发货数量
     */
    private BigDecimal realOutstoreQty;

    /**
     * 商品状态（1:良品,2:残品,3:样品)
     */
    private Byte goodsStatus;

    /**
     * 商品单价
     */
    private Double price;

    /**
     * 事业部ID(不做查询使用，作为分表依据)
     */
    private Long deptId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 删除标志
     */
    private byte yn;


    /**
     * ISV商品编号
     */
    private String isvGoodsNo;
    /**
     * 订单商品重量
     */
    private String soGoodsWeight;


    /**
     * 商品等级名称，用于页面显示
     */
    private String goodsStatusName;

    /**
     * 事业部商品下单数量
     */
    private BigDecimal deptApplyOutQty;

    /**
     * 事业部商品实际发货数量
     */
    private BigDecimal deptRealOutQty;

    /**
     * 商品等级
     */
    private String goodsLevel;

    /**
     * 是否保价商品
     */
    private Byte insurePriceFlag;

    private Double insurePrice;

    /**
     * 打印名称
     */
    private String printName;

    /**
     * 批次号 batchNo
     */
    private String batchNo;
    /**
     * 产品到期日期
     */
    private String expirationDate;
    /**
     * 产品生产日期
     */
    private String productionDate;

    /**
     * 行号
     */
    private String orderLine;

    /**
     * 新组套添加,店铺库存预占变化量
     */
    private BigDecimal occupyChangeNum;

    /**
     * 新组套添加,分配给独占套餐数量变化量
     */
    private BigDecimal assignedChangeNum;

    /**
     * 商品金额
     */
    private Double goodsAmount;

    /**
     * 创维商品单价
     */
    private Double skyWorthPrice;
    /**
     * 创维明细单号
     */
    private String skyWorthDetailNo;

    /**
     * 安装公司
     */
    private String installCompany;

    /**
     * B2B城配订单 体积
     */
    private String volume;

    /**
     * 配套ID
     */
    private String suitId;

    /**
     * CLPS包装编码
     */
    private String packageNo;

    /**
     * 外部包装编码
     */
    private String outPackageNo;

    /**
     * 包装单位编码
     */
    private String uomCode;
    /**
     * 包装单位名称
     */
    private String uomName;
    /**
     * 包装换算数量
     */
    private Integer uomQty;
    /**
     * 计划出库包装数量
     */
    private BigDecimal applyOutPackageQty;

    /**
     * 实际发货包装数量
     */
    private BigDecimal realOutPackageQty;

    private Integer priority;

    /**
     * 虚拟组套商品编码
     */
    private String virtualSuiteGoodsNo;

    /**
     * 虚拟组套商品名称
     */
    private String virtualSuiteGoodsName;

    /**
     * 虚拟组套商品购买数量
     */
    private Integer virtualSuiteGoodsQty;
    /**
     * 三方运单号
     *
     * @return
     */
    private String fourPLMailNo;

    public String getSoGoodsWeight() {
        return soGoodsWeight;
    }

    public void setSoGoodsWeight(String soGoodsWeight) {
        this.soGoodsWeight = soGoodsWeight;
    }

    public String getIsvGoodsNo() {
        return isvGoodsNo;
    }

    public void setIsvGoodsNo(String isvGoodsNo) {
        this.isvGoodsNo = isvGoodsNo;
    }

    public String getSellerGoodsSign() {
        return sellerGoodsSign;
    }

    public void setSellerGoodsSign(String sellerGoodsSign) {
        this.sellerGoodsSign = sellerGoodsSign;
    }

    public Long getShopGoodsId() {
        return shopGoodsId;
    }

    public void setShopGoodsId(Long shopGoodsId) {
        this.shopGoodsId = shopGoodsId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the soId
     */
    public Long getSoId() {
        return soId;
    }

    /**
     * @param soId the soId to set
     */
    public void setSoId(Long soId) {
        this.soId = soId;
    }

    /**
     * @return the shopGoodsNo
     */
    public String getShopGoodsNo() {
        return shopGoodsNo;
    }

    /**
     * @param shopGoodsNo the shopGoodsNo to set
     */
    public void setShopGoodsNo(String shopGoodsNo) {
        this.shopGoodsNo = shopGoodsNo;
    }

    /**
     * @return the shopGoodsName
     */
    public String getShopGoodsName() {
        return shopGoodsName;
    }

    /**
     * @param shopGoodsName the shopGoodsName to set
     */
    public void setShopGoodsName(String shopGoodsName) {
        this.shopGoodsName = shopGoodsName;
    }

    /**
     * @return the goodsId
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * @param goodsId the goodsId to set
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * @return the goodsName
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * @param goodsName the goodsName to set
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * @return the spGoodsNo
     */
    public String getSpGoodsNo() {
        return spGoodsNo;
    }

    /**
     * @param spGoodsNo the spGoodsNo to set
     */
    public void setSpGoodsNo(String spGoodsNo) {
        this.spGoodsNo = spGoodsNo;
    }

    /**
     * @return the applyOutstoreQty
     */
    public BigDecimal getApplyOutstoreQty() {
        return applyOutstoreQty;
    }

    /**
     * @param applyOutstoreQty the applyOutstoreQty to set
     */
    public void setApplyOutstoreQty(BigDecimal applyOutstoreQty) {
        this.applyOutstoreQty = applyOutstoreQty;
    }

    /**
     * @return the realOutstoreQty
     */
    public BigDecimal getRealOutstoreQty() {
        return realOutstoreQty;
    }

    /**
     * @param realOutstoreQty the realOutstoreQty to set
     */
    public void setRealOutstoreQty(BigDecimal realOutstoreQty) {
        this.realOutstoreQty = realOutstoreQty;
    }

    /**
     * @return the goodsStatus
     */
    public Byte getGoodsStatus() {
        return goodsStatus;
    }

    /**
     * @param goodsStatus the goodsStatus  to set
     */
    public void setGoodsStatus(Byte goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    /**
     * @return the createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return the updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return the createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser the createUser to set
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * @return the updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * @return the yn
     */
    public byte getYn() {
        return yn;
    }

    /**
     * @param yn the yn to set
     */
    public void setYn(byte yn) {
        this.yn = yn;
    }

    public String getGoodsStatusName() {
        return goodsStatusName;
    }

    public void setGoodsStatusName(String goodsStatusName) {
        this.goodsStatusName = goodsStatusName;
    }

    public BigDecimal getDeptApplyOutQty() {
        return deptApplyOutQty;
    }

    public void setDeptApplyOutQty(BigDecimal deptApplyOutQty) {
        this.deptApplyOutQty = deptApplyOutQty;
    }

    public BigDecimal getDeptRealOutQty() {
        return deptRealOutQty;
    }

    public void setDeptRealOutQty(BigDecimal deptRealOutQty) {
        this.deptRealOutQty = deptRealOutQty;
    }

    public String getGoodsLevel() {
        return goodsLevel;
    }

    public void setGoodsLevel(String goodsLevel) {
        this.goodsLevel = goodsLevel;
    }

    public Byte getInsurePriceFlag() {
        return insurePriceFlag;
    }

    public void setInsurePriceFlag(Byte insurePriceFlag) {
        this.insurePriceFlag = insurePriceFlag;
    }

    public Double getInsurePrice() {
        return insurePrice;
    }

    public void setInsurePrice(Double insurePrice) {
        this.insurePrice = insurePrice;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(String orderLine) {
        this.orderLine = orderLine;
    }

    public BigDecimal getOccupyChangeNum() {
        return occupyChangeNum;
    }

    public void setOccupyChangeNum(BigDecimal occupyChangeNum) {
        this.occupyChangeNum = occupyChangeNum;
    }

    public BigDecimal getAssignedChangeNum() {
        return assignedChangeNum;
    }

    public void setAssignedChangeNum(BigDecimal assignedChangeNum) {
        this.assignedChangeNum = assignedChangeNum;
    }

    public Double getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Double goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Double getSkyWorthPrice() {
        return skyWorthPrice;
    }

    public void setSkyWorthPrice(Double skyWorthPrice) {
        this.skyWorthPrice = skyWorthPrice;
    }

    public String getSkyWorthDetailNo() {
        return skyWorthDetailNo;
    }

    public void setSkyWorthDetailNo(String skyWorthDetailNo) {
        this.skyWorthDetailNo = skyWorthDetailNo;
    }

    public String getInstallCompany() {
        return installCompany;
    }

    public void setInstallCompany(String installCompany) {
        this.installCompany = installCompany;
    }

    public String getSuitId() {
        return suitId;
    }

    public void setSuitId(String suitId) {
        this.suitId = suitId;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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

    public BigDecimal getApplyOutPackageQty() {
        return applyOutPackageQty;
    }

    public void setApplyOutPackageQty(BigDecimal applyOutPackageQty) {
        this.applyOutPackageQty = applyOutPackageQty;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public BigDecimal getRealOutPackageQty() {
        return realOutPackageQty;
    }

    public void setRealOutPackageQty(BigDecimal realOutPackageQty) {
        this.realOutPackageQty = realOutPackageQty;
    }

    public String getOutPackageNo() {
        return outPackageNo;
    }

    public void setOutPackageNo(String outPackageNo) {
        this.outPackageNo = outPackageNo;
    }

    public String getVirtualSuiteGoodsNo() {
        return virtualSuiteGoodsNo;
    }

    public void setVirtualSuiteGoodsNo(String virtualSuiteGoodsNo) {
        this.virtualSuiteGoodsNo = virtualSuiteGoodsNo;
    }

    public String getVirtualSuiteGoodsName() {
        return virtualSuiteGoodsName;
    }

    public void setVirtualSuiteGoodsName(String virtualSuiteGoodsName) {
        this.virtualSuiteGoodsName = virtualSuiteGoodsName;
    }

    public Integer getVirtualSuiteGoodsQty() {
        return virtualSuiteGoodsQty;
    }

    public void setVirtualSuiteGoodsQty(Integer virtualSuiteGoodsQty) {
        this.virtualSuiteGoodsQty = virtualSuiteGoodsQty;
    }

    public String getFourPLMailNo() {
        return fourPLMailNo;
    }

    public void setFourPLMailNo(String fourPLMailNo) {
        this.fourPLMailNo = fourPLMailNo;
    }
}