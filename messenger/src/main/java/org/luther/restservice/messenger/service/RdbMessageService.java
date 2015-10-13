package org.luther.restservice.messenger.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.luther.restservice.messenger.DAO.MessageDAO;
import org.luther.restservice.messenger.database.DaoFactory;
import org.luther.restservice.messenger.database.OracleDAOFactory;
import org.luther.restservice.messenger.model.Message;

public class RdbMessageService implements MessageDAO {
	
	
	public RdbMessageService()
	{
	
	}
	
	private static java.sql.Date getCurrentDate() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}

	@Override
	public Message addMessage(Message message) {
		// TODO Auto-generated method stub
		
		
		PreparedStatement stmt = null;
		Connection con = OracleDAOFactory.createConnection();
		String query = "insert into Messages(messageId,messageText,createdTime,author) Values(?,?,?,?)";
		message.setMessageId(3);
		try {
			stmt = con.prepareStatement(query);
			stmt.setLong(1, message.getMessageId());
			stmt.setString(2, message.getMessageText());
			stmt.setDate(3, getCurrentDate());
			stmt.setString(4, message.getAuthor());
			
			stmt.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(" Added a new message");
		return message;
	}

	@Override
	public Message getMessage(long messageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> getAllMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message updateMessage(Long messageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMessage(Long messageId) {
		// TODO Auto-generated method stub
		
	}

}
