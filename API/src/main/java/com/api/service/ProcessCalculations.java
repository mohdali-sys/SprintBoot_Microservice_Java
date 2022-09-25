package com.api.service;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import com.api.model.ApiRequest;
import com.api.util.CheckSumCalculator;

@Service
public class ProcessCalculations {

	public ApiRequest generateCheckSum(ApiRequest apiRequest) {
		String checksum_input = CheckSumCalculator.getInput(apiRequest.getEmailId(), apiRequest.getMerchId(), apiRequest.getMerchChanId(), apiRequest.getSubmerchantid(),
				apiRequest.getMcccode(), apiRequest.getUnqCustId(), apiRequest.getTimestamp(), apiRequest.getMobilenumber(), apiRequest.getUnqTxnId());

		String checkSumval = "";
		try {
		    String skey = "76BDC4F19EF934C8019807CEDA5B4002F075366C4F04C0E6B99AB22F75DF26BB";
		    byte[] encData = CheckSumCalculator.encrypt(CheckSumCalculator.hexStringToByteArray(skey), CheckSumCalculator.SHA256(checksum_input));
		    System.out.println("upisdk, Base Activity checksum_input: " + checksum_input);
		    //checkSumval= Base64.encodeBase64String(encData);
		    checkSumval = Base64.encodeBase64String(encData);
		    System.out.println("upisdk, Our checksum value > " + checkSumval);


		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		apiRequest.setMerchChecksum(checkSumval);
		return apiRequest;
	}
}
