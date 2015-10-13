package org.luther.restservice.messenger.resources;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.luther.restservice.messenger.DAO.MessageDAO;
import org.luther.restservice.messenger.database.DaoFactory;
import org.luther.restservice.messenger.model.Message;
import org.luther.restservice.messenger.service.MessegeService;
import org.luther.restservice.messenger.service.RdbMessageService;

@Path("/messeges")
public class MessegeResource {
	
	
	

	MessegeService service = new MessegeService();
	RdbMessageService rService = new RdbMessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getAllMessages(@QueryParam("year") int year)
    {
    	return service.getAllMesseges();
    }
	

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getString(@PathParam("messageId") long messageId , @Context UriInfo uriInfo )
	{
		Message message = service.getMessage(messageId);
		String uri = getUriForSelf(uriInfo, message);
	
		message.addlink(uri, "self");
		return message;
	}


	private String getUriForSelf(UriInfo uriInfo, Message message) {
		String uri = uriInfo.getBaseUriBuilder()
		   .path(MessegeResource.class)
		   .path(Long.toString(message.getMessageId()))
		   .build()
		   .toString();
		return uri;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message postAMessage(Message message)
	{
		System.out.println("Message body is" + message);
		//return service.setMessage(message);
		DaoFactory daofactory =  DaoFactory.getDAOFactory(DaoFactory.oracle);
		MessageDAO mesDao = daofactory.getMessagesDAO();
		
		return mesDao.addMessage(message);
	}
	
	
	@PUT
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long messageId , Message message)
	{
		System.out.println("Message body is " + message + " " + messageId);
		
		return service.updateMessage(messageId, message);
	}
	
	
	
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource()
	{
		return new CommentResource();
	}
}
