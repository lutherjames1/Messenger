package org.luther.restservice.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.luther.restservice.messenger.database.Database;
import org.luther.restservice.messenger.model.Profile;

public class ProfileService {

	public Map<String , Profile> profiles = Database.getAllProfiles();
	
	public ProfileService()
	{
		profiles.put("Luther", new Profile(1L , "Luther"));
		profiles.put("Kaushik", new Profile(2L , "Kaushik"));
	}
	
	
	public List<Profile> getAllProfiles()
	{
		return new ArrayList<Profile>(profiles.values());
	}
	
	
	public Profile getProfileDetails(String profileName)
	{
		
		return profiles.get(profileName);
	}


	public Profile addProfile(Profile profile) {
		// TODO Auto-generated method stub
		profile.setProfileId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		
		return profile;
		
	}


	public Profile updateProfile(Profile profile) {
		// TODO Auto-generated method stub
		
		if(profiles.containsKey(profile.getProfileName()))
		{
			System.out.println("profileName" + profile.getProfileName());
			profiles.put(profile.getProfileName(), profile);
		}
		
		return profile;
	}
	
}
