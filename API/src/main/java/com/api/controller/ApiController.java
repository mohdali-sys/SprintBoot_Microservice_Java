package com.api.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api.model.ApiRequest;
import com.api.model.ApiResponse;
import com.api.service.ProcessCalculations;
import com.api.util.CommonUtils;

@RestController
public class ApiController
{

    @Autowired
    ProcessCalculations processCalculations;

    @Value("${token.server.url}")
    private String url;

    @Value("${token.server.mccode}")
    private String mccode;

    @Value("${token.server.merchchanid}")
    private String merchchanid;

    @Value("${token.server.merchid}")
    private String merchid;

    @Value("${token.server.submerchantid}")
    private String submerchantid;

    @RequestMapping(value = "/generateToken", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> generateToken(@RequestBody ApiRequest apiRequest1)
        throws Exception
    {
        Random rand = new Random();
        String timeStamp = String.valueOf(System.currentTimeMillis());
        String uniTranId =
            CommonUtils.hashCal("SHA-256", Integer.toString(rand.nextInt()) + (System.currentTimeMillis() / 1000L))
                .substring(0, 20);
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setEmailId(apiRequest1.getEmailId());
        apiRequest.setMerchId(merchid); // M
        apiRequest.setMerchChanId(merchchanid); // M
        apiRequest.setSubmerchantid(submerchantid); // M
        apiRequest.setMcccode(mccode);
        apiRequest.setUnqCustId(apiRequest1.getUnqCustId());
        apiRequest.setTimestamp(timeStamp);
        apiRequest.setMobilenumber(apiRequest1.getMobilenumber()); // M
        apiRequest.setUnqTxnId(uniTranId); // M
        apiRequest = processCalculations.generateCheckSum(apiRequest); // M
        RestTemplate restTemplate = new RestTemplate();

        // String result = restTemplate.postForObject(url, apiRequest, String.class);
        ApiResponse apiResponse = restTemplate.postForObject(url, apiRequest, ApiResponse.class);
        apiResponse.getData().setMobilenumber(apiRequest1.getMobilenumber());
        apiResponse.getData().setTimeStamp(timeStamp);
        apiResponse.getData().setUnqTxnId(uniTranId);
        return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
    }
}
