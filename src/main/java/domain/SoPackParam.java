package domain;

import com.jd.clps.bbp.so.domain.SoPackItem;
import com.jd.clps.common.base.BaseEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 包裹数据回传saf入参
 * User: douhuatong
 * Date: 14-8-18
 * Time: 下午2:09
 */
public class SoPackParam extends BaseEntity {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 订单主键 */
    private Long soId;

    /** 订单号 --转成订单号对接青龙订单号 */
    private String soNo;

    /** 包裹号 */
    private String packageNo;

    /** 包裹序号 */
    private String seq;

    /** 运单 */
    private String wayBill;

    /** 销售平台订单号 */
    private String spSoNo;

    /** 包裹重量 */
    private Double packWeight;

    /** 包裹体积 */
    private Double packVolume;

    /** 长 */
    private Double volumeLong;

    /** 宽 */
    private Double volumeWidth;

    /** 高 */
    private Double volumeHeight;

    /** 寄件人（最大支持25个汉字） */
    private String senderName;

    /** 寄件人地址（最大支持125个汉字） */
    private String senderAddr;

    /** 寄件人手机 */
    private String senderMobile;

    /** 寄件人电话(寄件人电话、手机至少有一个不为空) */
    private String senderPhone;

    /** 寄件人邮编 */
    private String senderPostcode;

    /** 包裹数量 */
    private Integer packCount;

    /** 打包时间 */
    private Date packTime;

    /** 打包人 */
    private String packUser;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    /** 创建人 */
    private String createUser;

    /** 更新人 */
    private String updateUser;


    /** 应收金额（货到付款必填） */
    private Double receivable;

    /** 保价金额（需要报价金额必填） */
    private Double guaranteeValue;

    /** 销售平台 */
    private String salePlat;

    /** 青龙商家编号 */
    private String bdOwnerNo;

    /** 收件人 */
    private String receiveName;
    /** 收件人地址 */
    private String receiveAddress;
    /** 收件人电话 */
    private String receiveTel;
    /** 收件人手机 */
    private String receiveMobile;
    /** 收件人省 */
    private String province;
    /** 收件人市 */
    private String city;
    /** 收件人县 */
    private String county;
    /** 收件人镇 */
    private String town;
    /** 收件人邮编 */
    private String postcode;

    /** 站点编号 */
    private String stationNo;

    /** 站点名称 */
    private String stationName;


    /** 运输类型(陆运：1，航空：2。不填或者超出范围时，默认是1) */
    private Byte transType;


    /** 订单来源（1:ISV，2:POP） */
    private Byte soSource;


    /** 备注 */
    private String remark;


    /**
     * 订单标记位:50位的数字串：
     * 第1位：0表示在线支付，1代表货到付款, 不填或者超出范围，默认是0
     * 第2位：0表示青龙配送，1表示需要第三方配送（由青龙转交），2表示商家自主配送（去库房自提）
     * 第3位：是否保价(是：1，否：0，默认是0)
     * 第4位：签单返还(是：1，否：0。不填或者超出范围时，默认是0
     * 第5位：送货时效(普通：1，工作日：2，非工作日：3，晚间：4。不填或者超出范围时，默认是1
     * 第6位：包装要求(不需包装：1，简单包装：2，特殊包装：3。不填或者超出范围，默认是1)
     * 第49位：1代表闪购订单，
     * 第50位：1代表POP下发的仓储服务订单
     * 该字段请采用<code>SoMarkUtil</code>解析
     * 枚举类型参考<code>SoMarkEnum</code>
     */
    private String soMark;

    /** 事业部Id用于生产ID */
    private Long deptId;

    /**
     * 三方运单号
     */
    private String thirdWayBill;

    /** 承运商ID*/
    private Long shipperId;


    /** 承运商编号 */
    private String shipperNo;

    /** 承运商名称 */
    private String shipperName;

    /** 网点编码 */
    private String branchCode;

    /** 网点名称 */
    private String branchName;

    /**添加耗材相关信息**/
    /**耗材编码**/
    private String goodsMaterialNo;
    /**耗材名称**/
    private String goodsMaterialName;
    /**耗材货主类型**/
    private String materialOwnerType;
    /**耗材包装类型**/
    private String materialPackageType;
    /** 耗材明细列表**/
    private List<SoPackItem> soPackItemList = new ArrayList<SoPackItem>();

    private List<GoodsMaterialParam> goodsMaterialParamList = new ArrayList<GoodsMaterialParam>();

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSoId() {
        return soId;
    }

    public void setSoId(Long soId) {
        this.soId = soId;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getWayBill() {
        return wayBill;
    }

    public void setWayBill(String wayBill) {
        this.wayBill = wayBill;
    }

    public String getSpSoNo() {
        return spSoNo;
    }

    public void setSpSoNo(String spSoNo) {
        this.spSoNo = spSoNo;
    }

    public Byte getTransType() {
        return transType;
    }

    public void setTransType(Byte transType) {
        this.transType = transType;
    }

    public Double getPackWeight() {
        return packWeight;
    }

    public void setPackWeight(Double packWeight) {
        this.packWeight = packWeight;
    }

    public Double getPackVolume() {
        return packVolume;
    }

    public void setPackVolume(Double packVolume) {
        this.packVolume = packVolume;
    }

    public Double getVolumeLong() {
        return volumeLong;
    }

    public void setVolumeLong(Double volumeLong) {
        this.volumeLong = volumeLong;
    }

    public Double getVolumeWidth() {
        return volumeWidth;
    }

    public void setVolumeWidth(Double volumeWidth) {
        this.volumeWidth = volumeWidth;
    }

    public Double getVolumeHeight() {
        return volumeHeight;
    }

    public void setVolumeHeight(Double volumeHeight) {
        this.volumeHeight = volumeHeight;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddr() {
        return senderAddr;
    }

    public void setSenderAddr(String senderAddr) {
        this.senderAddr = senderAddr;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderPostcode() {
        return senderPostcode;
    }

    public void setSenderPostcode(String senderPostcode) {
        this.senderPostcode = senderPostcode;
    }

    public Integer getPackCount() {
        return packCount;
    }

    public void setPackCount(Integer packCount) {
        this.packCount = packCount;
    }

    public Date getPackTime() {
        return packTime;
    }

    public void setPackTime(Date packTime) {
        this.packTime = packTime;
    }

    public String getPackUser() {
        return packUser;
    }

    public void setPackUser(String packUser) {
        this.packUser = packUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Double getReceivable() {
        return receivable;
    }

    public void setReceivable(Double receivable) {
        this.receivable = receivable;
    }

    public Double getGuaranteeValue() {
        return guaranteeValue;
    }

    public void setGuaranteeValue(Double guaranteeValue) {
        this.guaranteeValue = guaranteeValue;
    }

    public String getSalePlat() {
        return salePlat;
    }

    public void setSalePlat(String salePlat) {
        this.salePlat = salePlat;
    }

    public String getBdOwnerNo() {
        return bdOwnerNo;
    }

    public void setBdOwnerNo(String bdOwnerNo) {
        this.bdOwnerNo = bdOwnerNo;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getReceiveTel() {
        return receiveTel;
    }

    public void setReceiveTel(String receiveTel) {
        this.receiveTel = receiveTel;
    }

    public String getReceiveMobile() {
        return receiveMobile;
    }

    public void setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Byte getSoSource() {
        return soSource;
    }

    public void setSoSource(Byte soSource) {
        this.soSource = soSource;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSoMark() {
        return soMark;
    }

    public void setSoMark(String soMark) {
        this.soMark = soMark;
    }

    public String getThirdWayBill() {
        return thirdWayBill;
    }

    public void setThirdWayBill(String thirdWayBill) {
        this.thirdWayBill = thirdWayBill;
    }

    public Long getShipperId() {
        return shipperId;
    }

    public void setShipperId(Long shipperId) {
        this.shipperId = shipperId;
    }

    public String getShipperNo() {
        return shipperNo;
    }

    public void setShipperNo(String shipperNo) {
        this.shipperNo = shipperNo;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getGoodsMaterialNo() {
        return goodsMaterialNo;
    }

    public void setGoodsMaterialNo(String goodsMaterialNo) {
        this.goodsMaterialNo = goodsMaterialNo;
    }

    public String getMaterialOwnerType() {
        return materialOwnerType;
    }

    public void setMaterialOwnerType(String materialOwnerType) {
        this.materialOwnerType = materialOwnerType;
    }

    public List<SoPackItem> getSoPackItemList() {
        return soPackItemList;
    }

    public void setSoPackItemList(List<SoPackItem> soPackItemList) {
        this.soPackItemList = soPackItemList;
    }

    public String getGoodsMaterialName() {
        return goodsMaterialName;
    }

    public void setGoodsMaterialName(String goodsMaterialName) {
        this.goodsMaterialName = goodsMaterialName;
    }

    public String getMaterialPackageType() {
        return materialPackageType;
    }

    public void setMaterialPackageType(String materialPackageType) {
        this.materialPackageType = materialPackageType;
    }

    public List<GoodsMaterialParam> getGoodsMaterialParamList() {
        return goodsMaterialParamList;
    }

    public void setGoodsMaterialParamList(List<GoodsMaterialParam> goodsMaterialParamList) {
        this.goodsMaterialParamList = goodsMaterialParamList;
    }
}
