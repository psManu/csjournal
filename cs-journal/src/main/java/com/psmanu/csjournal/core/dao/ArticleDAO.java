package com.psmanu.csjournal.core.dao;

import java.util.List;


import com.psmanu.csjournal.core.entity.Article;

public interface ArticleDAO {
	
	public void createArticleTitle(String title);
	public void editArticleName(int id, String newName);
	public void addArticle(int id, String content);
	public void publishArticle(int id);
	public void editArticle(int id, String content);
	public void deleteArticle(int id);
	public Article fetchArticle(int id);
	public List<Article> fetchAllArticles();
	public List<Article> searchArticle(String search_param); 
	public List<Article> getTopArticles(int count, int set);

}
