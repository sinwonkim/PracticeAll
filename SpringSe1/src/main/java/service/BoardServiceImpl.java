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
	
	// insert   등록 리턴값x
	@Override
	public void regist(BoardVO board) throws Exception {
		dao.create(board);
	}
	
	// select  조회 리턴값 있음
	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
	}

	// update  수정 리턴값x
	@Override
	public void modify(BoardVO board) throws Exception {
		dao.update(board);

	}
	
	// delete 삭제 리턴값x
	@Override
	public void remove(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);
	}
	
	// 전체목록 조회 리턴값o
	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

}
