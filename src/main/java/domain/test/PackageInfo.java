package domain.test;

import java.io.Serializable;
import java.math.BigDecimal;

public class PackageInfo implements Serializable {
    /**
     * 预估重量
     */
    private BigDecimal grossWeight;
    /**
     * 预估体积
     */
    private BigDecimal grossVolume;

    private Integer packageCount;

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getGrossVolume() {
        return grossVolume;
    }

    public void setGrossVolume(BigDecimal grossVolume) {
        this.grossVolume = grossVolume;
    }

    public Integer getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }
}
