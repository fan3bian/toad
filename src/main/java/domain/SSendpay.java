package domain;



/**
 * 标准版sendpay
 */
public class SSendpay  {

	/**
	 * 是否签收短信回执 0:否 1：是
	 */
	private Byte signReceiptFlag;
	/**
	 * 是否派件短信回执 0:否 1：是
	 */
	private Byte deliveryReceiptFlag;

	//第3位:是否送货入仓
//	private Byte deliveryIntoWarehouse;
//	/**
//	 * 是否卸货 0:否 1：是
//	 */
//	private Byte unloadFlag;
	/**
	 * 运费结算方式：
	 * 1:货到付款
	 * 2：月结
	 * 3：现付
	 */
	private Byte fcFlag;

	/**
	 * 支付方式
	 */
	private Byte payType;

	/**
	 * 是否使用城市配送
	 * 0． 不需要此服务
	 1． 需要使用城配
	 9.  优先使用城配，可以使用快递
	 */
	private Byte deliveryType;

	/**
	 * 1：整车业务，
	 2：纯配快运零担，
	 3：仓配零担
	 4：冷链整车
	 5：冷链纯配零担，
	 */
	private Byte transProductType;

	/**
	 * //第3位:是否送货入仓
	 *是否送货入仓 0:否 1：是
	 */
	private Byte sendToWarehouse;
	/**
	 * 1.  仅装车 2.仅卸车 3.装+卸
	 */
	private Byte loadingType;

	/**
	 *签单返还
	 * 0-不返单，1-普通返单，2-校验身份返单
	 */
	private Byte signReturnType;

	/**
	 *6-控温 7-冷藏 8-冷冻 9-深冷
	 */
	private Byte coldChainType;
	/** 1：清真 2：易污染 3:清真+易污染**/
	private Byte goodsIsolateType;

	/**
	 * 京仓类型 1：京东自营仓 2：开放平台仓
	 */
	private Byte jdWareType;

	/**
	 * 是否tc 0：否 	1：是
	 */
	private Byte isTc;

	/**
	 * 京仓动作类型
	 * 1 送货入京仓
	 * 2 退供出京仓
	 */
	private Byte jdWareActionType;

	/**
	 * 是否入云仓
	 * 0 否
	 * 1 是
	 */
	private Byte tcToClps;


	public Byte getColdChainType() {
		return coldChainType;
	}

	public void setColdChainType(Byte coldChainType) {
		this.coldChainType = coldChainType;
	}

	public Byte getGoodsIsolateType() {
		return goodsIsolateType;
	}

	public void setGoodsIsolateType(Byte goodsIsolateType) {
		this.goodsIsolateType = goodsIsolateType;
	}

	public Byte getSignReturnType() {
		return signReturnType;
	}

	public void setSignReturnType(Byte signReturnType) {
		this.signReturnType = signReturnType;
	}

	public Byte getSignReceiptFlag() {
		return signReceiptFlag;
	}

	public void setSignReceiptFlag(Byte signReceiptFlag) {
		this.signReceiptFlag = signReceiptFlag;
	}

	public Byte getDeliveryReceiptFlag() {
		return deliveryReceiptFlag;
	}

	public void setDeliveryReceiptFlag(Byte deliveryReceiptFlag) {
		this.deliveryReceiptFlag = deliveryReceiptFlag;
	}

	public Byte getSendToWarehouse() {
		return sendToWarehouse;
	}

	public void setSendToWarehouse(Byte sendToWarehouse) {
		this.sendToWarehouse = sendToWarehouse;
	}

	public Byte getLoadingType() {
		return loadingType;
	}

	public void setLoadingType(Byte loadingType) {
		this.loadingType = loadingType;
	}

	public Byte getPayType() {
		return payType;
	}

	public void setPayType(Byte payType) {
		this.payType = payType;
	}

	public Byte getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(Byte deliveryType) {
		this.deliveryType = deliveryType;
	}

	public Byte getTransProductType() {
		return transProductType;
	}

	public void setTransProductType(Byte transProductType) {
		this.transProductType = transProductType;
	}

//	public Byte getDeliveryIntoWarehouse() {
//		return deliveryIntoWarehouse;
//	}
//
//	public void setDeliveryIntoWarehouse(Byte deliveryIntoWarehouse) {
//		this.deliveryIntoWarehouse = deliveryIntoWarehouse;
//	}

	public Byte getFcFlag() {
		return fcFlag;
	}

	public void setFcFlag(Byte fcFlag) {
		this.fcFlag = fcFlag;
	}

	public Byte getJdWareType() {
		return jdWareType;
	}

	public void setJdWareType(Byte jdWareType) {
		this.jdWareType = jdWareType;
	}

	public Byte getIsTc() {
		return isTc;
	}

	public void setIsTc(Byte isTc) {
		this.isTc = isTc;
	}

	public Byte getJdWareActionType() {
		return jdWareActionType;
	}

	public void setJdWareActionType(Byte jdWareActionType) {
		this.jdWareActionType = jdWareActionType;
	}

	public Byte getTcToClps() {
		return tcToClps;
	}

	public void setTcToClps(Byte tcToClps) {
		this.tcToClps = tcToClps;
	}
}