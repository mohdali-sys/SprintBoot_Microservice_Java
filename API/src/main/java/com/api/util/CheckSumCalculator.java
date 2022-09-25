package com.api.util;

import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;

public class CheckSumCalculator {

	public static byte[] SHA256(String paramString) throws Exception {
	    MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-256");
	    localMessageDigest.update(paramString.getBytes("UTF-8"));
	    byte[] digest = localMessageDigest.digest();
	    return digest;
	}
	
	public static String getInput(String emailId, String merchId, String merchChanId, String submerchantid, String mcccode,
            String unqCustId, String timestamp, String mobilenumber, String unqTxnId) {
      return ((emailId != null) ? emailId : "").concat(merchId).
             concat((merchChanId != null) ? merchChanId : "").concat((submerchantid != null) ? submerchantid : "").
             concat((mcccode != null) ? mcccode : "").
             concat((unqCustId != null) ? unqCustId : "").concat((timestamp != null) ?
             timestamp : "").concat(mobilenumber).concat((unqTxnId != null) ?
             unqTxnId : "");
   }
	
	public static byte[] hexStringToByteArray(String s) {
	    byte[] b = new byte[s.length() / 2];
	    //byte[] b = new byte[s.length()];
	    for (int i = 0; i < b.length; i++) {
	        int index = i * 2;
	        int v = Integer.parseInt(s.substring(index, index + 2), 16);
	        b[i] = (byte) v;

	    }
	    return b;
	}
	
	public static byte[] encrypt(byte[] key, byte[] data) throws Exception {
	    System.out.println(">>>>>>>>>KEY::" + key.length);
	    SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
	    byte[] iv = new byte[16];
	    IvParameterSpec ivSpec = new IvParameterSpec(iv);
	    Cipher acipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	    acipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivSpec);
	    byte[] arrayOfByte1 = acipher.doFinal(data);
	    return arrayOfByte1;
	}
	
	public static void main(String[] args) {
		String timeStamp = String.valueOf(System.currentTimeMillis());
		System.out.println(timeStamp);
		String checksum_input = getInput("maxpe@ecomaxgo.in", "MAXPE", "OLIVEAPP", "OLIVE",
		        "7322", "918143111212", timeStamp, "918143111212", "4tehe7egege7e");

		String checkSumval = "";
		try {
		    String skey = "76BDC4F19EF934C8019807CEDA5B4002F075366C4F04C0E6B99AB22F75DF26BB";
		    byte[] encData = encrypt(hexStringToByteArray(skey), SHA256(checksum_input));
		    System.out.println("upisdk, Base Activity checksum_input: " + checksum_input);
		    //checkSumval= Base64.encodeBase64String(encData);
		    checkSumval = Base64.encodeBase64String(encData);
		    System.out.println("upisdk, Our checksum value > " + checkSumval);


		} catch (Exception e) {
		    e.printStackTrace();
		}

	}




}
