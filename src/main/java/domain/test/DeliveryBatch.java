package domain.test;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * wms回传的发货数据报文
 * User: douhuatong
 * Date: 14-8-18
 * Time: 下午3:52
 */
@XStreamAlias("DeliveryBatch")
public class DeliveryBatch implements Serializable {
    private static final long serialVersionUID = 1L;
    /** 批次号 */
    private String batchNo;
    /** 0 表示不是重打包，1表示是重打包 */
    private String againPack;
    /** 机构号 */
    private String orgNo;
    /** 配送中心编号 */
    private String distributeNo;
    /** 库房编号 */
    private String warehouseNo;
    /** 发货时间 */
    private String deliveryTime;
    /** 发货人编号 */
    private String deliveryUserNo;
    /** 发货人姓名 */
    private String deliveryUserName;
    /** 承运商编码 */
    private String carrierNo;
    /** 发货订单包裹明细 */
    private List<Waybill> deliveryList = new ArrayList<Waybill>();
    /** 发货订单明细 */
    private List<OutBound> outBoundList = new ArrayList<OutBound>();


    /**2017-03-26 新增耗材所需信息**/
    /**区别该仓是否耗材管理,0否1是**/
    private String warehouseBusinessType;
    /**订单号**/
    private String soNo;
    /**订单总重量**/
    private String soWeight;
    /**订单总体积**/
    private String soVolume;

    //clps库房编号
    String clpsWarehouseNo;

    //系统来源
    String source;
    //发货操作人
    private String operator;
    //保温箱
    private List<String> boxList;
    public String getAgainPack() {
        return againPack;
    }

    public void setAgainPack(String againPack) {
        this.againPack = againPack;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getDistributeNo() {
        return distributeNo;
    }

    public void setDistributeNo(String distributeNo) {
        this.distributeNo = distributeNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryUserNo() {
        return deliveryUserNo;
    }

    public void setDeliveryUserNo(String deliveryUserNo) {
        this.deliveryUserNo = deliveryUserNo;
    }

    public String getDeliveryUserName() {
        return deliveryUserName;
    }

    public void setDeliveryUserName(String deliveryUserName) {
        this.deliveryUserName = deliveryUserName;
    }

    public List<Waybill> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Waybill> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public List<OutBound> getOutBoundList() {
        return outBoundList;
    }

    public void setOutBoundList(List<OutBound> outBoundList) {
        this.outBoundList = outBoundList;
    }

    public String getCarrierNo() {
        return carrierNo;
    }

    public void setCarrierNo(String carrierNo) {
        this.carrierNo = carrierNo;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public String getSoWeight() {
        return soWeight;
    }

    public void setSoWeight(String soWeight) {
        this.soWeight = soWeight;
    }

    public String getSoVolume() {
        return soVolume;
    }

    public void setSoVolume(String soVolume) {
        this.soVolume = soVolume;
    }

    public String getWarehouseBusinessType() {
        return warehouseBusinessType;
    }

    public void setWarehouseBusinessType(String warehouseBusinessType) {
        this.warehouseBusinessType = warehouseBusinessType;
    }

    public String getClpsWarehouseNo() {
        return clpsWarehouseNo;
    }

    public void setClpsWarehouseNo(String clpsWarehouseNo) {
        this.clpsWarehouseNo = clpsWarehouseNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<String> getBoxList() {
        return boxList;
    }

    public void setBoxList(List<String> boxList) {
        this.boxList = boxList;
    }
}
