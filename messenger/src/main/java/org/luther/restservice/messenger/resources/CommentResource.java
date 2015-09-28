package org.luther.restservice.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {
	
	@GET
	public String getComments()
	{
		return " return sub resource";
	}
	
	@GET
	@Path("/{CommentId}")
	public Long getComment(@PathParam("CommentId") long commentId)
	{
		System.out.println(" Comment id is " + commentId);
		return commentId;
	}

}
