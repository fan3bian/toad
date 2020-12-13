package ext.alibaba;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemVo {

    @ExcelProperty(index = 0)
    private String lineNo;

    @ExcelProperty(index = 1)
    private String ownerGoodsNo;

    @ExcelProperty(index = 2)
    private BigDecimal applyMainQty;

    @ExcelProperty(index = 3)
    private String remark;
}
