package com.psmanu.csjournal.core.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psmanu.csjournal.core.dao.DataAccess;
import com.psmanu.csjournal.core.dao.ExternalLinkDAO;
import com.psmanu.csjournal.core.entity.ExternalLink;

@Repository
public class ExternalLinkDAOImpl extends DataAccess implements ExternalLinkDAO {

	
	
	String sql = "";
	
	
	
	@Override
	public List<ExternalLink> getExternalLinks(int art_id) {
		
		sql = "SELECT ext_links.ext_link_id, ext_links.ext_link_name, ext_links.ext_link " +
			  "FROM art_ext_links, ext_links " +
			  "WHERE art_ext_links.ext_link_id=ext_links.ext_link_id " +
			  "AND art_ext_links.art_id=?";
		
		return db.query(sql, new Object[]{art_id}, new ExternalLinkMapper());
				
	}
	
	private static final class ExternalLinkMapper implements RowMapper<ExternalLink> {

	    public ExternalLink mapRow(ResultSet rs, int rowNum) throws SQLException {
	        ExternalLink extLink = new ExternalLink();
	        extLink.setId(rs.getInt("ext_link_id"));
	        extLink.setName(rs.getString("ext_link_name"));
	        extLink.setUrl(rs.getString("ext_link"));
	        return extLink;
	    }
	}

}
