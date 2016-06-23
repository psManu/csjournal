package com.psmanu.csjournal.core.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psmanu.csjournal.core.dao.ArticleDAO;
import com.psmanu.csjournal.core.dao.DataAccess;
import com.psmanu.csjournal.core.entity.Article;

@Repository
public class ArticleDAOImpl extends DataAccess implements ArticleDAO {


	
	private java.util.Date utilDate = new java.util.Date();
	private java.sql.Date sqldate = new java.sql.Date(utilDate.getTime());
	String sql = "";
	

	
	public void createArticleTitle(String title) {

		String title_no_spaces = title.toLowerCase().replace(" ", "-");
		
		sql = "INSERT INTO articles(art_title, art_title_no_spaces, art_author, last_modified) values(?, ?, ?, ?)";
		db.update(sql, title, title_no_spaces, "pmanu", sqldate);

	}

	
	public void editArticleName(int id, String newName) {
		
		String title_no_spaces = newName.toLowerCase().replace(" ", "-");
		sql = "UPDATE articles SET art_title=?, art_title_no_spaces=?, last_modified=? WHERE art_id=?";
		db.update(sql, newName, title_no_spaces, sqldate, id);

	}

	
	public void addArticle(int id, String content) {
		sql = "UPDATE articles SET art_content=?, last_modified=? WHERE art_id=?";
		db.update(sql, content, sqldate, id);

	}

	
	public void publishArticle(int id) {
		sql = "UPDATE articles SET ispublic=? WHERE art_id=?";
		db.update(sql, "TRUE", id);

	}

	
	public void editArticle(int id, String content) {
		sql = "UPDATE articles SET art_content=?, last_modified=? WHERE art_id=?";
		db.update(sql, content, sqldate, id);

	}

	
	public void deleteArticle(int id) {
		sql = "DELETE FROM articles WHERE id=?";
		db.update(sql, id);

	}

	
	public Article fetchArticle(int id) {
		sql = "SELECT * FROM articles WHERE art_id=" + id + ";";
		return db.queryForObject(sql, new ArticleMapper());
	}

	@Override
	public List<Article> fetchAllArticles() {
		sql = "SELECT * FROM articles";
		return db.query(sql, new ArticleMapper());
	}

	
	public List<Article> searchArticle(String search_param) {
		
		sql = "SELECT * FROM articles WHERE art_title LIKE '%" + search_param + "%'";
		return db.query(sql, new ArticleMapper());
	}
	
	
	public List<Article> getTopArticles(int count, int set) {
		int onset = count * set;
		sql = String.format("SELECT * FROM articles LIMIT %d OFFSET (SELECT COUNT(*) FROM articles)-%d", count, onset);
		
		return db.query(sql, new ArticleMapper());
	}

	
	private static final class ArticleMapper implements RowMapper<Article> {

	    public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Article article = new Article();
	        article.setArtId(rs.getInt("art_id"));
	        article.setArtName(rs.getString("art_title"));
	        article.setArtNameWithoutSpaces(rs.getString("art_title_no_spaces"));
	        article.setAuthor(rs.getString("art_author"));
	        article.setContent(rs.getString("art_content"));
	        article.setDateModified(rs.getDate("last_modified"));
	        article.setThumbnailUrl(rs.getString("thumbnail_url"));
	        article.setPublic(rs.getBoolean("ispublic"));
	        return article;
	    }
	}


	

}
