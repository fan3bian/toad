//package domain;
//
//import com.jd.clps.bbp.so.domain.SoSerialNo;
//import com.jd.clps.common.base.BaseEntity;
//
//import java.util.Date;
//import java.util.List;
//
///**
// * saf对外接口参数
// * 订单数据
// * User: douhuatong
// * Date: 14-8-7
// * Time: 下午4:57
// */
//public class SoMainParam  {
//    /**
//     *
//     */
//    private static final long serialVersionUID = 1L;
//
//    /** 主键 */
//    private Long id;
//
//    /** 父单id */
//    private Long parentId;
//
//    /** CLPS订单编号 */
//    private String soNo;
//
//    /** ISV出库单号 */
//    private String isvSoNo;
//
//    /** 销售平台单号 */
//    private String spSoNo;
//
//    /** 订单来源（1:ISV，2:POP） */
//    private Byte soSource;
//
//
//    /** ISV来源编号 */
//    private String isvSource;
//
//    /** ISV来源名称 */
//    private String isvSourceName;
//
//    /** 销售平台ID */
//    private Long spId;
//
//    /** 销售平台编号 */
//    private String spNo;
//
//    /** 销售平台来源（京东/天猫/苏宁/亚马逊/ChinaSkin/其它） */
//    private String spName;
//
//    /** 青龙销售平台编号 */
//    private String bdSpNo;
//
//    /** 销售平台下单时间 */
//    private Date spCreateTime;
//
//    /** 商家Id */
//    private Long sellerId;
//
//    /** 商家编号 */
//    private String sellerNo;
//
//    /** 商家名称 */
//    private String sellerName;
//
//
//    /** 在销售平台的下单帐号 */
//    private String pinAccount;
//
//    /** 商家留言（最多支持125个字） */
//    private String sellerRemark;
//
//    /** 事业部Id */
//    private Long deptId;
//
//    /** 事业部编号 */
//    private String deptNo;
//
//    /** 事业部名称 */
//    private String deptName;
//
//    /** 店铺Id */
//    private Long shopId;
//
//    /** 店铺编号 */
//    private String shopNo;
//
//    /** 店铺名称 */
//    private String shopName;
//
//    /** ISV店铺编号 */
//    private String isvShopNo;
//
//    /** 运单 */
//    private String wayBill;
//
//    /** 站点编号 */
//    private String stationNo;
//
//    /** 站点名称 */
//    private String stationName;
//
//    /** 路区 */
//    private String sortingRoad;
//
//    public String getSortingRoad() {
//        return sortingRoad;
//    }
//
//    public void setSortingRoad(String sortingRoad) {
//        this.sortingRoad = sortingRoad;
//    }
//
//    /** 库房Id */
//    private Long warehouseId;
//
//    /** 库房No */
//    private String warehouseNo;
//
//    /** 库房名称 */
//    private String warehouseName;
//
//    /** 配送中心编号(外部) */
//    private String distributionNo;
//
//    /** 机构编号（外部） */
//    private String orgNo;
//
//    /** 库房编号（外部） */
//    private String erpWarehouseNo;
//
//    /** 承运商ID(目前默认青龙) */
//    private Long shipperId;
//
//
//    /** 承运商编号（目前默认青龙） */
//    private String shipperNo;
//
//    /** 承运商名称（目前默认青龙） */
//    private String shipperName;
//
//    /** 期望送货时间 */
//    private Date expectDate;
//
//    /** 收货人（最大支持25个汉字） */
//    private String consignee;
//
//    /** 收货人地址（最大支持125个汉字） */
//    private String consigneeAddr;
//
//    /** 收货地址-省 */
//    private String addrProvince;
//
//    /** 收货地址-市 */
//    private String addrCity;
//
//    /** 收货地址-县 */
//    private String addrCounty;
//
//    /** 收货地址-镇 */
//    private String addrTown;
//
//    /** 收货人邮政编码 */
//    private String consigneePostcode;
//
//    /** 收货人手机 */
//    private String consigneeMobile;
//
//    /** 收货人电话(收件人电话、手机至少有一个不为空) */
//    private String consigneePhone;
//
//    /** 收货人邮箱 */
//    private String consigneeEmail;
//
//    /** 买家留言 */
//    private String consigneeRemark;
//
//    /** 退货收货人姓名 */
//    private String afterSalesName;
//
//    /** 退货收货联系方式 */
//    private String afterSalesMobile;
//
//    /** 退货收货地址 */
//    private String afterSalesAddr;
//
//    /** 订单生产状态 */
//    private Integer soStatus;
//
//    /** 运输类型(陆运：1，航空：2。不填或者超出范围时，默认是1) */
//    private Byte transType;
//
//
//    /** 青龙业主号 */
//    private String bdOwnerNo;
//
//
//    /** 拆单标志（0:未拆单，1:已拆单） */
//    private Byte soSplitFlag;
//
//    /** 应收金额（货到付款必填） */
//    private Double receivable;
//
//    /** 保价金额（需要报价金额必填） */
//    private Double guaranteeValue;
//
//    /** 创建时间 */
//    private Date createTime;
//
//    /** 更新时间 */
//    private Date updateTime;
//
//    /** 创建人 */
//    private String createUser;
//
//    /** 更新人 */
//    private String updateUser;
//
//
//    /**
//     * 订单异常状态（取消，无法生产，无法分拣，无法发货）
//     * 该字段请采用<code>SoErrStatusUtil</code>解析
//     * 异常状态1：0:是否取消，1:取消成功/失败
//     * 异常状态2：2:是否有异常暂停，3:暂停处理/暂停恢复
//     * 异常状态3：4:是否审核，5:审核通过/审核驳回
//     */
//    private String soErrStatus;
//
//
//    /**
//     * 订单标记位:50位的数字串：
//     * 第1位：0表示在线支付，1代表货到付款, 不填或者超出范围，默认是0
//     * 第2位：0表示青龙配送，1表示需要第三方配送（由青龙转交），2表示商家自主配送（去库房自提）
//     * 第3位：是否保价(是：1，否：0，默认是0)
//     * 第4位：签单返还(是：1，否：0。不填或者超出范围时，默认是0
//     * 第5位：送货时效(普通：1，工作日：2，非工作日：3，晚间：4。不填或者超出范围时，默认是1
//     * 第6位：包装要求(不需包装：1，简单包装：2，特殊包装：3。不填或者超出范围，默认是1)
//     * 第10位：订单类型(B2C:0,B2B:1,C2B:2,OTHER:3，默认是0)
//     * 第49位：1代表闪购订单，
//     * 第50位：1代表POP下发的仓储服务订单
//     * 该字段请采用<code>SoMarkUtil</code>解析
//     * 枚举类型参考<code>SoMarkEnum</code>
//     */
//    private String soMark;
//
//    /** 分拣中心编号 */
//    private String sortingCenterNo;
//
//    /** 分拣中心名称 */
//    private String sortingCenterName;
//
//    /** 京东sendpay */
//    private String sendPay;
//    /** 订单总重量 */
//    private String soWeight;
//
//    /** 订单详细数据 */
//    private List<SoItemParam> soItemParamList;
//
//    /** 订单包裹数据明细 */
//    private List<SoPackParam> soPackParamList;
//
//    /** 订单异常 */
//    private List<SoExceptionParam> soExceptionParamList;
//
//    /** 订单批次明细 */
//    private List<SoItemBatchParam> soItemBatchParamList;
//
//    /** 订单类型
//     * 与ordermark字段第10位相同，但标记加1存储(B2C:1,B2B2C:2,C2B:3,OTHER:4)//C2B原为3
//     * */
//    private Byte soType;
//
//    /**
//     * 三方站点（大头笔）
//     */
//    private String soThirdSite;
//
//    public String getClientNo() {
//        return clientNo;
//    }
//
//    public void setClientNo(String clientNo) {
//        this.clientNo = clientNo;
//    }
//
//    public String getClientName() {
//        return clientName;
//    }
//
//    public void setClientName(String clientName) {
//        this.clientName = clientName;
//    }
//
//    /** 货主编码 */
//    private String clientNo;
//
//    /** 货主名称 */
//    private String clientName;
//
//    /** 三方二期订单包裹签信息 */
//    private SoExtendParam soExtendParam;
//
//    /** 李宁B2C添加 */
//    /** 用户账号 */
//    private String userName;
//
//    /** 用户昵称 */
//    private String userNickName;
//
//    /** 运单备注 */
//    private String waybillRemark;
//
//    /** hybris单号 */
//    private String hybris;
//
//    /** 发货工厂编号 */
//    private String sellerFactoryNo;
//
//    /** 发货工厂名称 */
//    private String sellerFactoryName;
//
//    /**
//     * 运费（大件运费）
//     */
//    private Double yunFee;
//
//    /**
//     * 折扣（大件折扣）
//     */
//    private Double discount;
//
//    private Integer errType;
//
//    /**
//     * 分库标识
//     */
//    private Long gid;
//
//
//    /**
//     *保价规则明细
//     */
//    private String insuredPriceRule;
//
//    /** 件型： 1：小件 12： 大件**/
//    private Byte pieceType;
//
//    /**订单总体积**/
//    private String soVolume;
//
//    /**
//     * CLPS实物库房ID
//     */
//    private Long targetWarehouseId;
//
//    /**
//     * 批量号
//     */
//    private String batchNo;
//
//    /**
//     * 批量订单数
//     */
//    private Integer batchQty;
//
//    /**
//     * 业务来源(腾讯)
//     */
//    private Byte transactionSource;
//
//    /**
//     * 序列号信息集合
//     */
//    private List<SoSerialNo> soSerialNoList;
//
//
//    public Double getYunFee() {
//        return yunFee;
//    }
//
//    public void setYunFee(Double yunFee) {
//        this.yunFee = yunFee;
//    }
//
//    public Double getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(Double discount) {
//        this.discount = discount;
//    }
//
//    public String getSoWeight() {
//        return soWeight;
//    }
//
//    public void setSoWeight(String soWeight) {
//        this.soWeight = soWeight;
//    }
//
//    public Byte getSoType() {
//        return soType;
//    }
//
//    public void setSoType(Byte soType) {
//        this.soType = soType;
//    }
//
//    public String getSendPay() {
//        return sendPay;
//    }
//
//    public void setSendPay(String sendPay) {
//        this.sendPay = sendPay;
//    }
//
//    public String getIsvSource() {
//        return isvSource;
//    }
//
//    public void setIsvSource(String isvSource) {
//        this.isvSource = isvSource;
//    }
//
//    public String getIsvSourceName() {
//        return isvSourceName;
//    }
//
//    public void setIsvSourceName(String isvSourceName) {
//        this.isvSourceName = isvSourceName;
//    }
//
//    public String getSortingCenterNo() {
//        return sortingCenterNo;
//    }
//
//    public void setSortingCenterNo(String sortingCenterNo) {
//        this.sortingCenterNo = sortingCenterNo;
//    }
//
//    public String getSortingCenterName() {
//        return sortingCenterName;
//    }
//
//    public void setSortingCenterName(String sortingCenterName) {
//        this.sortingCenterName = sortingCenterName;
//    }
//
//    public List<SoPackParam> getSoPackParamList() {
//        return soPackParamList;
//    }
//
//    public void setSoPackParamList(List<SoPackParam> soPackParamList) {
//        this.soPackParamList = soPackParamList;
//    }
//
//    public String getErpWarehouseNo() {
//        return erpWarehouseNo;
//    }
//
//    public void setErpWarehouseNo(String erpWarehouseNo) {
//        this.erpWarehouseNo = erpWarehouseNo;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getParentId() {
//        return parentId;
//    }
//
//    public String getPinAccount() {
//        return pinAccount;
//    }
//
//    public void setPinAccount(String pinAccount) {
//        this.pinAccount = pinAccount;
//    }
//
//    public void setParentId(Long parentId) {
//        this.parentId = parentId;
//    }
//
//    public String getShipperNo() {
//        return shipperNo;
//    }
//
//    public void setShipperNo(String shipperNo) {
//        this.shipperNo = shipperNo;
//    }
//
//    public String getBdOwnerNo() {
//        return bdOwnerNo;
//    }
//
//    public void setBdOwnerNo(String bdOwnerNo) {
//        this.bdOwnerNo = bdOwnerNo;
//    }
//
//    public String getSoNo() {
//        return soNo;
//    }
//
//    public void setSoNo(String soNo) {
//        this.soNo = soNo;
//    }
//
//    public String getIsvSoNo() {
//        return isvSoNo;
//    }
//
//    public void setIsvSoNo(String isvSoNo) {
//        this.isvSoNo = isvSoNo;
//    }
//
//    public String getSpSoNo() {
//        return spSoNo;
//    }
//
//    public void setSpSoNo(String spSoNo) {
//        this.spSoNo = spSoNo;
//    }
//
//    public Byte getSoSource() {
//        return soSource;
//    }
//
//    public void setSoSource(Byte soSource) {
//        this.soSource = soSource;
//    }
//
//
//    public Long getSpId() {
//        return spId;
//    }
//
//    public void setSpId(Long spId) {
//        this.spId = spId;
//    }
//
//    public String getSpNo() {
//        return spNo;
//    }
//
//    public void setSpNo(String spNo) {
//        this.spNo = spNo;
//    }
//
//    public String getSpName() {
//        return spName;
//    }
//
//    public void setSpName(String spName) {
//        this.spName = spName;
//    }
//
//    public String getBdSpNo() {
//        return bdSpNo;
//    }
//
//    public void setBdSpNo(String bdSpNo) {
//        this.bdSpNo = bdSpNo;
//    }
//
//    public String getSellerNo() {
//        return sellerNo;
//    }
//
//    public void setSellerNo(String sellerNo) {
//        this.sellerNo = sellerNo;
//    }
//
//    public String getDeptNo() {
//        return deptNo;
//    }
//
//    public void setDeptNo(String deptNo) {
//        this.deptNo = deptNo;
//    }
//
//    public String getShopNo() {
//        return shopNo;
//    }
//
//    public void setShopNo(String shopNo) {
//        this.shopNo = shopNo;
//    }
//
//    public Date getSpCreateTime() {
//        return spCreateTime;
//    }
//
//    public void setSpCreateTime(Date spCreateTime) {
//        this.spCreateTime = spCreateTime;
//    }
//
//    public Long getSellerId() {
//        return sellerId;
//    }
//
//    public void setSellerId(Long sellerId) {
//        this.sellerId = sellerId;
//    }
//
//    public String getSellerName() {
//        return sellerName;
//    }
//
//    public void setSellerName(String sellerName) {
//        this.sellerName = sellerName;
//    }
//
//    public String getSellerRemark() {
//        return sellerRemark;
//    }
//
//    public void setSellerRemark(String sellerRemark) {
//        this.sellerRemark = sellerRemark;
//    }
//
//    public Long getDeptId() {
//        return deptId;
//    }
//
//    public void setDeptId(Long deptId) {
//        this.deptId = deptId;
//    }
//
//    public String getDeptName() {
//        return deptName;
//    }
//
//    public void setDeptName(String deptName) {
//        this.deptName = deptName;
//    }
//
//    public Long getShopId() {
//        return shopId;
//    }
//
//    public void setShopId(Long shopId) {
//        this.shopId = shopId;
//    }
//
//    public String getShopName() {
//        return shopName;
//    }
//
//    public void setShopName(String shopName) {
//        this.shopName = shopName;
//    }
//
//    public String getIsvShopNo() {
//        return isvShopNo;
//    }
//
//    public void setIsvShopNo(String isvShopNo) {
//        this.isvShopNo = isvShopNo;
//    }
//
//    public String getWayBill() {
//        return wayBill;
//    }
//
//    public void setWayBill(String wayBill) {
//        this.wayBill = wayBill;
//    }
//
//    public String getStationNo() {
//        return stationNo;
//    }
//
//    public void setStationNo(String stationNo) {
//        this.stationNo = stationNo;
//    }
//
//    public String getStationName() {
//        return stationName;
//    }
//
//    public void setStationName(String stationName) {
//        this.stationName = stationName;
//    }
//
//    public Long getWarehouseId() {
//        return warehouseId;
//    }
//
//    public void setWarehouseId(Long warehouseId) {
//        this.warehouseId = warehouseId;
//    }
//
//    public String getWarehouseNo() {
//        return warehouseNo;
//    }
//
//    public void setWarehouseNo(String warehouseNo) {
//        this.warehouseNo = warehouseNo;
//    }
//
//    public String getWarehouseName() {
//        return warehouseName;
//    }
//
//    public void setWarehouseName(String warehouseName) {
//        this.warehouseName = warehouseName;
//    }
//
//    public String getDistributionNo() {
//        return distributionNo;
//    }
//
//    public void setDistributionNo(String distributionNo) {
//        this.distributionNo = distributionNo;
//    }
//
//    public String getOrgNo() {
//        return orgNo;
//    }
//
//    public void setOrgNo(String orgNo) {
//        this.orgNo = orgNo;
//    }
//
//    public Long getShipperId() {
//        return shipperId;
//    }
//
//    public void setShipperId(Long shipperId) {
//        this.shipperId = shipperId;
//    }
//
//    public String getShipperName() {
//        return shipperName;
//    }
//
//    public void setShipperName(String shipperName) {
//        this.shipperName = shipperName;
//    }
//
//    public Date getExpectDate() {
//        return expectDate;
//    }
//
//    public void setExpectDate(Date expectDate) {
//        this.expectDate = expectDate;
//    }
//
//    public String getConsignee() {
//        return consignee;
//    }
//
//    public void setConsignee(String consignee) {
//        this.consignee = consignee;
//    }
//
//    public String getConsigneeAddr() {
//        return consigneeAddr;
//    }
//
//    public void setConsigneeAddr(String consigneeAddr) {
//        this.consigneeAddr = consigneeAddr;
//    }
//
//    public String getAddrProvince() {
//        return addrProvince;
//    }
//
//    public void setAddrProvince(String addrProvince) {
//        this.addrProvince = addrProvince;
//    }
//
//    public String getAddrCity() {
//        return addrCity;
//    }
//
//    public void setAddrCity(String addrCity) {
//        this.addrCity = addrCity;
//    }
//
//    public String getAddrCounty() {
//        return addrCounty;
//    }
//
//    public void setAddrCounty(String addrCounty) {
//        this.addrCounty = addrCounty;
//    }
//
//    public String getAddrTown() {
//        return addrTown;
//    }
//
//    public void setAddrTown(String addrTown) {
//        this.addrTown = addrTown;
//    }
//
//    public String getConsigneePostcode() {
//        return consigneePostcode;
//    }
//
//    public void setConsigneePostcode(String consigneePostcode) {
//        this.consigneePostcode = consigneePostcode;
//    }
//
//    public String getConsigneeMobile() {
//        return consigneeMobile;
//    }
//
//    public void setConsigneeMobile(String consigneeMobile) {
//        this.consigneeMobile = consigneeMobile;
//    }
//
//    public String getConsigneePhone() {
//        return consigneePhone;
//    }
//
//    public void setConsigneePhone(String consigneePhone) {
//        this.consigneePhone = consigneePhone;
//    }
//
//    public String getConsigneeEmail() {
//        return consigneeEmail;
//    }
//
//    public void setConsigneeEmail(String consigneeEmail) {
//        this.consigneeEmail = consigneeEmail;
//    }
//
//    public String getConsigneeRemark() {
//        return consigneeRemark;
//    }
//
//    public void setConsigneeRemark(String consigneeRemark) {
//        this.consigneeRemark = consigneeRemark;
//    }
//
//    public String getAfterSalesName() {
//        return afterSalesName;
//    }
//
//    public void setAfterSalesName(String afterSalesName) {
//        this.afterSalesName = afterSalesName;
//    }
//
//    public String getAfterSalesMobile() {
//        return afterSalesMobile;
//    }
//
//    public void setAfterSalesMobile(String afterSalesMobile) {
//        this.afterSalesMobile = afterSalesMobile;
//    }
//
//    public String getAfterSalesAddr() {
//        return afterSalesAddr;
//    }
//
//    public void setAfterSalesAddr(String afterSalesAddr) {
//        this.afterSalesAddr = afterSalesAddr;
//    }
//
//    public Integer getSoStatus() {
//        return soStatus;
//    }
//
//    public void setSoStatus(Integer soStatus) {
//        this.soStatus = soStatus;
//    }
//
//    public Byte getTransType() {
//        return transType;
//    }
//
//    public void setTransType(Byte transType) {
//        this.transType = transType;
//    }
//
//    public String getSoErrStatus() {
//        return soErrStatus;
//    }
//
//    public void setSoErrStatus(String soErrStatus) {
//        this.soErrStatus = soErrStatus;
//    }
//
//    public String getSoMark() {
//        return soMark;
//    }
//
//    public void setSoMark(String soMark) {
//        this.soMark = soMark;
//    }
//
//    public Byte getSoSplitFlag() {
//        return soSplitFlag;
//    }
//
//    public void setSoSplitFlag(Byte soSplitFlag) {
//        this.soSplitFlag = soSplitFlag;
//    }
//
//    public Double getReceivable() {
//        return receivable;
//    }
//
//    public void setReceivable(Double receivable) {
//        this.receivable = receivable;
//    }
//
//    public Double getGuaranteeValue() {
//        return guaranteeValue;
//    }
//
//    public void setGuaranteeValue(Double guaranteeValue) {
//        this.guaranteeValue = guaranteeValue;
//    }
//
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    public Date getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(Date updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    public String getCreateUser() {
//        return createUser;
//    }
//
//    public void setCreateUser(String createUser) {
//        this.createUser = createUser;
//    }
//
//    public String getUpdateUser() {
//        return updateUser;
//    }
//
//    public void setUpdateUser(String updateUser) {
//        this.updateUser = updateUser;
//    }
//
//    public List<SoItemParam> getSoItemParamList() {
//        return soItemParamList;
//    }
//
//    public void setSoItemParamList(List<SoItemParam> soItemParamList) {
//        this.soItemParamList = soItemParamList;
//    }
//
//    public List<SoExceptionParam> getSoExceptionParamList() {
//        return soExceptionParamList;
//    }
//
//    public void setSoExceptionParamList(List<SoExceptionParam> soExceptionParamList) {
//        this.soExceptionParamList = soExceptionParamList;
//    }
//
//    public List<SoItemBatchParam> getSoItemBatchParamList() {
//        return soItemBatchParamList;
//    }
//
//    public void setSoItemBatchParamList(List<SoItemBatchParam> soItemBatchParamList) {
//        this.soItemBatchParamList = soItemBatchParamList;
//    }
//
//    public String getSoThirdSite() {
//        return soThirdSite;
//    }
//
//    public void setSoThirdSite(String soThirdSite) {
//        this.soThirdSite = soThirdSite;
//    }
//
//    public SoExtendParam getSoExtendParam() {
//        return soExtendParam;
//    }
//
//    public void setSoExtendParam(SoExtendParam soExtendParam) {
//        this.soExtendParam = soExtendParam;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserNickName() {
//        return userNickName;
//    }
//
//    public void setUserNickName(String userNickName) {
//        this.userNickName = userNickName;
//    }
//
//    public String getWaybillRemark() {
//        return waybillRemark;
//    }
//
//    public void setWaybillRemark(String waybillRemark) {
//        this.waybillRemark = waybillRemark;
//    }
//
//    public String getHybris() {
//        return hybris;
//    }
//
//    public void setHybris(String hybris) {
//        this.hybris = hybris;
//    }
//
//    public String getSellerFactoryNo() {
//        return sellerFactoryNo;
//    }
//
//    public void setSellerFactoryNo(String sellerFactoryNo) {
//        this.sellerFactoryNo = sellerFactoryNo;
//    }
//
//    public String getSellerFactoryName() {
//        return sellerFactoryName;
//    }
//
//    public void setSellerFactoryName(String sellerFactoryName) {
//        this.sellerFactoryName = sellerFactoryName;
//    }
//
//    public Integer getErrType() {
//        return errType;
//    }
//
//    public void setErrType(Integer errType) {
//        this.errType = errType;
//    }
//
//
//    public Long getGid() {
//        return gid;
//    }
//
//    public void setGid(Long gid) {
//        this.gid = gid;
//    }
//
//
//    public Byte getPieceType() {
//        return pieceType;
//    }
//
//    public void setPieceType(Byte pieceType) {
//        this.pieceType = pieceType;
//    }
//
//    public String getInsuredPriceRule() {
//        return insuredPriceRule;
//    }
//
//    public void setInsuredPriceRule(String insuredPriceRule) {
//        this.insuredPriceRule = insuredPriceRule;
//    }
//
//
//
//    public String getSoVolume() {
//        return soVolume;
//    }
//
//    public void setSoVolume(String soVolume) {
//        this.soVolume = soVolume;
//    }
//
//    public Long getTargetWarehouseId() {
//        return targetWarehouseId;
//    }
//
//    public void setTargetWarehouseId(Long targetWarehouseId) {
//        this.targetWarehouseId = targetWarehouseId;
//    }
//
//    public String getBatchNo() {
//        return batchNo;
//    }
//
//    public void setBatchNo(String batchNo) {
//        this.batchNo = batchNo;
//    }
//
//    public Integer getBatchQty() {
//        return batchQty;
//    }
//
//    public void setBatchQty(Integer batchQty) {
//        this.batchQty = batchQty;
//    }
//
//    public Byte getTransactionSource() {
//        return transactionSource;
//    }
//
//    public void setTransactionSource(Byte transactionSource) {
//        this.transactionSource = transactionSource;
//    }
//
//    public List<SoSerialNo> getSoSerialNoList() {
//        return soSerialNoList;
//    }
//
//    public void setSoSerialNoList(List<SoSerialNo> soSerialNoList) {
//        this.soSerialNoList = soSerialNoList;
//    }
//
//    private Integer giftType;
//
//    private String giftNo;
//
//    public Integer getGiftType() {
//        return giftType;
//    }
//
//    public void setGiftType(Integer giftType) {
//        this.giftType = giftType;
//    }
//
//    public String getGiftNo() {
//        return giftNo;
//    }
//
//    public void setGiftNo(String giftNo) {
//        this.giftNo = giftNo;
//    }
//
//    /**
//     * 外单合并key
//     */
//    private String mergeKey;
//
//    /**
//     * 外单团单号
//     */
//    private String groupOrderNumber;
//
//    /**
//     * 合并状态 0 没合并 1 合并过 2已取消
//     */
//    private Byte isMerge;
//
//    private String ediRemark;
//
//    //发货时间
//    private String deliveryTime;
//
//
//    /** 订单金额 */
//    private Double orderAmount;
//
//    /**
//     *lining xin zeng  物流方式
//     */
//    private String transportType;
//
//    private String settlementType;
//
//
//    public String getTransportType() {
//        return transportType;
//    }
//
//    public void setTransportType(String transportType) {
//        this.transportType = transportType;
//    }
//
//    public String getSettlementType() {
//        return settlementType;
//    }
//
//    public void setSettlementType(String settlementType) {
//        this.settlementType = settlementType;
//    }
//
//    public String getMergeKey() {
//        return mergeKey;
//    }
//
//    public void setMergeKey(String mergeKey) {
//        this.mergeKey = mergeKey;
//    }
//
//    public String getGroupOrderNumber() {
//        return groupOrderNumber;
//    }
//
//    public void setGroupOrderNumber(String groupOrderNumber) {
//        this.groupOrderNumber = groupOrderNumber;
//    }
//
//    public Byte getIsMerge() {
//        return isMerge;
//    }
//
//    public void setIsMerge(Byte isMerge) {
//        this.isMerge = isMerge;
//    }
//
//    public String getEdiRemark() {
//        return ediRemark;
//    }
//
//    public void setEdiRemark(String ediRemark) {
//        this.ediRemark = ediRemark;
//    }
//
//
//    public String getDeliveryTime() {
//        return deliveryTime;
//    }
//
//    public void setDeliveryTime(String deliveryTime) {
//        this.deliveryTime = deliveryTime;
//    }
//
//
//    public Double getOrderAmount() {
//        return orderAmount;
//    }
//
//    public void setOrderAmount(Double orderAmount) {
//        this.orderAmount = orderAmount;
//    }
//
//    /** 期望送货时间 */
//    private Date expectDeliveryDate;
//
//    public Date getExpectDeliveryDate() {
//        return expectDeliveryDate;
//    }
//
//    public void setExpectDeliveryDate(Date expectDeliveryDate) {
//        this.expectDeliveryDate = expectDeliveryDate;
//    }
//
//    /**
//     * B2B城配 商家门店编号
//     * B2B订单时 必填
//     */
//    private String customerNo;
//
//    public String getCustomerNo() {
//        return customerNo;
//    }
//
//    public void setCustomerNo(String customerNo) {
//        this.customerNo = customerNo;
//    }
//
//    /**
//     * 外部订单类型
//     */
//    private String isvSoType;
//
//    public String getIsvSoType() {
//        return isvSoType;
//    }
//
//    public void setIsvSoType(String isvSoType) {
//        this.isvSoType = isvSoType;
//    }
//
//    /**
//     * 是否更新库存缓存
//     * 0-更新，1-不更新，默认更新
//     */
//    private int freshStockCache;
//
//    public int getFreshStockCache() {
//        return freshStockCache;
//    }
//
//    public void setFreshStockCache(int freshStockCache) {
//        this.freshStockCache = freshStockCache;
//    }
//
//    /**
//     * 是否加工
//     */
//    private Byte isProcess;
//
//    /**
//     * 是否预约配送
//     */
//    private Byte isAppointDelivery;
//
//    /**
//     * 预约配送日期
//     */
//    private Date appointDeliveryDate;
//
//    /**
//     * 预约配送时间
//     */
//    private String appointDeliveryDateperiod;
//    /**
//     * 卖家备注，库房打印需求
//     */
//    private String sellerNotes;
//    /** 0 表示不是重打包，1表示是重打包 */
//    private int againPack;
//    private Byte isColdChain;
//
//    private List<String> boxNos;
//
//    private String operator;
//
//    public Byte getIsProcess() {
//        return isProcess;
//    }
//
//    public void setIsProcess(Byte isProcess) {
//        this.isProcess = isProcess;
//    }
//
//    public Byte getIsAppointDelivery() {
//        return isAppointDelivery;
//    }
//
//    public void setIsAppointDelivery(Byte isAppointDelivery) {
//        this.isAppointDelivery = isAppointDelivery;
//    }
//
//    public Date getAppointDeliveryDate() {
//        return appointDeliveryDate;
//    }
//
//    public void setAppointDeliveryDate(Date appointDeliveryDate) {
//        this.appointDeliveryDate = appointDeliveryDate;
//    }
//
//    public String getAppointDeliveryDateperiod() {
//        return appointDeliveryDateperiod;
//    }
//
//    public void setAppointDeliveryDateperiod(String appointDeliveryDateperiod) {
//        this.appointDeliveryDateperiod = appointDeliveryDateperiod;
//    }
//
//    public String getSellerNotes() {
//        return sellerNotes;
//    }
//
//    public void setSellerNotes(String sellerNotes) {
//        this.sellerNotes = sellerNotes;
//    }
//
//    public Byte getIsColdChain() {
//        return isColdChain;
//    }
//
//    public void setIsColdChain(Byte isColdChain) {
//        this.isColdChain = isColdChain;
//    }
//
//    public List<String> getBoxNos() {
//        return boxNos;
//    }
//
//    public void setBoxNos(List<String> boxNos) {
//        this.boxNos = boxNos;
//    }
//
//    public String getOperator() {
//        return operator;
//    }
//
//    public void setOperator(String operator) {
//        this.operator = operator;
//    }
//    public int getAgainPack() {
//        return againPack;
//    }
//
//    public void setAgainPack(int againPack) {
//        this.againPack = againPack;
//    }
//}
