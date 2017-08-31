package com.hsd.entity.fundstatement;

import java.io.Serializable;
import java.util.Date;

public class ContractPay implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer fieldid;

    private Integer contractid;

    private String contractname;

    private Integer contractmcday;

    private Date contractmcdate;

    private Date realitymcdate;

    private Long realitymc;

    private Long subtract;

    private Long agencyfund;

    private Integer subtractcount;

    private Integer overduecount;

    private Integer status;

    private String remark;

    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public String getContractname() {
        return contractname;
    }

    public void setContractname(String contractname) {
        this.contractname = contractname == null ? null : contractname.trim();
    }

    public Integer getContractmcday() {
        return contractmcday;
    }

    public void setContractmcday(Integer contractmcday) {
        this.contractmcday = contractmcday;
    }

    public Date getContractmcdate() {
        return contractmcdate;
    }

    public void setContractmcdate(Date contractmcdate) {
        this.contractmcdate = contractmcdate;
    }

    public Date getRealitymcdate() {
        return realitymcdate;
    }

    public void setRealitymcdate(Date realitymcdate) {
        this.realitymcdate = realitymcdate;
    }

    public Long getRealitymc() {
        return realitymc;
    }

    public void setRealitymc(Long realitymc) {
        this.realitymc = realitymc;
    }

    public Long getSubtract() {
        return subtract;
    }

    public void setSubtract(Long subtract) {
        this.subtract = subtract;
    }

    public Long getAgencyfund() {
        return agencyfund;
    }

    public void setAgencyfund(Long agencyfund) {
        this.agencyfund = agencyfund;
    }

    public Integer getSubtractcount() {
        return subtractcount;
    }

    public void setSubtractcount(Integer subtractcount) {
        this.subtractcount = subtractcount;
    }

    public Integer getOverduecount() {
        return overduecount;
    }

    public void setOverduecount(Integer overduecount) {
        this.overduecount = overduecount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}