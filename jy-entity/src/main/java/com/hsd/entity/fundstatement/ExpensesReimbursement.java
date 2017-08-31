package com.hsd.entity.fundstatement;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ExpensesReimbursement  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer userid;

    private Date createdate;

    private Integer status;

    private Integer fieldid;

    private BigDecimal amount;

    private Integer processid;

    private Integer paystatus;

    private String photo;

    private String field;

    private String receiver;

    private String seqno;

    private Boolean isurgent;

    private Boolean deleted;

    private Integer quantity;

    private Date paytime;

    private String payuser;

    private Integer receiptstatus;

    private Integer printcount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getProcessid() {
        return processid;
    }

    public void setProcessid(Integer processid) {
        this.processid = processid;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public Boolean getIsurgent() {
        return isurgent;
    }

    public void setIsurgent(Boolean isurgent) {
        this.isurgent = isurgent;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    public Integer getReceiptstatus() {
        return receiptstatus;
    }

    public void setReceiptstatus(Integer receiptstatus) {
        this.receiptstatus = receiptstatus;
    }

    public Integer getPrintcount() {
        return printcount;
    }

    public void setPrintcount(Integer printcount) {
        this.printcount = printcount;
    }
}