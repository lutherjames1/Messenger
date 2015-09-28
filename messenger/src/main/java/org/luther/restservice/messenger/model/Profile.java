package org.luther.restservice.messenger.model;

import java.util.Date;

public class Profile {

	private long profileId;
	private String profileName;
	private Date createdTime;
	
	
	public Profile(long profileId , String profileName)
	{
		
		this.profileId = profileId;
		this.profileName = profileName;
		this.createdTime = new Date();
		
	}

	public Profile()
	{
	 
	}

	public long getProfileId() {
		return profileId;
	}


	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}


	public String getProfileName() {
		return profileName;
	}


	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}


	public Date getCreatedTime() {
		return createdTime;
	}


	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	
	
}
