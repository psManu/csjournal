package com.psmanu.csjournal.core.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psmanu.csjournal.core.dao.RelatedArticleDAO;
import com.psmanu.csjournal.core.entity.RelatedArticle;
import com.psmanu.csjournal.core.service.RelatedArticleService;

@Service
public class RelatedArticleServiceImpl implements RelatedArticleService {

	@Autowired
	private RelatedArticleDAO relatedArticleDAO;
	
	public List<RelatedArticle> getRelatedArticles(int id) {
		
		return relatedArticleDAO.getRelatedArticles(id);
	}

}
