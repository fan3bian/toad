package domain;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Order {
    private String orderNo;
    @NotBlank(message = "not blk")
    private String bizNo;
    private Boolean subOrder;
    private boolean cod;
    @Size(max = 2,message = "明细列表不能超过2")
    @NotEmpty(message = "明细不能为空")
    @Valid
    private List<Item> itemList;
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
