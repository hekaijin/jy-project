package com.hsd.entity.fundstatement;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Borrow implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer borrowid;

    private Integer userid;

    private String reason;

    private BigDecimal amount;

    private String photopath;

    private Integer checkstatus;

    private Integer paystatus;

    private String takeusername;

    private Integer takeuser;

    private Integer takefield;

    private String createtime;

    private Boolean deleted;

    private Integer processid;

    private String seqno;

    private Date paytime;

    private String payuser;

    private Integer printcount;

    public Integer getBorrowid() {
        return borrowid;
    }

    public void setBorrowid(Integer borrowid) {
        this.borrowid = borrowid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath == null ? null : photopath.trim();
    }

    public Integer getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(Integer checkstatus) {
        this.checkstatus = checkstatus;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public String getTakeusername() {
        return takeusername;
    }

    public void setTakeusername(String takeusername) {
        this.takeusername = takeusername == null ? null : takeusername.trim();
    }

    public Integer getTakeuser() {
        return takeuser;
    }

    public void setTakeuser(Integer takeuser) {
        this.takeuser = takeuser;
    }

    public Integer getTakefield() {
        return takefield;
    }

    public void setTakefield(Integer takefield) {
        this.takefield = takefield;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getProcessid() {
        return processid;
    }

    public void setProcessid(Integer processid) {
        this.processid = processid;
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getPayuser() {
        return payuser;
    }

    public void setPayuser(String payuser) {
        this.payuser = payuser == null ? null : payuser.trim();
    }

    public Integer getPrintcount() {
        return printcount;
    }

    public void setPrintcount(Integer printcount) {
        this.printcount = printcount;
    }
}