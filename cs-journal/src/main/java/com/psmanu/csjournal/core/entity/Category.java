package com.psmanu.csjournal.core.entity;

import java.util.List;

public class Category {
	
	private int id;
	private String name;
	private List<Article> artList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Article> getArtList() {
		return artList;
	}
	public void setArtList(List<Article> artList) {
		this.artList = artList;
	}
	
	
	

}
