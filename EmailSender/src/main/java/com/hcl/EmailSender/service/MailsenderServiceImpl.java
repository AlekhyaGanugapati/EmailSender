package com.hcl.EmailSender.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.hcl.EmailSender.entity.EmailObject;

@Service
public class MailsenderServiceImpl implements MailSenderService{
	
	@Autowired
    private JavaMailSender javaMailSender;
	
	@Override
	public void sendEmail(List<EmailObject> emailObjects) {
		try {
		SimpleMailMessage message = new SimpleMailMessage();
		for(EmailObject eachEmailObject : emailObjects) {
			for(String eachRecipent : eachEmailObject.getRecipents()) {
				//for(String eachFrom : eachEmailObject.getFrom()) {
				//	message.setFrom(eachFrom);
					message.setTo(eachRecipent);
					message.setSubject(eachEmailObject.getSubject());
					message.setText(eachEmailObject.getBody());
					javaMailSender.send(message);
					System.out.println("Sent..!!!");
				}
			}
		
		//}
		}
		catch(MailException mex) {
			System.err.println(mex.getMessage());
		}
	}
	

}
