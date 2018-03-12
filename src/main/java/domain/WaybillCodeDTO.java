//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package domain;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class WaybillCodeDTO {
    private String uuid;
    @NotNull(
        message = "运单类型为空（1-普通运单）"
    )
    private Integer waybillType;
    @Range(
        min = 1L,
        max = 1000L,
        message = "运单数量超出范围（1-100）"
    )
    @NotNull(
        message = "运单数量为空"
    )
    private Integer waybillCount;
    private Integer providerId;
    @Length(
        max = 2,
        message = "承运商编码长度超过32位"
    )
    private String providerCode;
    @Length(
        max = 32,
        message = "网点编码长度超过32位"
    )
    private String branchCode;
    @Length(
        max = 32,
        message = "网点编码长度超过32位"
    )
    private String settlementCode;
    @Length(
        max = 32,
        message = "商家编码长度超过32位"
    )
    @NotBlank(
        message = "商家编码为空"
    )
    private String vendorCode;
    @Length(
        max = 50,
        message = "商家名称长度超过50位"
    )
    @NotBlank(
        message = "商家名称为空"
    )
    private String vendorName;
    @Length(
        min = 7,
        max = 7,
        message = "销售平台不合法"
    )
    @NotBlank(
        message = "销售平台为空"
    )
    private String salePlatform;
    private String pin;
    private String appKey;
    private String source;

    public WaybillCodeDTO() {
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getWaybillType() {
        return this.waybillType;
    }

    public void setWaybillType(Integer waybillType) {
        this.waybillType = waybillType;
    }

    public Integer getWaybillCount() {
        return this.waybillCount;
    }

    public void setWaybillCount(Integer waybillCount) {
        this.waybillCount = waybillCount;
    }

    public Integer getProviderId() {
        return this.providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProviderCode() {
        return this.providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getBranchCode() {
        return this.branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getSettlementCode() {
        return this.settlementCode;
    }

    public void setSettlementCode(String settlementCode) {
        this.settlementCode = settlementCode;
    }

    public String getVendorCode() {
        return this.vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getSalePlatform() {
        return this.salePlatform;
    }

    public void setSalePlatform(String salePlatform) {
        this.salePlatform = salePlatform;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    public static void main(String[] args) {
    	WaybillCodeDTO way =  new WaybillCodeDTO();
    	way.setProviderId(2223);
    	way.setWaybillType(null);
    	System.out.println(way);
	}
}
