package com.springS.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImpl implements TestDAO {

	@Inject
	private SqlSession sqlSession;
	private static String namespace="com.springS.dao.Mapper";
	
	@Override
	public int insertTest() {
		
		return sqlSession.insert(namespace+".memberId");
	}

	@Override
	public int deleteTest() {
		
		return sqlSession.delete(namespace+".deleteId");
	}

}
