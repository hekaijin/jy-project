package com.hsd.entity.wagecalculation;

import java.io.Serializable;
import java.util.Date;

public class EmployeeSalary implements Serializable {
    private String id;

    private Integer fieldid;

    private Integer userid;

    private Long monthtotalsalary;

    private Long basesalary;

    private Long performancesalary;

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

    public Long getMonthtotalsalary() {
        return monthtotalsalary;
    }

    public void setMonthtotalsalary(Long monthtotalsalary) {
        this.monthtotalsalary = monthtotalsalary;
    }

    public Long getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(Long basesalary) {
        this.basesalary = basesalary;
    }

    public Long getPerformancesalary() {
        return performancesalary;
    }

    public void setPerformancesalary(Long performancesalary) {
        this.performancesalary = performancesalary;
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