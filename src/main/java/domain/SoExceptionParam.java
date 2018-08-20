package domain;

import com.jd.clps.bbp.so.constant.SoIssuedErrorEnum;
import com.jd.clps.bbp.so.domain.SoTask;
import com.jd.clps.bbp.so.util.SoNoUtil;
import com.jd.clps.common.base.BaseEntity;

/**
 * saf对外接口入参
 * 订单暂停异常
 * User: douhuatong
 * Date: 14-8-6
 * Time: 下午2:41
 */
public class SoExceptionParam extends BaseEntity {

    /**
     * 异常ID
     */
    private Long id;

    /**
     * 订单主键
     */
    private Long soId;

    /**
     * 订单号
     */
    private String soNo;

    /**
     * 恢复任务ID
     */
    private String renewNo;

    /**
     * 异常类型
     */
    private SoIssuedErrorEnum errType;

    /**
     * 异常发生原因的额外描述
     */
    private String errReason;


    /**
     * 异常恢复原因
     */
    private String renewReason;

    /**
     * 操作人/操作系统
     */
    private String operateUser;

    /**
     * 订单异常需要worker修复
     */
    private SoTask soTask;

    /**
     * 订单异常状态（取消，无法生产，无法分拣，无法发货）
     * 该字段请采用<code>SoErrStatusUtil</code>解析
     * 异常状态1：0:是否取消，1:取消成功/失败
     * 异常状态2：2:是否有异常暂停，3:暂停处理/暂停恢复
     * 异常状态3：4:是否审核，5:审核通过/审核驳回
     */
    private String soErrStatus;

    public String getRenewNo() {
        return renewNo;
    }

    public void setRenewNo(String renewNo) {
        this.renewNo = renewNo;
    }

    public SoTask getSoTask() {
        return soTask;
    }

    public void setSoTask(SoTask soTask) {
        this.soTask = soTask;
    }

    public Long getSoId() {
        if (soId != null) {
            return soId;
        } else {
            if (soNo != null) {
                return SoNoUtil.reverseSoNo(soNo) == -1L ? null : SoNoUtil.reverseSoNo(soNo);
            } else {
                return null;
            }
        }
    }

    public void setSoId(Long soId) {
        this.soId = soId;
    }

    public String getSoNo() {
        if (soNo != null) {
            return soNo;
        } else {
            if (soId != null) {
                return SoNoUtil.generateSoNo(soId);
            } else {
                return null;
            }
        }
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public SoIssuedErrorEnum getErrType() {
        return errType;
    }

    public void setErrType(SoIssuedErrorEnum errType) {
        this.errType = errType;
    }

    public String getErrReason() {
        return errReason;
    }

    public void setErrReason(String errReason) {
        this.errReason = errReason;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRenewReason() {
        return renewReason;
    }

    public void setRenewReason(String renewReason) {
        this.renewReason = renewReason;
    }

    public String getSoErrStatus() {
        return soErrStatus;
    }

    public void setSoErrStatus(String soErrStatus) {
        this.soErrStatus = soErrStatus;
    }
}
