package trdLib.easyExcel;

import com.alibaba.excel.EasyExcel;
import org.junit.Test;
import trdLib.ExcelAnalysisUtils;
import util.JsonUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class TestExcel {
    @Test
    public void test (){
        EasyExcel.read("C:\\Users\\zhangshuyi1\\Desktop\\balance\\xibei.xlsx", DemoRow.class, new DemoDataListener()).sheet().doRead();

    }
    @Test
    public void testPoi() throws IOException {
        List<List<String>> lists = ExcelAnalysisUtils.analysisExcel(new FileInputStream("C:\\Users\\zhangshuyi1\\Desktop\\balance\\seller.xlsx"));
        System.out.println(JsonUtil.toJson(lists));

    }
}
