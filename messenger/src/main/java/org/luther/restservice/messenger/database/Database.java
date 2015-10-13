package org.luther.restservice.messenger.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.luther.restservice.messenger.model.Message;
import org.luther.restservice.messenger.model.Profile;

public class Database {
	
	public static Map<Long, Message> messeges = new HashMap<Long, Message>();
	public static Map<String , Profile> profiles = new HashMap<String, Profile>();
	
	
	
	public static Map<Long, Message> getAllMessages(){
		
		return messeges;
	}
	
	
	public static Map<String, Profile> getAllProfiles()
	{
		return profiles;
	}

	
	
}
