package com.psmanu.csjournal.core.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psmanu.csjournal.core.dao.CategoryDAO;
import com.psmanu.csjournal.core.entity.Article;
import com.psmanu.csjournal.core.entity.Category;
import com.psmanu.csjournal.core.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;

	@Override
	public void createNewCategory(String catName) {
		
		categoryDAO.createNewCategory(catName);
		
	}

	@Override
	public void addArticleToCategory(int art_id, int cat_id) {
		
		categoryDAO.addArticleToCategory(art_id, cat_id);
		
	}

	@Override
	public void removeArticleInCategory(int artid, int cat_id) {
		
		categoryDAO.removeArticleInCategory(artid, cat_id);
		
	}

	@Override
	public void editCategoryName(int cat_id, String newName) {
		
		categoryDAO.editCategoryName(cat_id, newName);
		
	}

	@Override
	public List<Article> fetchAllInCategory(int cat_id) {
		
		return categoryDAO.fetchAllInCategory(cat_id);
	}

	@Override
	public List<Category> fetchAllCategories() {
		
		return categoryDAO.fetchAllCategories();
	}

	@Override
	public Category getCategory(int id) {
		
		return categoryDAO.getCategory(id);
	}
	
	
	
}
