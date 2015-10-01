package org.luther.restservice.messenger.model;

import java.util.Date;

public class Comment {
	private long commentId;
	private String commentText;
	private Date commentDate;
	private String author;
	
	
	

	public Comment()
	{
		
	}
	
	
	public Comment(long commentId , String commentText , String author)
	{
		this.commentId = commentId;
		this.commentText = commentText;
		commentDate = new Date();
		this.author = author;
		
	}
	
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

	
	public long getCommentId() {
		return commentId;
	}
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	
	
	

}
