package com.prosper.dispatcher.service.service;

import com.prosper.dispatcher.service.bean.Article;
import com.prosper.dispatcher.service.dao.ArticleDao;
import com.prosper.dispatcher.service.exception.NotAllowedException;

public class ArticleService {

	private ArticleDao articleDao;
	
	public Article get(long articleId, long userId) {
		Article articleStored = articleDao.get(articleId);
		if (articleStored.getUserId() != userId) {
			throw new NotAllowedException();
		}
		return articleStored;
	}
	
	public void add(Article article, long userId) {
		articleDao.add(article, userId);
	}
	
	public void update(Article article, long userId) {
		Article articleStored = articleDao.get(article.getId());
		if (articleStored.getUserId() != userId) {
			throw new NotAllowedException();
		}
		articleDao.update(articleStored);
	}
	
	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
}
