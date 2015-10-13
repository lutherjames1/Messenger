package org.luther.restservice.messenger.client;

import java.sql.Connection;

import org.luther.restservice.messenger.DAO.MessageDAO;
import org.luther.restservice.messenger.database.DaoFactory;
import org.luther.restservice.messenger.database.OracleDAOFactory;
import org.luther.restservice.messenger.model.Message;

public class Test {
	
	public static void main(String[] args)
	{
		
		
		DaoFactory daofactory =  DaoFactory.getDAOFactory(DaoFactory.oracle);
		MessageDAO mesDao = daofactory.getMessagesDAO();
		Message message = new Message(1L , "hello" , "Luther");
		mesDao.addMessage(message);
		
		
	}
	

}
