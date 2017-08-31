package com.hsd.entity.fundstatement;

import java.io.Serializable;

public class Field  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer fieldid;

    private String name;

    private Integer order;

    private Boolean deleted;

    private Integer mangerid;

    private Integer directorid;

    private Integer id2;

    private Double purchasebudget;

    private Integer fieldtypeid;

    private String address;

    private String contact;

    private String phone;

    private Integer patrolinterval;

    public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getMangerid() {
        return mangerid;
    }

    public void setMangerid(Integer mangerid) {
        this.mangerid = mangerid;
    }

    public Integer getDirectorid() {
        return directorid;
    }

    public void setDirectorid(Integer directorid) {
        this.directorid = directorid;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public Double getPurchasebudget() {
        return purchasebudget;
    }

    public void setPurchasebudget(Double purchasebudget) {
        this.purchasebudget = purchasebudget;
    }

    public Integer getFieldtypeid() {
        return fieldtypeid;
    }

    public void setFieldtypeid(Integer fieldtypeid) {
        this.fieldtypeid = fieldtypeid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getPatrolinterval() {
        return patrolinterval;
    }

    public void setPatrolinterval(Integer patrolinterval) {
        this.patrolinterval = patrolinterval;
    }
}