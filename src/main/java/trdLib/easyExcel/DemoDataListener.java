package trdLib.easyExcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.JsonUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
public class DemoDataListener extends AnalysisEventListener<DemoRow> {
    private static final Logger LOGGER = LogManager.getLogger(DemoDataListener.class);

    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;
    List<DemoRow> list = new ArrayList<DemoRow>();

    @Override
    public void invoke(DemoRow data, AnalysisContext context) {
//        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(data));
        list.add(data);
//        if (list.size() >= BATCH_COUNT) {
//            saveData();
//            list.clear();
//        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> warehouseMap = new HashMap<>();
        Map<String, String> deptMap = new HashMap<>();
//        System.out.println(JsonUtil.toJson(list));
        //save the dept_warehouse mapping
        for (DemoRow demoRow : list) {
            map.put(demoRow.getColumn1(), demoRow.getColumn2());
            deptMap.put(demoRow.getColumn3(), demoRow.getColumn4());
            warehouseMap.put(demoRow.getColumn5(), demoRow.getColumn6());
        }
        for (DemoRow demoRow : list) {
//            System.out.println("商家："+demoRow.getColumn1());
            String deptNos = deptMap.get(demoRow.getColumn1());
//            System.out.println(deptNos);
            if (StringUtils.isNotBlank(deptNos)) {
                String[] split = deptNos.split(",");
                String warehouseNo = warehouseMap.get(demoRow.getColumn2());
                for (String s : split) {
                    System.out.println(s + "_" + warehouseNo);
                }
            }
        }


//        saveData();
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
//        LOGGER.info("存储数据库成功！");

    }
}