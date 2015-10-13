package org.luther.restservice.messenger.DAO;

import java.util.List;

import org.luther.restservice.messenger.model.Comment;
import org.luther.restservice.messenger.model.Message;
import org.luther.restservice.messenger.model.Profile;


public interface ProfileDAO {

	
	public Profile getProfile(long profileId);
	public Profile addProfile(Profile profile);
	public List<Profile> getAllProfiles();
	public Profile updateProfile(Profile profile);
	public void deleteProfile(long profileId);
	
}
