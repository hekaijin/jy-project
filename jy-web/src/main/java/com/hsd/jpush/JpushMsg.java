package com.hsd.jpush;

public class JpushMsg {
	private String sendno;// 编号

	private String msg_id;// 信息编号

	private String errcode;// 返回码

	private String errmsg;// 错误信息

	public String getSendno() {
		return sendno;
	}

	public void setSendno(String sendno) {
		this.sendno = sendno;
	}

	public String getMsg_id() {
		return msg_id;
	}

	public void setMsg_id(String msg_id) {
		this.msg_id = msg_id;
	}

	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

}