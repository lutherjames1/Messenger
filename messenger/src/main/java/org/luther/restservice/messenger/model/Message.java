package org.luther.restservice.messenger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
public class Message {

	private long messageId;
	private String messageText;
	private Date createdTime;
	private String author;
	private Map<Long, Comment> comments = new HashMap<>();
	
	@XmlTransient
	public Map<Long, Comment> getComments() {
		return comments;
	}

	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}

	private List<Link> list = new ArrayList<Link>();
	
	public Message()
	{
		
	}
	
	public Message(long messageId , String messageText , String author )
	{
		this.messageId = messageId;
		this.messageText = messageText;
		this.createdTime = new Date();
		this.author = author;
		
	}
	
	
	
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public List<Link> getList() {
		return list;
	}

	public void setList(List<Link> list) {
		this.list = list;
	}
	
	public void addlink(String url , String rel)
	{
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		list.add(link);
	}
	

}
