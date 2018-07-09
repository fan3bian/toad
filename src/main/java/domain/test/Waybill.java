package domain.test;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: douhuatong
 * Date: 14-8-18
 * Time: 下午6:02
 */
public class Waybill implements Serializable {

    private static final long serialVersionUID = 1L;
    /** 订单号 */
    private String outboundNo;
    /** 包裹号 */
    private String packageNo;
    /** 运单号 */
    private String waybillNo;
    /** 包裹序列 */
    private String packageSequence;
    /** 站点编号 */
    private String siteNo;
    /** 包裹重量 */
    private String packageWeight;
    /** 包裹体积 */
    private String packageVolume;
    /** 打包时间 */
    private String packageTime;
    /** 打包人 */
    private String packageUser;


    /**
     * 对接京东快递（青龙）扩展字段
     */

    /** 销售平台 */
    private String salePlat;

    /** 商家ID */
    private String customerId;
    /** 商家名称 */
    private String customerName;

    /** 寄件人 */
    private String senderName;
    /** 寄件人地址 */
    private String senderAddress;
    /** 寄件人电话 */
    private String senderTel;
    /** 寄件人手机 */
    private String senderMobile;
    /** 寄件人邮编 */
    private String senderPostcode;
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
    /** 取件方式，1-上门收货、2-自送。不填或者超出范围，默认是1 */
    private String pickMethod;

    /** 包裹数量 */
    private String packageCount;
    /** 长 */
    private String vloumLong;
    /** 宽 */
    private String vloumWidth;
    /** 高 */
    private String vloumHeight;
    /** 是否客户打印运单，1-是、2-否，默认为1 */
    private String selfPrintWayBill;
    /** 物品描述 */
    private String description;

    /** 是否代收货款，1-是，0-否。不填或者超出范围，默认是0 */
    private String collectionValue;
    /** 代收贷款金额 */
    private String collectionMoney;
    /** 是否保价，0-否、1-是，默认为0 */
    private String guaranteeValue;
    /** 保价金额 */
    private String guaranteeValueAmount;
    /** 签单返还，1-是，0-否。不填或者超出范围，默认是0 */
    private String signReturn;
    /** 时效(1-普通，2-工作日，3-非工作日，4-晚间。不填或者超出范围，默认是1) */
    private String aging;
    /** 业务类型，1-陆运、2-航空，默认为1 */
    private String transType;
    /** 包装，1-不需包装、2-简单包装、3-特殊包装，默认为1 */
    private String packageRequired;
    /** 备注 */
    private String remark;

    /**2017-03-26 新增耗材所需信息兼容老报文**/
    /**耗材编码**/
    private String goodsMaterialNo;
    /**耗材名称**/
    private String goodsMaterialName;
    /**耗材货主类型**/
    private String materialOwnerType;
    /**耗材包装类型**/
    private String materialOBusinessType;

    /**2017-03-26 新增耗材所需信息**/
    private List<GoodsMaterial> goodsMaterialList;


    @XStreamAlias("WaybillDetailList")
    private List<WaybillDetail> waybillDetailList = new ArrayList<WaybillDetail>();

    /**
     * 4PL运单号
     */
    private String fourPLMailNo;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOutboundNo() {
        return outboundNo;
    }

    public void setOutboundNo(String outboundNo) {
        this.outboundNo = outboundNo;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public String getPackageSequence() {
        return packageSequence;
    }

    public void setPackageSequence(String packageSequence) {
        this.packageSequence = packageSequence;
    }

    public String getSiteNo() {
        return siteNo;
    }

    public void setSiteNo(String siteNo) {
        this.siteNo = siteNo;
    }

    public String getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(String packageWeight) {
        this.packageWeight = packageWeight;
    }

    public String getPackageVolume() {
        return packageVolume;
    }

    public void setPackageVolume(String packageVolume) {
        this.packageVolume = packageVolume;
    }

    public String getPackageTime() {
        return packageTime;
    }

    public void setPackageTime(String packageTime) {
        this.packageTime = packageTime;
    }

    public String getPackageUser() {
        return packageUser;
    }

    public void setPackageUser(String packageUser) {
        this.packageUser = packageUser;
    }

    public String getSalePlat() {
        return salePlat;
    }

    public void setSalePlat(String salePlat) {
        this.salePlat = salePlat;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderTel() {
        return senderTel;
    }

    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    public String getSenderPostcode() {
        return senderPostcode;
    }

    public void setSenderPostcode(String senderPostcode) {
        this.senderPostcode = senderPostcode;
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

    public String getPickMethod() {
        return pickMethod;
    }

    public void setPickMethod(String pickMethod) {
        this.pickMethod = pickMethod;
    }

    public String getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(String packageCount) {
        this.packageCount = packageCount;
    }

    public String getVloumLong() {
        return vloumLong;
    }

    public void setVloumLong(String vloumLong) {
        this.vloumLong = vloumLong;
    }

    public String getVloumWidth() {
        return vloumWidth;
    }

    public void setVloumWidth(String vloumWidth) {
        this.vloumWidth = vloumWidth;
    }

    public String getVloumHeight() {
        return vloumHeight;
    }

    public void setVloumHeight(String vloumHeight) {
        this.vloumHeight = vloumHeight;
    }

    public String getSelfPrintWayBill() {
        return selfPrintWayBill;
    }

    public void setSelfPrintWayBill(String selfPrintWayBill) {
        this.selfPrintWayBill = selfPrintWayBill;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCollectionValue() {
        return collectionValue;
    }

    public void setCollectionValue(String collectionValue) {
        this.collectionValue = collectionValue;
    }

    public String getCollectionMoney() {
        return collectionMoney;
    }

    public void setCollectionMoney(String collectionMoney) {
        this.collectionMoney = collectionMoney;
    }

    public String getGuaranteeValue() {
        return guaranteeValue;
    }

    public void setGuaranteeValue(String guaranteeValue) {
        this.guaranteeValue = guaranteeValue;
    }

    public String getGuaranteeValueAmount() {
        return guaranteeValueAmount;
    }

    public void setGuaranteeValueAmount(String guaranteeValueAmount) {
        this.guaranteeValueAmount = guaranteeValueAmount;
    }

    public String getSignReturn() {
        return signReturn;
    }

    public void setSignReturn(String signReturn) {
        this.signReturn = signReturn;
    }

    public String getAging() {
        return aging;
    }

    public void setAging(String aging) {
        this.aging = aging;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getPackageRequired() {
        return packageRequired;
    }

    public void setPackageRequired(String packageRequired) {
        this.packageRequired = packageRequired;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<GoodsMaterial> getGoodsMaterialList() {
        return goodsMaterialList;
    }

    public void setGoodsMaterialList(List<GoodsMaterial> goodsMaterialList) {
        this.goodsMaterialList = goodsMaterialList;
    }

    public String getGoodsMaterialNo() {
        return goodsMaterialNo;
    }

    public void setGoodsMaterialNo(String goodsMaterialNo) {
        this.goodsMaterialNo = goodsMaterialNo;
    }

    public String getGoodsMaterialName() {
        return goodsMaterialName;
    }

    public void setGoodsMaterialName(String goodsMaterialName) {
        this.goodsMaterialName = goodsMaterialName;
    }

    public String getMaterialOwnerType() {
        return materialOwnerType;
    }

    public void setMaterialOwnerType(String materialOwnerType) {
        this.materialOwnerType = materialOwnerType;
    }

    public String getMaterialOBusinessType() {
        return materialOBusinessType;
    }

    public void setMaterialOBusinessType(String materialOBusinessType) {
        this.materialOBusinessType = materialOBusinessType;
    }

    public List<WaybillDetail> getWaybillDetailList() {
        return waybillDetailList;
    }

    public void setWaybillDetailList(List<WaybillDetail> waybillDetailList) {
        this.waybillDetailList = waybillDetailList;
    }


    public String getFourPLMailNo() {
        return fourPLMailNo;
    }

    public void setFourPLMailNo(String fourPLMailNo) {
        this.fourPLMailNo = fourPLMailNo;
    }
}
