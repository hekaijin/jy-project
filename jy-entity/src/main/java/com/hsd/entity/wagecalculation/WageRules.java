package com.hsd.entity.wagecalculation;

import java.io.Serializable;
import java.util.Date;

public class WageRules implements Serializable {
    private String id;

    private String rulesname;

    private Boolean rulesgenre;

    private Integer userid;

    private Integer workdays;

    private Date createdate;

    private String flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRulesname() {
        return rulesname;
    }

    public void setRulesname(String rulesname) {
        this.rulesname = rulesname == null ? null : rulesname.trim();
    }

    public Boolean getRulesgenre() {
        return rulesgenre;
    }

    public void setRulesgenre(Boolean rulesgenre) {
        this.rulesgenre = rulesgenre;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getWorkdays() {
        return workdays;
    }

    public void setWorkdays(Integer workdays) {
        this.workdays = workdays;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}