package com.projetos.projeto4.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("messagens")
public class MessageController {

	@Value("${databaseUrl}")
	private  String welcomeMessage;
	
	@GetMapping(value = "/welcome")
	public ResponseEntity getMessageWelcome() {
		log.info("Chamou o EndPoint");
		return new ResponseEntity(welcomeMessage, HttpStatus.OK);
	}
}


