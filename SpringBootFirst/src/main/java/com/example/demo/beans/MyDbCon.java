package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("dbCon")
@ConfigurationProperties(prefix="my.mail")
public class MyDbCon {

	@Value("${my.db.driver}")
	private String driver;
	
	@Value("${my.db.url}")
	private String url;
	
	@Override
	public String toString() {
		return "MyDbCon [driver=" + driver + ", url=" + url + "]";
	}
	
	
}
