package com.hsd.entity.fundstatement;

import java.io.Serializable;
import java.util.Date;

public class RedLineUpdateRecord implements Serializable{
    private String id;

    private String redlineid;

    private Long expensesreimbursementredline;

    private Long subscriberedline;

    private Long predictincome;

    private Integer userid;

    private Integer fieldid;

    private String createdate;

    private String remark;

    private Integer flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRedlineid() {
        return redlineid;
    }

    public void setRedlineid(String redlineid) {
        this.redlineid = redlineid == null ? null : redlineid.trim();
    }

    public Long getExpensesreimbursementredline() {
        return expensesreimbursementredline;
    }

    public void setExpensesreimbursementredline(Long expensesreimbursementredline) {
        this.expensesreimbursementredline = expensesreimbursementredline;
    }

    public Long getSubscriberedline() {
        return subscriberedline;
    }

    public void setSubscriberedline(Long subscriberedline) {
        this.subscriberedline = subscriberedline;
    }

    public Long getPredictincome() {
        return predictincome;
    }

    public void setPredictincome(Long predictincome) {
        this.predictincome = predictincome;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}