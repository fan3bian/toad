package domain.test;

import java.io.Serializable;

/**
 * Created by jinbeibei on 2018/5/21.
 */
public class GoodsMaterial implements Serializable{

    /**耗材编码**/
    private String goodsMaterialNo;
    /**耗材名称**/
    private String goodsMaterialName;
    /**耗材使用数量**/
    private Integer materialCount;

    public String getGoodsMaterialNo() {
        return goodsMaterialNo;
    }

    public void setGoodsMaterialNo(String goodsMaterialNo) {
        this.goodsMaterialNo = goodsMaterialNo;
    }

    public String getGoodsMaterialName() {
        return goodsMaterialName;
    }

    public void setGoodsMaterialName(String goodsMaterialName) {
        this.goodsMaterialName = goodsMaterialName;
    }

    public Integer getMaterialCount() {
        return materialCount;
    }

    public void setMaterialCount(Integer materialCount) {
        this.materialCount = materialCount;
    }
}
