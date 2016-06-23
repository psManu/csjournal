package com.psmanu.csjournal.core.dao;

import java.util.List;

import com.psmanu.csjournal.core.entity.RelatedArticle;

public interface RelatedArticleDAO {

	public List<RelatedArticle> getRelatedArticles(int id);
}
