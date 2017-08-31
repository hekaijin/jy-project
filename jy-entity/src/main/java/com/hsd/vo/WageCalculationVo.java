package com.hsd.vo;

import java.io.Serializable;
import java.util.Date;

public class WageCalculationVo implements Serializable{

    private String id;

    private Integer userid;

    private Integer fieldid;

    private String wagerulesid;

    private Integer shouldworkdays;

    private Integer realityworkdays;

    private Long basepay;

    private Long performancepay;

    private Long otherwelfare;

    private String integral;

    private Date createdate;

    private Integer flag;


    private String code;
    private String name;
    private String fieldname;
    private String rulesname;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public String getRulesname() {
        return rulesname;
    }

    public void setRulesname(String rulesname) {
        this.rulesname = rulesname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getWagerulesid() {
        return wagerulesid;
    }

    public void setWagerulesid(String wagerulesid) {
        this.wagerulesid = wagerulesid == null ? null : wagerulesid.trim();
    }

    public Integer getShouldworkdays() {
        return shouldworkdays;
    }

    public void setShouldworkdays(Integer shouldworkdays) {
        this.shouldworkdays = shouldworkdays;
    }

    public Integer getRealityworkdays() {
        return realityworkdays;
    }

    public void setRealityworkdays(Integer realityworkdays) {
        this.realityworkdays = realityworkdays;
    }

    public Long getBasepay() {
        return basepay;
    }

    public void setBasepay(Long basepay) {
        this.basepay = basepay;
    }

    public Long getPerformancepay() {
        return performancepay;
    }

    public void setPerformancepay(Long performancepay) {
        this.performancepay = performancepay;
    }

    public Long getOtherwelfare() {
        return otherwelfare;
    }

    public void setOtherwelfare(Long otherwelfare) {
        this.otherwelfare = otherwelfare;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral == null ? null : integral.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

}
