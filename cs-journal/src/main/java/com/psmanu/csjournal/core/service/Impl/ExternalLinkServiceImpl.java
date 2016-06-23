package com.psmanu.csjournal.core.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psmanu.csjournal.core.dao.ExternalLinkDAO;
import com.psmanu.csjournal.core.entity.ExternalLink;
import com.psmanu.csjournal.core.service.ExternalLinkService;

@Service
public class ExternalLinkServiceImpl implements ExternalLinkService {

	@Autowired
	private ExternalLinkDAO externalLinkDAO;
	
	public List<ExternalLink> getExternalLinks(int id) {
		
		return externalLinkDAO.getExternalLinks(id);
	}

}
