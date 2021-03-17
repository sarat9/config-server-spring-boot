package com.service.client.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RefreshScope
public class ClientController {
	Logger logger = LoggerFactory.getLogger(ClientController.class);
    
    @Value("${my.greeting.message}")
    private String greetingMessage;
    
    @Value("${app.message}")
    private String appMessage;
    
    @GetMapping("/client")
	public String clientCall() {		
		try {
			logger.info("Client ");
			return "Hi from Client";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
    
    
    @GetMapping("/greeting")
   	public String greeting() {		
   		try {
   			logger.info("Reading Greeting config from Config Server properties ");
   			return "greeting config from config server is : "+greetingMessage;
   		} catch (Exception e) {
   			e.printStackTrace();
   		}
   		return null;
   	}
    
    @GetMapping("/message")
   	public String appMessage() {		
   		try {
   			logger.info("Reading Greeting config from Local properties ");
   			return "greeting config from local properties server is : "+appMessage;
   		} catch (Exception e) {
   			e.printStackTrace();
   		}
   		return null;
   	}
    

}
