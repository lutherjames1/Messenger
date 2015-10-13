package org.luther.restservice.messenger.database;

import java.util.List;

import org.luther.restservice.messenger.DAO.CommentsDAO;
import org.luther.restservice.messenger.DAO.MessageDAO;
import org.luther.restservice.messenger.DAO.ProfileDAO;


public abstract class DaoFactory {
	
	public static final int oracle = 1;
	public static final int mongo = 2;
	public static final int couch = 3;
	
	
	public abstract MessageDAO getMessagesDAO();
	public abstract ProfileDAO getProfilesDAO();
	public abstract CommentsDAO getCommentsDAO();
	
	
	public static DaoFactory getDAOFactory (int whichDAO)
	{
		switch(whichDAO){
		
		case oracle : return new OracleDAOFactory();
		
		case mongo : return new MongoDAOFactory();
		
		case couch : return new CouchDAOFactory();
		
	    default : return null;
		}
		

		
	}
	
	
	

}
