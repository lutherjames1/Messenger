package org.luther.restservice.messenger.DAO;

import java.util.List;

import org.luther.restservice.messenger.model.Comment;
import org.luther.restservice.messenger.model.Message;
import org.luther.restservice.messenger.model.Profile;

public interface MessageDAO {

	public Message addMessage(Message message);
	public Message getMessage(long messageId);
	public List<Message> getAllMessages();
	public Message updateMessage(Long messageId);
	public void deleteMessage(Long messageId);
	
	
}
