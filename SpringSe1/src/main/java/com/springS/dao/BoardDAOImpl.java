package com.springS.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	private static String namespace = "com.springS.dao.Mapper";
	
	// insert 생성 
	
	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert(namespace+".create", vo);

	}
	
	// select 
	@Override
	public BoardVO read(Integer bno) throws Exception {
		return sqlSession.selectOne(namespace+".read",bno);
	}

	// update
	@Override
	public void update(BoardVO vo) throws Exception {
		sqlSession.update(namespace+".update",vo);

	}

	// delete
	@Override
	public void delete(Integer bno) throws Exception {
		sqlSession.delete(namespace+".delete",bno);

	}

	// select 
	@Override
	public List<BoardVO> listAll() throws Exception {
		
		return sqlSession.selectList(namespace+".listAll");
	}

}
