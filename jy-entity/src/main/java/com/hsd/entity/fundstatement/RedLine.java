package com.hsd.entity.fundstatement;

import java.io.Serializable;

public class RedLine implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String redlineid;

    private Long expensesreimbursementredline;

    private Long borrowredline;

    private Long applyredline;

    private String userId;
//    private String foundperson;

    private Integer fieldid;

    private String createdate;

    private String remark;

    private Integer flag;
    
    private Long predictIncome;
    
    private Long subscribeRedLine;
    
    

    public Long getSubscribeRedLine() {
		return subscribeRedLine;
	}

	public void setSubscribeRedLine(Long subscribeRedLine) {
		this.subscribeRedLine = subscribeRedLine;
	}

	public Long getPredictIncome() {
		return predictIncome;
	}

	public void setPredictIncome(Long predictIncome) {
		this.predictIncome = predictIncome;
	}

	public String getRedlineid() {
        return redlineid;
    }

    public void setRedlineid(String redlineid) {
        this.redlineid = redlineid;
    }

    public Long getExpensesreimbursementredline() {
        return expensesreimbursementredline;
    }

    public void setExpensesreimbursementredline(Long expensesreimbursementredline) {
        this.expensesreimbursementredline = expensesreimbursementredline;
    }

    public Long getBorrowredline() {
        return borrowredline;
    }

    public void setBorrowredline(Long borrowredline) {
        this.borrowredline = borrowredline;
    }

    public Long getApplyredline() {
        return applyredline;
    }

    public void setApplyredline(Long applyredline) {
        this.applyredline = applyredline;
    }

   

    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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