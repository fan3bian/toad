package ext.alibaba;

import com.alibaba.excel.EasyExcel;
import org.junit.Test;

import java.io.InputStream;

public class TestExcel {

    @Test
    public void readExcelTest() {
        InputStream resourceAsStream = TestExcel.class.getClassLoader().getResourceAsStream("itemDto.xlsx");
        EasyExcel.read(resourceAsStream, ItemVo.class, new ItemVoExcelListener()).sheet().doRead();
    }
}
