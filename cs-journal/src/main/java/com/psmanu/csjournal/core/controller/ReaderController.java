package com.psmanu.csjournal.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psmanu.csjournal.core.entity.Article;
import com.psmanu.csjournal.core.entity.Category;
import com.psmanu.csjournal.core.entity.ExternalLink;
import com.psmanu.csjournal.core.entity.RelatedArticle;
import com.psmanu.csjournal.core.service.ArticleService;
import com.psmanu.csjournal.core.service.CategoryService;
import com.psmanu.csjournal.core.service.ExternalLinkService;
import com.psmanu.csjournal.core.service.RelatedArticleService;

@Controller
public class ReaderController {
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private RelatedArticleService relatedArticleService;
	
	@Autowired
	private ExternalLinkService externalLinkService;
	
	@RequestMapping("/")
	public String homePage(Model model){
		///Get Category List//
		List<Category> category_list = categoryService.fetchAllCategories();
		
		model.addAttribute("category_list", category_list);
		//////////////////////////////////////////////////
		
		///Get top articles////////////////////////////// Set parameter on this function is to get 1st set of 6 articles
		
		List<Article> art_list = articleService.getTopArticles(6, 1);
		model.addAttribute("art_list", art_list);
	    /////////////////////////////////////////////////
		return "index";
	}
	
	@RequestMapping("/cat/{cat_id}")
	public String getCategory(@PathVariable("cat_id") int cat_id, Model model){
		
		List<Article> art_list = categoryService.fetchAllInCategory(cat_id);
		model.addAttribute("art_list", art_list);
		model.addAttribute("category", categoryService.getCategory(cat_id));
		
		return "categoryArticles";
		
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String searchArticles(@RequestParam(value="search_param", defaultValue="") String search_param, Model model){
		

		List<Article> art_list = articleService.searchArticle(search_param);
		model.addAttribute("search_param", search_param);
		model.addAttribute("art_list", art_list);
		return "searchResults";
	}
	
	@RequestMapping("/uncat/{art_id}/{art_title_without_spaces}")
	public String readUncatArticle(@PathVariable("art_id") int art_id, Model model){
		
		Article article = articleService.fetchArticle(art_id);
		model.addAttribute("article", article);
		
		model.addAttribute("rel_articles", this.getRelatedArticles(art_id));
		
		model.addAttribute("ext_links", this.getExternalLinks(art_id));
		
		return "uncatArticle";
	}
	
	@RequestMapping("/cat/{cat_id}/{art_id}/{art_title_without_spaces}")
	public String readCatArticle(@PathVariable("cat_id") int cat_id, @PathVariable("art_id") int art_id, Model model){
		
		Article article = articleService.fetchArticle(art_id);
		model.addAttribute("article", article);
		
		List<Article> cat_articles = categoryService.fetchAllInCategory(cat_id);
		
		model.addAttribute("cat_articles", cat_articles);
		
		
		model.addAttribute("rel_articles", this.getRelatedArticles(art_id));
		
		model.addAttribute("ext_links", this.getExternalLinks(art_id));
		
		return "catArticle";
	}
	
	
	
	private List<RelatedArticle> getRelatedArticles(int art_id){
		return relatedArticleService.getRelatedArticles(art_id);
	}
	
	private List<ExternalLink> getExternalLinks(int art_id){
		return externalLinkService.getExternalLinks(art_id);
	}
	

	
	

}
