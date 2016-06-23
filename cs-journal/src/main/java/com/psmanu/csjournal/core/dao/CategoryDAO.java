package com.psmanu.csjournal.core.dao;

import java.util.List;

import com.psmanu.csjournal.core.entity.Article;
import com.psmanu.csjournal.core.entity.Category;


public interface CategoryDAO {
	
	public void createNewCategory(String name);
	public void addArticleToCategory(int art_id, int cat_id);
	public void removeArticleInCategory(int artid, int cat_id);
	public void editCategoryName(int cat_id, String newName);
	public List<Article> fetchAllInCategory(int cat_id);
	public List<Category> fetchAllCategories();
	public Category	getCategory(int id);
}
