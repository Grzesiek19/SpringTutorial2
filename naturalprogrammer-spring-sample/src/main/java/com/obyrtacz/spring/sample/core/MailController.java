package com.obyrtacz.spring.sample.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obyrtacz.spring.sample.mail.MailSender;
import com.obyrtacz.spring.sample.mail.MockMailSender;

@RestController
public class MailController {

	
	private MailSender mailSender = new MockMailSender();
	
	@RequestMapping("/mail")
	public String sendMail(){
		
		mailSender.send("abc@example.com", "Some subject","The content");
		return "Mail sent!";
	
	
	}
}
