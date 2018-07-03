package domain;

import util.DateUtil;
import util.JsonUtil;

import java.util.Date;

/**
 * Created by zhangshuyi1 on 2018/6/30.
 */
public class ColdBoxDto {

    private String boxNo;
    private String distributionNo;
    private String erpWarehouseNo;
    private String orgNo;
    private String warehouseNo;
    private String warehouseName;
    private String operator;
    private String operateTime;
    private Date systemTime;
    private String source;

    public String getBoxNo() {
        return boxNo;
    }

    public void setBoxNo(String boxNo) {
        this.boxNo = boxNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDistributionNo() {
        return distributionNo;
    }

    public void setDistributionNo(String distributionNo) {
        this.distributionNo = distributionNo;
    }

    public String getErpWarehouseNo() {
        return erpWarehouseNo;
    }

    public void setErpWarehouseNo(String erpWarehouseNo) {
        this.erpWarehouseNo = erpWarehouseNo;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public Date getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(Date systemTime) {
        this.systemTime = systemTime;
    }

    public static void main(String[] args) throws Exception {
//        String str = "{\n" +
//                "  \"source\": \"SWMS\",\n" +
//                "  \"boxNo\": \"BOX0001\",\n" +
//                "  \"operator \": \"张三\",\n" +
//                "  \"name\":\"zhangshuyi\",\n" +
//                "  \"operateTime\": \"2018-06-07 11:32:52\"\n" +
//                "}     ";
//      ColdBoxDto coldBoxDto = JsonUtil.fromJson(str, ColdBoxDto.class);
        ColdBoxDto coldBoxDto = new ColdBoxDto();
        coldBoxDto.setBoxNo("Box00001");
        coldBoxDto.setDistributionNo("001");
        coldBoxDto.setOperateTime(DateUtil.getSystem_Date());
        coldBoxDto.setSystemTime(new Date());
        System.out.println(JsonUtil.toJson(coldBoxDto));

    }
}
