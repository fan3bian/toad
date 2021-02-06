package ext.alibaba;

import com.alibaba.excel.EasyExcel;
import org.junit.Test;

import java.io.InputStream;

public class TestExcel {

    @Test
    public void readExcelTest() {
        String fileName = "itemDto.xlsx";
        fileName = "b.xlsx";
        InputStream resourceAsStream = TestExcel.class.getClassLoader().getResourceAsStream(fileName);
        EasyExcel.read(resourceAsStream, ItemVo.class, new ItemVoExcelListener()).sheet().doRead();
    }
}
