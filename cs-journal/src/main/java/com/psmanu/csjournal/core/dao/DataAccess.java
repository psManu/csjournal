package com.psmanu.csjournal.core.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DataAccess {
	

	public JdbcTemplate db;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
	      
	      this.db = new JdbcTemplate(dataSource);
	}

}
