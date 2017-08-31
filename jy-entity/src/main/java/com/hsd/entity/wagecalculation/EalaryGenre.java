package com.hsd.entity.wagecalculation;

import java.io.Serializable;
import java.util.Date;

public class EalaryGenre implements Serializable{
    private String id;

    private Integer fieldid;

    private Integer userid;

    private String salarygenrename;

    private Integer percentage;

    private Date createdate;

    private String remark;

    private Integer flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSalarygenrename() {
        return salarygenrename;
    }

    public void setSalarygenrename(String salarygenrename) {
        this.salarygenrename = salarygenrename == null ? null : salarygenrename.trim();
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
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