package org.luther.restservice.messenger.database;

import java.util.List;

import org.luther.restservice.messenger.DAO.CommentsDAO;
import org.luther.restservice.messenger.DAO.MessageDAO;
import org.luther.restservice.messenger.DAO.ProfileDAO;
import org.luther.restservice.messenger.service.RdbMessageService;

import java.sql.*;

import oracle.jdbc.pool.OracleDataSource;

public class OracleDAOFactory  extends DaoFactory{
	
	
	public static final String driver = "oracle.jdbc.OracleDriver";
	public static final String dbUrl = "jdbc:oracle:thin:@Luther-PC:1521:XE";
	
	static final String USER = "SYSTEM";
	static final String PASS = "P@ssw0rd";
	
	 static Connection conn = null;
	
	
	 public static Connection createConnection() {
		 try {
			OracleDataSource ds = new OracleDataSource();
			ds.setURL(dbUrl);
			conn = ds.getConnection(USER, PASS);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		
		 System.out.println("Connecting to database...");
		/*   try {
			Class.forName(driver);
			System.out.println("Connecting to database...");
		     try {
				conn = DriverManager.getConnection(dbUrl,USER,PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		*/
		 
		 return conn;
		 
}

	@Override
	public MessageDAO getMessagesDAO() {
		// TODO Auto-generated method stub
		return new RdbMessageService();
	}

	@Override
	public ProfileDAO getProfilesDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentsDAO getCommentsDAO() {
		// TODO Auto-generated method stub
		return null;
	}

		
	

}
