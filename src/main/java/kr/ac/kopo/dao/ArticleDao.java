package kr.ac.kopo.dao;

import java.util.List;

import kr.ac.kopo.model.Article;

public interface ArticleDao {

	void add(Article item);

	Article item(Long boardId, Long articleId);

	void update(Article item);

	void delete(Long boardId, Long articleId);

	List<Article> list(Long boardId);

}
