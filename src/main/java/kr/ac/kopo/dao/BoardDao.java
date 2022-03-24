package kr.ac.kopo.dao;

import java.util.List;

import kr.ac.kopo.model.Board;

public interface BoardDao {

	List<Board> list();

	void add(Board item);

	Board item(Long boardId);

	void update(Board item);

	void delete(Long boardId);

	void deleteTable(Long boardId);

	void createSeq(Long boardId);

	void deleteSeq(Long boardId);

	void createTable(Long boardId);

}
