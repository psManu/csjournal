package com.psmanu.csjournal.core.service;

import java.util.List;

import com.psmanu.csjournal.core.entity.ExternalLink;

public interface ExternalLinkService {

	public List<ExternalLink> getExternalLinks(int id);
}
