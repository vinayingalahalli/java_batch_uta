package com.rest.messageservice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.rest.model.Message;

@Service
public class MessageService {
	private static Map<Integer, Message> hm = new LinkedHashMap<>();

	public List<Message> getAllMessages() {
		return new ArrayList<>(hm.values());
	}
	
	public Message addMessage(Message message) {
		message.setId(new Random().nextInt());
		hm.put(message.getId(), message);
		return message;
	}
	
	public Message getMessageById(int id) {
		return hm.get(id);
	}
	
	public void deleteMessage(int id) {
		hm.remove(id);
	}
}
