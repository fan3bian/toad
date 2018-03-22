package domain;

import com.google.gson.annotations.Expose;

/**
 * 使用场景：承运执行系统京配转三方，帮助青龙计算三方应付
 * 对接青龙-财务系统
 *
 * Created by zhangshuyi1 on 2018/3/8.
 */
public class BdFinanceDTO {
    private transient String soNo;
    /**
     * 青龙运单号
     */
    private String waybillCode;
    /**
     * 分拣中心ID
     */
    private Long sortingCenterId;
    /**
     * 目的站点ID
     */
    private Long targetSiteId;
    /**
     * 发货时间
     */
    private String deliveryTime;
    /**
     * 三方承运商ID
     */
    private Long carrierId;
    /**
     * 批次号
     * 分拣中心ID-目的站点-年4位月2位日2位+7位流水
     */
    private String sortBatchNo;

    public String getWaybillCode() {
        return waybillCode;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

    public Long getSortingCenterId() {
        return sortingCenterId;
    }

    public void setSortingCenterId(Long sortingCenterId) {
        this.sortingCenterId = sortingCenterId;
    }

    public Long getTargetSiteId() {
        return targetSiteId;
    }

    public void setTargetSiteId(Long targetSiteId) {
        this.targetSiteId = targetSiteId;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Long getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public String getSortBatchNo() {
        return sortBatchNo;
    }

    public void setSortBatchNo(String sortBatchNo) {
        this.sortBatchNo = sortBatchNo;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }
}
