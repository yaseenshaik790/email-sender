package com.email.emailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/email")
public class EmailSenderController {

	@Autowired
	public JavaMailSender javaMailSender;

	@GetMapping
	public String sendEmail() {
		
		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo("yaseenshaik790@gmail.com");
		message.setSubject("simple mail ");
		message.setText("Hi Yaseen");
		javaMailSender.send(message);

		return "Successs";
	}
}
