package com.psmanu.csjournal.core.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psmanu.csjournal.core.dao.DataAccess;
import com.psmanu.csjournal.core.dao.RelatedArticleDAO;
import com.psmanu.csjournal.core.entity.RelatedArticle;

@Repository
public class RelatedArticleDAOImpl extends DataAccess implements RelatedArticleDAO {


	String sql = "";
	   

	
	@Override
	public List<RelatedArticle> getRelatedArticles(int art_id) {
		sql = "SELECT related_articles.related_art_id, articles.art_title, articles.art_title_no_spaces " +
				  "FROM related_articles, articles " +
				  "WHERE related_articles.related_art_id=articles.art_id " +
				  "AND related_articles.art_id=?";
			
		return db.query(sql, new Object[]{art_id}, new RelatedArticleMapper());
	}
	
	private static final class RelatedArticleMapper implements RowMapper<RelatedArticle> {

	    public RelatedArticle mapRow(ResultSet rs, int rowNum) throws SQLException {
	        RelatedArticle relArt= new RelatedArticle();
	        relArt.setId(rs.getInt("related_art_id"));
	        relArt.setTitle(rs.getString("art_title"));
	        relArt.setTitleWithoutSpaces(rs.getString("art_title_no_spaces"));
	        return relArt;
	    }
	}

}
