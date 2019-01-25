package service;

import java.util.List;

import vo.BoardVO;

public interface BoardService {
	
	//insert
	public void regist(BoardVO board)throws Exception;
	
	//select
	public BoardVO read(Integer bno)throws Exception;
	
	//update
	public void modify(BoardVO board)throws Exception;
	
	//delete
	public void remove(Integer bno)throws Exception;
	
	//select 
	public List<BoardVO> listAll() throws Exception;
}
