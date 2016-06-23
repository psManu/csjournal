package com.psmanu.csjournal.core.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psmanu.csjournal.core.dao.ArticleDAO;
import com.psmanu.csjournal.core.dao.CategoryDAO;
import com.psmanu.csjournal.core.dao.DataAccess;
import com.psmanu.csjournal.core.entity.Article;
import com.psmanu.csjournal.core.entity.Category;

@Repository
public class CategoryDAOImpl extends DataAccess implements CategoryDAO {
	

	
	@Autowired
	private ArticleDAO articleDAO;
	
	String sql = "";
	
	

	@Override
	public void createNewCategory(String name) {
		sql = "INSERT INTO category(name) values(?)";
		db.update(sql, name);
	}

	
	public void addArticleToCategory(int art_id, int cat_id) {
		
		sql = "INSERT INTO category_art(cat_id, art_id) values(?, ?)";
		db.update(sql, cat_id, art_id);

	}

	
	public void removeArticleInCategory(int art_id, int cat_id) {
		sql = "DELETE FROM category_art WHERE cat_id=? AND art_id=?";
		db.update(sql, cat_id, art_id);
	}

	
	public void editCategoryName(int cat_id, String newName) {
		sql = "UPDATE category SET name=? WHERE id=?";
		db.update(sql, newName, cat_id);
	}

	
	public List<Article> fetchAllInCategory(int cat_id) {
		List<Integer> art_id_list = new ArrayList<Integer>();
		List<Article> art_list = new ArrayList<Article>();
		
		
		sql = String.format("SELECT art_id FROM category_art WHERE cat_id=%d", cat_id);
		art_id_list = db.queryForList(sql, Integer.class);
		
		/// Get articles for those fetched IDs ////////////////////
		
		for(int i : art_id_list){
			art_list.add(articleDAO.fetchArticle(i));
		}
			
		return art_list;
	}


	
	public List<Category> fetchAllCategories() {
		sql = "SELECT * FROM categories";
		System.out.println("Came here");
		return db.query(sql, new CategoryMapper());
		
	}


	
	public Category getCategory(int id) {
		
		sql = "SELECT * FROM categories WHERE cat_id=?";
		return db.queryForObject(sql, new Object[]{id}, new CategoryMapper());
	}
	
	private static final class CategoryMapper implements RowMapper<Category> {

	    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	Category category = new Category();
            category.setId(rs.getInt("cat_id"));
            category.setName(rs.getString("cat_name"));
            return category;
	    }
	}

}
