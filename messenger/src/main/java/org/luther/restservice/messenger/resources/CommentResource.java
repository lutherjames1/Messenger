package org.luther.restservice.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.luther.restservice.messenger.model.Comment;
import org.luther.restservice.messenger.service.CommentService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {
	
	
	CommentService service = new CommentService();
	
	@GET
	public List<Comment> getComments(@PathParam("messageId") long messageId)
	{
		return service.getAllComments(messageId);
		
	}
	
	@GET
	@Path("/{commentId}")
	public Comment getComment(@PathParam("commentId") long commentId , @PathParam("messageId") long messageId)
	{
		
		return service.getComment(messageId, commentId);
		
	}
	
	@POST
	public Comment addComment(@PathParam("messageId") long messageId, Comment comment) {
		return service.addComment(messageId, comment);
	}
	
	@PUT
	@Path("/{commentId}")
	public Comment updateComment(@PathParam("messageId") long messageId, @PathParam("commentId") long id, Comment comment) {
		comment.setCommentId(id);
		return service.updateComment(messageId, comment);
	}
	
	@DELETE
	@Path("/{commentId}")
	public void deleteComment(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId) {
		service.removeComment(messageId, commentId);
	}

}
