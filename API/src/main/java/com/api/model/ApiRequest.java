package com.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ApiRequest {

	private String emailId;
    private String merchId;
    private String merchChanId;
    private String submerchantid;
    private String mcccode;
    private String unqCustId;
    private String timestamp;
    private String mobilenumber;
    private String unqTxnId;
    private String merchChecksum;


	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMerchId() {
		return merchId;
	}
	public void setMerchId(String merchId) {
		this.merchId = merchId;
	}
	public String getMerchChanId() {
		return merchChanId;
	}
	public void setMerchChanId(String merchChanId) {
		this.merchChanId = merchChanId;
	}
	public String getSubmerchantid() {
		return submerchantid;
	}
	public void setSubmerchantid(String submerchantid) {
		this.submerchantid = submerchantid;
	}
	public String getMcccode() {
		return mcccode;
	}
	public void setMcccode(String mcccode) {
		this.mcccode = mcccode;
	}
	public String getUnqCustId() {
		return unqCustId;
	}
	public void setUnqCustId(String unqCustId) {
		this.unqCustId = unqCustId;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUnqTxnId() {
		return unqTxnId;
	}
	public void setUnqTxnId(String unqTxnId) {
		this.unqTxnId = unqTxnId;
	}
	public String getMerchChecksum() {
		return merchChecksum;
	}
	public void setMerchChecksum(String merchChecksum) {
		this.merchChecksum = merchChecksum;
	}




}
