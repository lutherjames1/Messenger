package org.luther.restservice.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.luther.restservice.messenger.database.Database;
import org.luther.restservice.messenger.model.Comment;
import org.luther.restservice.messenger.model.Message;

public class CommentService {

	private static Map<Long , Message> messages = Database.getAllMessages();
	
	
	public List<Comment> getAllComments(long messageId)
	{
		System.out.println(" Message Id is " + messageId);
		Map<Long ,Comment> comments = messages.get(messageId).getComments();
		return new  ArrayList<Comment>(comments.values());
	}
	
	public Comment getComment(long messageId, long commentId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return comments.get(commentId);
	}
	
	public Comment addComment(long messageId , Comment comment)
	{
		Map<Long ,Comment> comments = messages.get(messageId).getComments();
		
		    comment.setCommentId(comments.size()+1);
	        comments.put(messageId , comment);
	        return comment;
		
	}
	
	public Comment updateComment(long messageId, Comment comment) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		if (comment.getCommentId() <= 0) {
			return null;
		}
		comments.put(comment.getCommentId(), comment);
		return comment;
	}
	
	public Comment removeComment(long messageId, long commentId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return comments.remove(commentId);
	}
	
	
	
}
