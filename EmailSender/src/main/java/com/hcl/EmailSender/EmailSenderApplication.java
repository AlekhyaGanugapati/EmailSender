package com.hcl.EmailSender;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.javamail.JavaMailSender;

import com.hcl.EmailSender.service.MailSenderService;

@SpringBootApplication
public class EmailSenderApplication {
	@Autowired
	MailSenderService mailSenderService;
	
	 @Autowired
	 private JavaMailSender javaMailSender;
	 
	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}
    

}
