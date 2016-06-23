package com.psmanu.csjournal.core.service;

import java.util.List;

import com.psmanu.csjournal.core.entity.RelatedArticle;

public interface RelatedArticleService {

	public List<RelatedArticle> getRelatedArticles(int id);
}
