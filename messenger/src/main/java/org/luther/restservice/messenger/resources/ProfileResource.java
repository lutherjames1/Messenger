package org.luther.restservice.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.luther.restservice.messenger.model.Profile;
import org.luther.restservice.messenger.service.ProfileService;

@Path("/Profiles")
public class ProfileResource {

	ProfileService service = new ProfileService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getAllProfiles()
	{
		
		return service.getAllProfiles();
	}
	
	
	@GET
	@Path("{profileId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getProfileDetails(@PathParam("profileId") String profileName)
	{
		return service.getProfileDetails(profileName);
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Profile addProfile(Profile profile)
	{
		
		return service.addProfile(profile);
		
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{profileName}")
	public Profile updateProfile(@PathParam("profileName") String profileName , Profile profile)
	{
		
		return service.updateProfile(profile);
	}
	
	
	
}
