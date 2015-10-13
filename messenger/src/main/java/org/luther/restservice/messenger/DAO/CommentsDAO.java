package org.luther.restservice.messenger.DAO;

import java.util.List;

import org.luther.restservice.messenger.model.Comment;

public interface CommentsDAO {
	
	public Comment getComment(long commendId);
	public Comment addComment(Comment comment);
	public List<Comment> getAllComments();
	public Comment updateComment(long commentId);
	public void deleteComment (long commentId);

}
