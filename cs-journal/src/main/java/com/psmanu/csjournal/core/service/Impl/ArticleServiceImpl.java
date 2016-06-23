package com.psmanu.csjournal.core.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psmanu.csjournal.core.dao.ArticleDAO;
import com.psmanu.csjournal.core.entity.Article;
import com.psmanu.csjournal.core.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDAO articleDAO;
	
	
	public void createArticleTitle(String title) {
		articleDAO.createArticleTitle(title);

	}

	
	public void editArticleName(int id, String newName) {
		
		articleDAO.editArticleName(id, newName);

	}

	
	public void addArticle(int id, String content) {
		
		articleDAO.addArticle(id, content);

	}

	
	public void publishArticle(int id) {
		
		articleDAO.publishArticle(id);

	}

	
	public void editArticle(int id, String content) {
		
		articleDAO.editArticle(id, content);

	}

	
	public void deleteArticle(int id) {
		
		articleDAO.deleteArticle(id);

	}

	
	public Article fetchArticle(int id) {
		
		return articleDAO.fetchArticle(id);
	}

	@Override
	public List<Article> fetchAllArticles() {

		return articleDAO.fetchAllArticles();
	}

	@Override
	public List<Article> searchArticle(String string) {
		
		return articleDAO.searchArticle(string);
	}

	@Override
	public List<Article> getTopArticles(int count, int set) {
		
		return articleDAO.getTopArticles(count, set);
	}

	

}
