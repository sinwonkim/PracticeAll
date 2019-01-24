package com.springS.dao;

import java.util.List;

import vo.BoardVO;

public interface BoardDAO {

	// INSERT
	public void create(BoardVO vo)throws Exception;
	
	// SELECT
	public BoardVO read(Integer bno)throws Exception;
	
	//	UPDATE
	public void update(BoardVO vo)throws Exception;
	
	// DELETE
	public void delete(Integer bno)throws Exception;
	
	// LIST 
	public List<BoardVO> listAll() throws Exception;
	
	
}
