package com.hcl.EmailSender.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.EmailSender.entity.EmailObject;

@Service
public interface MailSenderService {
	
	public void sendEmail(List<EmailObject> emailObjects);

}
