package domain;

public class Order {
    private String orderNo;
    private String bizNo;
    private Boolean subOrder;
    private boolean cod;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Boolean getSubOrder() {
        return subOrder;
    }

    public void setSubOrder(Boolean subOrder) {
        this.subOrder = subOrder;
    }

    public boolean isCod() {
        return cod;
    }

    public void setCod(boolean cod) {
        this.cod = cod;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }
}
