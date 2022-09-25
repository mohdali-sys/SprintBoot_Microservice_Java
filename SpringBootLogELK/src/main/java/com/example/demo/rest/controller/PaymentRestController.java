package com.example.demo.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.utils.AppUtil;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {
	private static Logger LOG= LoggerFactory.getLogger(PaymentRestController.class);
	
	@GetMapping("/pay")
	public String doPay()
	{
		LOG.info("ENTERED INTO PAYMENT SERVICE");
		try {
		LOG.info("PAYMENT ABOUT TO START!");
		throw new RuntimeException("INVALID OTP !");
		} catch (Exception e) {
		e.printStackTrace();
		LOG.error("PAYMENT ABOUT TO START!");
		LOG.error("Exception - " +
		AppUtil.getLogSupport(e));
		}
		return "SUCCESS";
		}


}
