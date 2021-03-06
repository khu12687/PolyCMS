package kr.ac.kopo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.ArticleDao;
import kr.ac.kopo.model.Article;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleDao dao;
	
	@Override
	public List<Article> list(Long boardId) {

		return dao.list(boardId);
	}

	@Override
	public void add(Article item) {
		dao.add(item);
	}

	@Override
	public Article item(Long boardId, Long articleId) {

		return dao.item(boardId, articleId);
	}

	@Override
	public void update(Article item) {
		dao.update(item);
		
	}

	@Override
	public void delete(Long boardId, Long articleId) {
		dao.delete(boardId, articleId);
		
	}

}
