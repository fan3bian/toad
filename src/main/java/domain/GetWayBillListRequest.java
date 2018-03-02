package domain;

public class GetWayBillListRequest {
	private Integer waybillType;
	private Integer waybillCount;
	private Integer providerCode;
	private String branchCode;
	private String settlementCode;
	private String vendorCode;
	private String vendorName;
	private String salePlatform;
	private String pin;
	private String appKey;
	public Integer getWaybillType() {
		return waybillType;
	}
	public void setWaybillType(Integer waybillType) {
		this.waybillType = waybillType;
	}
	public Integer getWaybillCount() {
		return waybillCount;
	}
	public void setWaybillCount(Integer waybillCount) {
		this.waybillCount = waybillCount;
	}
	public Integer getProviderCode() {
		return providerCode;
	}
	public void setProviderCode(Integer providerCode) {
		this.providerCode = providerCode;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getSettlementCode() {
		return settlementCode;
	}
	public void setSettlementCode(String settlementCode) {
		this.settlementCode = settlementCode;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getSalePlatform() {
		return salePlatform;
	}
	public void setSalePlatform(String salePlatform) {
		this.salePlatform = salePlatform;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	
}
