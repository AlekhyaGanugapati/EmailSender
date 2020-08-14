package com.hcl.EmailSender.controller;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.EmailSender.service.MailSenderService;
import com.hcl.EmailSender.entity.EmailObject;

@RestController
@RequestMapping("Send")
public class Controller {
	
	@Autowired
	MailSenderService mailSenderService;
	
	@RequestMapping(value = "/email", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void sendEmail(@RequestBody List<EmailObject> emailObjects){
		for(EmailObject each: emailObjects) {
		System.out.println("get "+ each.toString());
		}
		mailSenderService.sendEmail(emailObjects);
	}
	{
		
	}


}
