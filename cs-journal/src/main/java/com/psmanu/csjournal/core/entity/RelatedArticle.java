package com.psmanu.csjournal.core.entity;

public class RelatedArticle {

	private int id;
	private String title;
	private String titleWithoutSpaces;
	
	public RelatedArticle() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleWithoutSpaces() {
		return titleWithoutSpaces;
	}

	public void setTitleWithoutSpaces(String titleWithoutSpaces) {
		this.titleWithoutSpaces = titleWithoutSpaces;
	}
	
	
}
