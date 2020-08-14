package com.hcl.EmailSender.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmailObject {
	private List<String> recipents;
	private List<String> from;
	private String body;
	private String subject;
	
	public List<String> getRecipents() {
		return recipents;
	}
	public void setRecipents(List<String> recipents) {
		this.recipents = recipents;
	}
	public List<String> getFrom() {
		return from;
	}
	public void setFrom(List<String> from) {
		this.from = from;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "EmailObject [recipents=" + recipents + ", from=" + from + ", body=" + body + ", subject=" + subject + "]";
	}
	
}
