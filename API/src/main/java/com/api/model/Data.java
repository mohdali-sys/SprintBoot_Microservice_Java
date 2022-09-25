package com.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Data
{

    private String merchantauthtoken;

    private String timeStamp;

    private String mobilenumber;

    private String unqTxnId;

    public String getUnqTxnId()
    {
        return unqTxnId;
    }

    public void setUnqTxnId(String unqTxnId)
    {
        this.unqTxnId = unqTxnId;
    }

    public String getTimeStamp()
    {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp)
    {
        this.timeStamp = timeStamp;
    }

    public String getMobilenumber()
    {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber)
    {
        this.mobilenumber = mobilenumber;
    }

    public String getMerchantauthtoken()
    {
        return merchantauthtoken;
    }

    public void setMerchantauthtoken(String merchantauthtoken)
    {
        this.merchantauthtoken = merchantauthtoken;
    }

}
