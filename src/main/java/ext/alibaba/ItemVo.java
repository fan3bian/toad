package ext.alibaba;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemVo {

    @ExcelProperty("行号")
    private String lineNo;

    @ExcelProperty("商家商品编码")
    private String spGoodsNo;

    @ExcelProperty("商品数量(主单位)")
    private BigDecimal applyMainQty;

    @ExcelProperty("价格(主单位含税价)")
    private BigDecimal taxInMainUnitPrice;

    @ExcelProperty("备注")
    private String remark;
}
