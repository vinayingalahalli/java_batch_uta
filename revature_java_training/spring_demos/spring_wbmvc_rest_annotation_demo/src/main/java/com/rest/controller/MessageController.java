package com.rest.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.messageservice.MessageService;
import com.rest.model.Message;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;

	@GetMapping("/messages")
//	@ExceptionHandler
	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}

	@PostMapping("/addMessage")
	public Message addMessage(@RequestBody Message message) {
		return messageService.addMessage(message);
	}

	@GetMapping("/message/{id}")
	public Message getMessageById(@PathVariable("id") int id) {
		return messageService.getMessageById(id);
	}

	@DeleteMapping("/message/{id}")
	public void deleteMessageById(@PathVariable("id") int id) {
		messageService.deleteMessage(id);
	}
}
