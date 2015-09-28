package org.luther.restservice.messenger.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.luther.restservice.messenger.database.Database;
import org.luther.restservice.messenger.model.*;

public class MessegeService {

	
	public Map<Long,Message> messeges = Database.getAllMessages();
	
	public MessegeService()
	{
		messeges.put(1L, new Message(1L , "hello" , "Luther"));
		messeges.put(2L, new Message(2L , "HI" , "Kaushik"));
	}
	
	public Message getMessage(Long Id)
	{
		
        return messeges.get(Id);
		
	}
	
	
	public Message setMessage(Message messege)
	{
	   	messege.setMessageId(messeges.size()+1);
	   	messeges.put(messege.getMessageId(), messege);
	   	
		return messege;
		
		
	}
	
	
	public Message updateMessage(long messageId , Message message)
	{
		message.setMessageId(messageId);
	   messeges.put(message.getMessageId(), message);
	   return message;
		
	}
	
	
	public List<Message> getAllMesseges()
	{
		return new ArrayList<Message>(messeges.values());
		
	}
}
