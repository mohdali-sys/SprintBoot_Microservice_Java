package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	//to read and use any object from container : Autowired
		@Autowired
		private MyDbCon con; //HAS-A
		
		@Autowired
		private EmailConfig emailConfig;
		
		@Autowired
		private MyProfileData  myProfileData;

		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			System.out.println("FROM MESSAGE RUNNER");
			System.out.println(con);
			System.out.println(emailConfig);
			System.out.println(myProfileData);
			
		}
}
