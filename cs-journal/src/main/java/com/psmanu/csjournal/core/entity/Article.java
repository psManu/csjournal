package com.psmanu.csjournal.core.entity;

import java.sql.Date;
import java.util.HashMap;


public class Article {
	
	private int artId;
	private String artName;
	private String author;
	private Date dateModified;
	private String content;
	private String thumbnailUrl;
	private boolean isPublic;
	private String artNameWithoutSpaces;
	
	private HashMap<Integer, String> relatedArticles = new HashMap<Integer, String>();
	
	
	
	public Article() {
		
	}
	


	public int getArtId() {
		return artId;
	}
	
	public void setArtId(int artId) {
		this.artId = artId;
	}
	
	public String getArtName() {
		return artName;
	}
	
	public void setArtName(String artName) {
		this.artName = artName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Date getDateModified() {
		return dateModified;
	}
	
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	
	public HashMap<Integer, String> getRelatedArticles() {
		return relatedArticles;
	}
	
	public void setRelatedArticles(HashMap<Integer, String> relatedArticles) {
		this.relatedArticles = relatedArticles;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}


	public String getThumbnailUrl() {
		return thumbnailUrl;
	}


	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}


	public String getArtNameWithoutSpaces() {
		return artNameWithoutSpaces;
	}


	public void setArtNameWithoutSpaces(String artNameWithoutSpaces) {
		this.artNameWithoutSpaces = artNameWithoutSpaces;
	}



	@Override
	public String toString() {
		return "Article [artId=" + artId + ", artName=" + artName + ", author=" + author + ", dateModified="
				+ dateModified + ", content=" + content + ", thumbnailUrl=" + thumbnailUrl + ", isPublic=" + isPublic
				+ ", artNameWithoutSpaces=" + artNameWithoutSpaces + ", relatedArticles=" + relatedArticles + "]";
	}
	
	

}
