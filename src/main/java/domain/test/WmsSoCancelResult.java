package domain.test;

import java.io.Serializable;

/**
 * wms订单取消结果回传消息
 * User: douhuatong
 * Date: 14-8-21
 * Time: 下午2:26
 */
public class WmsSoCancelResult implements Serializable {
    /** -1没找到记录、0不能取消、1有记录并且能取消 */
    private Integer isCancellable;
    /** 描述 ： 0是复核前，1是复核后 */
    private String memo;
    /** 订单编号 */
    private String reStockRequestNo;

    public Integer getCancellable() {
        return isCancellable;
    }

    public void setCancellable(Integer cancellable) {
        isCancellable = cancellable;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getReStockRequestNo() {
        return reStockRequestNo;
    }

    public void setReStockRequestNo(String reStockRequestNo) {
        this.reStockRequestNo = reStockRequestNo;
    }
}
