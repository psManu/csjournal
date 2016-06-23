package com.psmanu.csjournal.core.dao;

import java.util.List;

import com.psmanu.csjournal.core.entity.ExternalLink;

public interface ExternalLinkDAO {
	
	public List<ExternalLink> getExternalLinks(int id);

}
