package domain.test;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 发货数据回传-订单明细
 * User: douhuatong
 * Date: 14-8-18
 * Time: 下午6:02
 */
@XStreamAlias("OutBound")
public class OutBound implements Serializable {
    /** 订单号 */
    private String outboundNo;
    /** 订单类型 */
    private String outboundType;
    /** 订单商品明细 */

    @XStreamAlias("skuList")
    private List<OutBoundSku> skuList = new ArrayList<OutBoundSku>();

    public String getOutboundNo() {
        return outboundNo;
    }

    public void setOutboundNo(String outboundNo) {
        this.outboundNo = outboundNo;
    }

    public String getOutboundType() {
        return outboundType;
    }

    public void setOutboundType(String outboundType) {
        this.outboundType = outboundType;
    }

    public List<OutBoundSku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<OutBoundSku> skuList) {
        this.skuList = skuList;
    }
}
