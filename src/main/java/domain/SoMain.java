package domain;

import java.util.Date;

/**
 * 销售订单主档
 *
 * @author douhuatong
 * @org clps.jd.com
 * @Date 2014-08-13 下午 07:20:30
 */
public class SoMain {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 父单id
     */
    private Long parentId;

    /**
     * CLPS订单编号
     */
    private String soNo;

    /**
     * ISV出库单号
     */
    private String isvSoNo;

    /**
     * 销售平台单号
     */
    private String spSoNo;

    /**
     * 订单来源（1:ISV，2:POP）
     */
    private Byte soSource;

    /**
     * 销售平台ID
     */
    private Long spId;

    /**
     * 销售平台编号
     */
    private String spNo;

    /**
     * 销售平台来源（京东/天猫/苏宁/亚马逊/ChinaSkin/其它）
     */
    private String spName;

    /**
     * 青龙销售平台编号
     */
    private String bdSpNo;

    /**
     * 销售平台下单时间
     */
    private Date spCreateTime;

    /**
     * 商家Id
     */
    private Long sellerId;

    /**
     * 商家编号
     */
    private String sellerNo;

    /**
     * 商家名称
     */
    private String sellerName;

    /**
     * 商家留言（最多支持125个字）
     */
    private String sellerRemark;

    /**
     * 事业部Id
     */
    private Long deptId;

    /**
     * 事业部编号
     */
    private String deptNo;

    /**
     * 事业部名称
     */
    private String deptName;

    /**
     * 店铺Id
     */
    private Long shopId;

    /**
     * 店铺编号
     */
    private String shopNo;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 青龙业主号
     */
    private String bdOwnerNo;


    /**
     * ISV店铺编号
     */
    private String isvShopNo;

    /**
     * 运单
     */
    private String wayBill;

    /**
     * 站点编号
     */
    private String stationNo;

    /**
     * 站点名称
     */
    private String stationName;

    /**
     * 分拣中心编号
     */
    private String sortingCenterNo;

    /**
     * 分拣中心名称
     */
    private String sortingCenterName;

    /**
     * 路区
     */
    private String sortingRoad;

    /**
     * 库房Id
     */
    private Long warehouseId;

    /**
     * 库房No
     */
    private String warehouseNo;

    /**
     * 库房名称
     */
    private String warehouseName;

    /**
     * 配送中心编号(外部)
     */
    private String distributionNo;

    /**
     * 机构编号（外部）
     */
    private String orgNo;

    /**
     * 库房编号（外部）
     */
    private String erpWarehouseNo;

    /**
     * 承运商ID(目前默认青龙)
     */
    private Long shipperId;

    /**
     * 承运商编号（目前默认青龙）
     */
    private String shipperNo;

    /**
     * 承运商名称（目前默认青龙）
     */
    private String shipperName;

    /**
     * 期望送货时间
     */
    private Date expectDate;

    /**
     * 预计发货时间
     */
    private Date expectDeliveryDate;


    /**
     * 收货人（最大支持25个汉字）
     */
    private String consignee;

    /**
     * 收货人地址（最大支持125个汉字）
     */
    private String consigneeAddr;

    /**
     * 收货地址-省
     */
    private String addrProvince;

    /**
     * 收货地址-市
     */
    private String addrCity;

    /**
     * 收货地址-县
     */
    private String addrCounty;

    /**
     * 收货地址-镇
     */
    private String addrTown;

    /**
     * 收货人邮政编码
     */
    private String consigneePostcode;

    /**
     * 收货人手机
     */
    private String consigneeMobile;

    /**
     * 收货人电话(收件人电话、手机至少有一个不为空)
     */
    private String consigneePhone;

    /**
     * 收货人邮箱
     */
    private String consigneeEmail;

    /**
     * 买家留言
     */
    private String consigneeRemark;

    /**
     * 退货收货人姓名
     */
    private String afterSalesName;

    /**
     * 退货收货联系方式
     */
    private String afterSalesMobile;

    /**
     * 退货收货地址
     */
    private String afterSalesAddr;

    /**
     * 订单生产状态
     */
    private Integer soStatus;

    /**
     * 运输类型(陆运：1，航空：2。不填或者超出范围时，默认是1)
     */
    private Byte transType;

    /**
     * 订单异常状态（取消，无法生产，无法分拣，无法发货）
     */
    private String soErrStatus;

    /**
     * 订单标记位:50位的数字串：
     * 第1位：0表示在线支付，1代表货到付款, 不填或者超出范围，默认是0
     * 第2位：0表示青龙配送，1表示需要第三方配送（由青龙转交），2表示商家自主配送（去库房自提）
     * 第3位：是否保价(是：1，否：0，默认是0)
     * 第4位：签单返还(是：1，否：0。不填或者超出范围时，默认是0
     * 第5位：送货时效(普通：1，工作日：2，非工作日：3，晚间：4。不填或者超出范围时，默认是1
     * 第6位：包装要求(不需包装：1，简单包装：2，特殊包装：3。不填或者超出范围，默认是1)
     * 第10位：订单类型(B2C:0,B2B:1,C2B:2,OTHER:3，默认是0)
     * 第11位：仓配计费类型(0:普通,1:一口价,2:三方配送)
     * 第49位：1代表闪购订单，
     * 第50位：1代表POP下发的仓储服务订单
     */
    private String soMark;

    /**
     * 拆单标志（0:未拆单，1:已拆单）
     */
    private Byte soSplitFlag;

    /**
     * 应收金额（货到付款必填）
     */
    private Double receivable;

    /**
     * 保价金额（需要报价金额必填）
     */
    private Double guaranteeValue;

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
    private Byte yn;

    /**
     * 在销售平台的下单帐号
     */
    private String pinAccount;
    /**
     * ISV来源编号
     */
    private String isvSource;

    /**
     * ISV来源名称
     */
    private String isvSourceName;

    /**
     * 订单类型
     * 与ordermark字段第10位相同，但标记加1存储(B2C:1,B2B:2,B2B2C:3,OTHER:4)//C2B原为3
     */
    private Byte soType;

    /**
     * 三方站点（大头笔）
     */
    private String soThirdSite;

    /**
     * 货主编码
     */
    private String clientNo;

    /**
     * 货主名称
     */
    private String clientName;

    /**
     * 森马接入添加订单重量   2016-3-20
     */
    /**
     * 订单总重量
     */
    private String soWeight;

    /** 李宁B2C添加 */
    /**
     * 用户账号
     */
    private String userName;

    /**
     * 用户昵称
     */
    private String userNickName;

    /**
     * 运单备注
     */
    private String waybillRemark;

    /**
     * hybris单号
     */
    private String hybris;

    /**
     * 发货工厂编号
     */
    private String sellerFactoryNo;

    /**
     * 发货工厂名称
     */
    private String sellerFactoryName;

    /**
     * 运费（大件运费）
     */
    private Double yunFee;

    /**
     * 折扣（大件折扣）
     */
    private Double discount;

    /** 订单异常查询添加*/
    /**
     * 异常类型
     */
    private Integer errType;

    /**
     * 暂停时间
     */
    private Date pauseTime;
    /**
     * 分库标识
     */
    private Long gid;


    /**
     * 保价需求新增
     **/
    private String insuredPriceRule;

    /**
     * 件型 1：小件  12：大件
     **/
    private Byte pieceType;

    /**
     * 是否保价订单
     **/
    private Byte insuredPriceFlag;

    private String pieceTypeStr;

    /**
     * 耗材相关信息添加
     */
    /**
     * 订单总体积
     **/
    private String soVolume;

    /**
     * CLPS实物库房ID
     */
    private Long targetWarehouseId;

    /**
     * 批量号
     */
    private String batchNo;

    /**
     * 批量订单数
     */
    private Integer batchQty;

    /**
     * 业务来源(腾讯)
     */

    private Byte transactionSource;
    private Integer giftType;
    private String giftNo;
    /**
     * 外单合并key
     */
    private String mergeKey;
    /**
     * 外单团单号
     */
    private String groupOrderNumber;
    /**
     * 是否合并过 0 没合并 1 合并过
     */
    private Byte isMerge;
    private String ediRemark;
    /**
     * 站点类别
     */
    private Integer stationType;
    /**
     * 订单金额
     */
    private Double orderAmount;
    /**
     * lining xin zeng  物流方式
     */
    private String transportType;
    private String settlementType;
    /**
     * 时效 航空标添加 来源：OrderMark的第39位 显示用
     */
    private String chronergyStr;
    /**
     * 外部订单类型
     */
    private String isvSoType;
    /**
     * 是否支持取消成功后同一单号重新下单(1否2是)
     */
    private Byte canceledRetransport;
    /**
     * 是否更新库存缓存
     * 0-更新，1-不更新，默认更新
     */
    private int freshStockCache;
    /**
     * 承运商ID(目前默认青龙)
     */
    private Long planShipperId;
    /**
     * 承运商编号（目前默认青龙）
     */
    private String planShipperNo;
    /**
     * 承运商名称（目前默认青龙）
     */
    private String planShipperName;
    /**
     * 是否加工
     */
    private Byte isProcess;
    /**
     * 是否预约配送
     */
    private Byte isAppointDelivery;
    /**
     * 预约配送日期
     */
    private Date appointDeliveryDate;
    /**
     * 预约配送时间
     */
    private String appointDeliveryDateperiod;
    /**
     * 卖家备注，库房打印需求
     */
    private String sellerNotes;
    /**
     * 任务流程记录
     */
    private String taskPart;
    /*
     * 是否进行温控，温控订单库房使用保温箱
     */
    private Byte isColdChain;

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Byte getSoType() {
        return soType;
    }

    public void setSoType(Byte soType) {
        this.soType = soType;
    }

    public String getSortingRoad() {
        return sortingRoad;
    }

    public void setSortingRoad(String sortingRoad) {
        this.sortingRoad = sortingRoad;
    }

    public String getIsvSourceName() {
        return isvSourceName;
    }

    public void setIsvSourceName(String isvSourceName) {
        this.isvSourceName = isvSourceName;
    }

    public String getIsvSource() {
        return isvSource;
    }

    public void setIsvSource(String isvSource) {
        this.isvSource = isvSource;
    }

    public String getSortingCenterNo() {
        return sortingCenterNo;
    }

    public void setSortingCenterNo(String sortingCenterNo) {
        this.sortingCenterNo = sortingCenterNo;
    }

    public String getSortingCenterName() {
        return sortingCenterName;
    }

    public void setSortingCenterName(String sortingCenterName) {
        this.sortingCenterName = sortingCenterName;
    }

    public String getPinAccount() {
        return pinAccount;
    }

    public void setPinAccount(String pinAccount) {
        this.pinAccount = pinAccount;
    }

    public String getErpWarehouseNo() {
        return erpWarehouseNo;
    }

    public void setErpWarehouseNo(String erpWarehouseNo) {
        this.erpWarehouseNo = erpWarehouseNo;
    }

    public String getShipperNo() {
        return shipperNo;
    }

    public void setShipperNo(String shipperNo) {
        this.shipperNo = shipperNo;
    }

    public Long getSpId() {
        return spId;
    }

    public void setSpId(Long spId) {
        this.spId = spId;
    }

    public String getBdOwnerNo() {
        return bdOwnerNo;
    }

    public void setBdOwnerNo(String bdOwnerNo) {
        this.bdOwnerNo = bdOwnerNo;
    }

    public String getSpNo() {
        return spNo;
    }

    public void setSpNo(String spNo) {
        this.spNo = spNo;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getBdSpNo() {
        return bdSpNo;
    }

    public void setBdSpNo(String bdSpNo) {
        this.bdSpNo = bdSpNo;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
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
     * @return the parentId
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    /**
     * @return the isvSoNo
     */
    public String getIsvSoNo() {
        return isvSoNo;
    }

    /**
     * @param isvSoNo the isvSoNo to set
     */
    public void setIsvSoNo(String isvSoNo) {
        this.isvSoNo = isvSoNo;
    }

    /**
     * @return the spSoNo
     */
    public String getSpSoNo() {
        return spSoNo;
    }

    /**
     * @param spSoNo the spSoNo to set
     */
    public void setSpSoNo(String spSoNo) {
        this.spSoNo = spSoNo;
    }

    /**
     * @return the soSource
     */
    public Byte getSoSource() {
        return soSource;
    }

    /**
     * @param soSource the soSource to set
     */
    public void setSoSource(Byte soSource) {
        this.soSource = soSource;
    }

    public Date getExpectDeliveryDate() {
        return expectDeliveryDate;
    }

    public void setExpectDeliveryDate(Date expectDeliveryDate) {
        this.expectDeliveryDate = expectDeliveryDate;
    }

    /**
     * @return the spCreateTime
     */
    public Date getSpCreateTime() {
        return spCreateTime;
    }

    /**
     * @param spCreateTime the spCreateTime to set
     */
    public void setSpCreateTime(Date spCreateTime) {
        this.spCreateTime = spCreateTime;
    }

    /**
     * @return the sellerId
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * @param sellerId the sellerId to set
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * @return the sellerName
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * @param sellerName the sellerName to set
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    /**
     * @return the sellerRemark
     */
    public String getSellerRemark() {
        return sellerRemark;
    }

    /**
     * @param sellerRemark the sellerRemark to set
     */
    public void setSellerRemark(String sellerRemark) {
        this.sellerRemark = sellerRemark;
    }

    /**
     * @return the deptId
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * @param deptId the deptId to set
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName the deptName to set
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return the shopId
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * @param shopId the shopId to set
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * @return the shopName
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * @param shopName the shopName to set
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * @return the isvShopNo
     */
    public String getIsvShopNo() {
        return isvShopNo;
    }

    /**
     * @param isvShopNo the isvShopNo to set
     */
    public void setIsvShopNo(String isvShopNo) {
        this.isvShopNo = isvShopNo;
    }

    /**
     * @return the wayBill
     */
    public String getWayBill() {
        return wayBill;
    }

    /**
     * @param wayBill the wayBill to set
     */
    public void setWayBill(String wayBill) {
        this.wayBill = wayBill;
    }

    /**
     * @return the stationNo
     */
    public String getStationNo() {
        return stationNo;
    }

    /**
     * @param stationNo the stationNo to set
     */
    public void setStationNo(String stationNo) {
        this.stationNo = stationNo;
    }

    /**
     * @return the stationName
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * @param stationName the stationName to set
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * @return the warehouseId
     */
    public Long getWarehouseId() {
        return warehouseId;
    }

    /**
     * @param warehouseId the warehouseId to set
     */
    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * @return the warehouseNo
     */
    public String getWarehouseNo() {
        return warehouseNo;
    }

    /**
     * @param warehouseNo the warehouseNo to set
     */
    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    /**
     * @return the warehouseName
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /**
     * @param warehouseName the warehouseName to set
     */
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    /**
     * @return the distributionNo
     */
    public String getDistributionNo() {
        return distributionNo;
    }

    /**
     * @param distributionNo the distributionNo to set
     */
    public void setDistributionNo(String distributionNo) {
        this.distributionNo = distributionNo;
    }

    /**
     * @return the orgNo
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * @param orgNo the orgNo to set
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    /**
     * @return the shipperId
     */
    public Long getShipperId() {
        return shipperId;
    }

    /**
     * @param shipperId the shipperId to set
     */
    public void setShipperId(Long shipperId) {
        this.shipperId = shipperId;
    }

    /**
     * @return the shipperName
     */
    public String getShipperName() {
        return shipperName;
    }

    /**
     * @param shipperName the shipperName to set
     */
    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    /**
     * @return the expectDate
     */
    public Date getExpectDate() {
        return expectDate;
    }

    /**
     * @param expectDate the expectDate  to set
     */
    public void setExpectDate(Date expectDate) {
        this.expectDate = expectDate;
    }

    /**
     * @return the consignee
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * @param consignee the consignee to set
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * @return the consigneeAddr
     */
    public String getConsigneeAddr() {
        return consigneeAddr;
    }

    /**
     * @param consigneeAddr the consigneeAddr to set
     */
    public void setConsigneeAddr(String consigneeAddr) {
        this.consigneeAddr = consigneeAddr;
    }

    /**
     * @return the addrProvince
     */
    public String getAddrProvince() {
        return addrProvince;
    }

    /**
     * @param addrProvince the addrProvince to set
     */
    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince;
    }

    /**
     * @return the addrCity
     */
    public String getAddrCity() {
        return addrCity;
    }

    /**
     * @param addrCity the addrCity to set
     */
    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    /**
     * @return the addrCounty
     */
    public String getAddrCounty() {
        return addrCounty;
    }

    /**
     * @param addrCounty the addrCounty to set
     */
    public void setAddrCounty(String addrCounty) {
        this.addrCounty = addrCounty;
    }

    /**
     * @return the addrTown
     */
    public String getAddrTown() {
        return addrTown;
    }

    /**
     * @param addrTown the addrTown to set
     */
    public void setAddrTown(String addrTown) {
        this.addrTown = addrTown;
    }

    /**
     * @return the consigneePostcode
     */
    public String getConsigneePostcode() {
        return consigneePostcode;
    }

    /**
     * @param consigneePostcode the consigneePostcode to set
     */
    public void setConsigneePostcode(String consigneePostcode) {
        this.consigneePostcode = consigneePostcode;
    }

    /**
     * @return the consigneeMobile
     */
    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    /**
     * @param consigneeMobile the consigneeMobile to set
     */
    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    /**
     * @return the consigneePhone
     */
    public String getConsigneePhone() {
        return consigneePhone;
    }

    /**
     * @param consigneePhone the consigneePhone to set
     */
    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    /**
     * @return the consigneeEmail
     */
    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    /**
     * @param consigneeEmail the consigneeEmail to set
     */
    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail;
    }

    /**
     * @return the consigneeRemark
     */
    public String getConsigneeRemark() {
        return consigneeRemark;
    }

    /**
     * @param consigneeRemark the consigneeRemark to set
     */
    public void setConsigneeRemark(String consigneeRemark) {
        this.consigneeRemark = consigneeRemark;
    }

    /**
     * @return the afterSalesName
     */
    public String getAfterSalesName() {
        return afterSalesName;
    }

    /**
     * @param afterSalesName the afterSalesName to set
     */
    public void setAfterSalesName(String afterSalesName) {
        this.afterSalesName = afterSalesName;
    }

    /**
     * @return the afterSalesMobile
     */
    public String getAfterSalesMobile() {
        return afterSalesMobile;
    }

    /**
     * @param afterSalesMobile the afterSalesMobile to set
     */
    public void setAfterSalesMobile(String afterSalesMobile) {
        this.afterSalesMobile = afterSalesMobile;
    }

    /**
     * @return the afterSalesAddr
     */
    public String getAfterSalesAddr() {
        return afterSalesAddr;
    }

    /**
     * @param afterSalesAddr the afterSalesAddr to set
     */
    public void setAfterSalesAddr(String afterSalesAddr) {
        this.afterSalesAddr = afterSalesAddr;
    }

    /**
     * @return the soStatus
     */
    public Integer getSoStatus() {
        return soStatus;
    }

    /**
     * @param soStatus the soStatus to set
     */
    public void setSoStatus(Integer soStatus) {
        this.soStatus = soStatus;
    }

    /**
     * @return the transType
     */
    public Byte getTransType() {
        return transType;
    }

    /**
     * @param transType the transType  to set
     */
    public void setTransType(Byte transType) {
        this.transType = transType;
    }

    /**
     * @return the soErrStatus
     */
    public String getSoErrStatus() {
        return soErrStatus;
    }

    /**
     * @param soErrStatus the soErrStatus to set
     */
    public void setSoErrStatus(String soErrStatus) {
        this.soErrStatus = soErrStatus;
    }

    /**
     * @return the soMark
     */
    public Integer getSoMark(int index) throws Exception{
        SoMarkUtil util = new SoMarkUtil(soMark);
        return Integer.parseInt(String.valueOf(util.charAt(index)));
    }

    public String getSoMark() {
        return soMark;
    }

    public void setSoMark(SoMarkUtil soMarkUtil) {
        this.soMark = soMarkUtil.toString();
    }

    /**
     * @param soMark the soMark to set
     */
    public void setSoMark(String soMark) {
        this.soMark = soMark;
    }

    public void setSoMark(int index, char a) throws Exception{
        SoMarkUtil util = new SoMarkUtil(soMark);
        util.inChar(index, a);
        this.soMark = util.toString();
    }

    /**
     * @return the soSplitFlag
     */
    public Byte getSoSplitFlag() {
        return soSplitFlag;
    }

    /**
     * @param soSplitFlag the soSplitFlag to set
     */
    public void setSoSplitFlag(Byte soSplitFlag) {
        this.soSplitFlag = soSplitFlag;
    }

    /**
     * @return the receivable
     */
    public Double getReceivable() {
        return receivable;
    }

    /**
     * @param receivable the receivable to set
     */
    public void setReceivable(Double receivable) {
        this.receivable = receivable;
    }

    /**
     * @return the guaranteeValue
     */
    public Double getGuaranteeValue() {
        return guaranteeValue;
    }

    /**
     * @param guaranteeValue the guaranteeValue  to set
     */
    public void setGuaranteeValue(Double guaranteeValue) {
        this.guaranteeValue = guaranteeValue;
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

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }

    public String getSoThirdSite() {
        return soThirdSite;
    }

    public void setSoThirdSite(String soThirdSite) {
        this.soThirdSite = soThirdSite;
    }

    public String getSoWeight() {
        return soWeight;
    }

    public void setSoWeight(String soWeight) {
        this.soWeight = soWeight;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getWaybillRemark() {
        return waybillRemark;
    }

    public void setWaybillRemark(String waybillRemark) {
        this.waybillRemark = waybillRemark;
    }

    public String getHybris() {
        return hybris;
    }

    public void setHybris(String hybris) {
        this.hybris = hybris;
    }

    public String getSellerFactoryNo() {
        return sellerFactoryNo;
    }

    public void setSellerFactoryNo(String sellerFactoryNo) {
        this.sellerFactoryNo = sellerFactoryNo;
    }

    public String getSellerFactoryName() {
        return sellerFactoryName;
    }

    public void setSellerFactoryName(String sellerFactoryName) {
        this.sellerFactoryName = sellerFactoryName;
    }

    public Double getYunFee() {
        return yunFee;
    }

    public void setYunFee(Double yunFee) {
        this.yunFee = yunFee;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getErrType() {
        return errType;
    }

    public void setErrType(Integer errType) {
        this.errType = errType;
    }

    public Date getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(Date pauseTime) {
        this.pauseTime = pauseTime;
    }

    public String getPieceTypeStr() {
        return pieceTypeStr;
    }

    public void setPieceTypeStr(String pieceTypeStr) {
        this.pieceTypeStr = pieceTypeStr;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public Byte getInsuredPriceFlag() {
        return insuredPriceFlag;
    }

    public void setInsuredPriceFlag(Byte insuredPriceFlag) {
        this.insuredPriceFlag = insuredPriceFlag;
    }

    public String getInsuredPriceRule() {
        return insuredPriceRule;
    }

    public void setInsuredPriceRule(String insuredPriceRule) {
        this.insuredPriceRule = insuredPriceRule;
    }

    public Byte getPieceType() {
        return pieceType;
    }

    public void setPieceType(Byte pieceType) {
        this.pieceType = pieceType;
    }

    public String getSoVolume() {
        return soVolume;
    }

    public void setSoVolume(String soVolume) {
        this.soVolume = soVolume;
    }

    public Long getTargetWarehouseId() {
        return targetWarehouseId;
    }

    public void setTargetWarehouseId(Long targetWarehouseId) {
        this.targetWarehouseId = targetWarehouseId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Integer getBatchQty() {
        return batchQty;
    }

    public void setBatchQty(Integer batchQty) {
        this.batchQty = batchQty;
    }

    public Byte getTransactionSource() {
        return transactionSource;
    }

    public void setTransactionSource(Byte transactionSource) {
        this.transactionSource = transactionSource;
    }

    public Integer getGiftType() {
        return giftType;
    }

    public void setGiftType(Integer giftType) {
        this.giftType = giftType;
    }

    public String getGiftNo() {
        return giftNo;
    }

    public void setGiftNo(String giftNo) {
        this.giftNo = giftNo;
    }

    public String getMergeKey() {
        return mergeKey;
    }

    public void setMergeKey(String mergeKey) {
        this.mergeKey = mergeKey;
    }

    public String getGroupOrderNumber() {
        return groupOrderNumber;
    }

    public void setGroupOrderNumber(String groupOrderNumber) {
        this.groupOrderNumber = groupOrderNumber;
    }

    public Byte getIsMerge() {
        return isMerge;
    }

    public void setIsMerge(Byte isMerge) {
        this.isMerge = isMerge;
    }

    public String getEdiRemark() {
        return ediRemark;
    }

    public void setEdiRemark(String ediRemark) {
        this.ediRemark = ediRemark;
    }

    public Integer getStationType() {
        return stationType;
    }

    public void setStationType(Integer stationType) {
        this.stationType = stationType;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public String getChronergyStr() {
        return chronergyStr;
    }

    public void setChronergyStr(String chronergyStr) {
        this.chronergyStr = chronergyStr;
    }

    public String getIsvSoType() {
        return isvSoType;
    }

    public void setIsvSoType(String isvSoType) {
        this.isvSoType = isvSoType;
    }

    public Byte getCanceledRetransport() {
        return canceledRetransport;
    }

    public void setCanceledRetransport(Byte canceledRetransport) {
        this.canceledRetransport = canceledRetransport;
    }

    public int getFreshStockCache() {
        return freshStockCache;
    }

    public void setFreshStockCache(int freshStockCache) {
        this.freshStockCache = freshStockCache;
    }

    public Long getPlanShipperId() {
        return planShipperId;
    }

    public void setPlanShipperId(Long planShipperId) {
        this.planShipperId = planShipperId;
    }

    public String getPlanShipperNo() {
        return planShipperNo;
    }

    public void setPlanShipperNo(String planShipperNo) {
        this.planShipperNo = planShipperNo;
    }

    public String getPlanShipperName() {
        return planShipperName;
    }

    public void setPlanShipperName(String planShipperName) {
        this.planShipperName = planShipperName;
    }

    public Byte getIsColdChain() {
        return isColdChain;
    }

    public void setIsColdChain(Byte isColdChain) {
        this.isColdChain = isColdChain;
    }

    public Byte getIsProcess() {
        return isProcess;
    }

    public void setIsProcess(Byte isProcess) {
        this.isProcess = isProcess;
    }

    public Byte getIsAppointDelivery() {
        return isAppointDelivery;
    }

    public void setIsAppointDelivery(Byte isAppointDelivery) {
        this.isAppointDelivery = isAppointDelivery;
    }

    public Date getAppointDeliveryDate() {
        return appointDeliveryDate;
    }

    public void setAppointDeliveryDate(Date appointDeliveryDate) {
        this.appointDeliveryDate = appointDeliveryDate;
    }

    public String getAppointDeliveryDateperiod() {
        return appointDeliveryDateperiod;
    }

    public void setAppointDeliveryDateperiod(String appointDeliveryDateperiod) {
        this.appointDeliveryDateperiod = appointDeliveryDateperiod;
    }


    public String getSellerNotes() {
        return sellerNotes;
    }

    public void setSellerNotes(String sellerNotes) {
        this.sellerNotes = sellerNotes;
    }

    public String getTaskPart() {
        return taskPart;
    }

    public void setTaskPart(String taskPart) {
        this.taskPart = taskPart;
    }
}
