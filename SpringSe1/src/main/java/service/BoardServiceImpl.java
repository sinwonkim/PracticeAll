package service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.springS.dao.BoardDAO;

import vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;
	
	// insert    c
	@Override
	public void regist(BoardVO board) throws Exception {
		dao.create(board);
	}
	
	// select  r
	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	// update  u
	@Override
	public void modify(BoardVO board) throws Exception {
		// TODO Auto-generated method stub

	}
	
	// delete d
	@Override
	public void remove(Integer bno) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

}
